package br.com.senai.automacao;
import org.eclipse.paho.client.mqttv3.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String broker = "tcp://broker.hivemq.com:1883";
        String topico = "senai/julia/motor/dados";

        MqttClient client = new MqttClient(broker, MqttClient.generateClientId());
        client.connect();

        System.out.println("Conectado! Aguardando dados...");

        client.subscribe(topico, (topic, msg) -> {
            String payload = new String(msg.getPayload());
            System.out.println("Dados coletados com sucesso: [" + payload + "]");
        });
    }
}

