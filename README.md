## Monitoramento de Motor
## ESP32 + Java com MQTT
## Descrição

Sistema de monitoramento em tempo real utilizando ESP32 para coleta de dados e Java para recepção das informações via protocolo MQTT.

## Funcionamento
ESP32 (C++)

Leitura de temperatura (DHT22)

Leitura de vibração (potenciômetro)

Leitura de corrente (potenciômetro)

Envio dos dados via MQTT

Java (Backend)

Conexão com broker HiveMQ

Inscrição no tópico MQTT

Exibição dos dados no console

## Tópico utilizado:

senai/julia/motor/dados

## Arquitetura

ESP32 → Broker HiveMQ → Aplicação Java

Modelo de comunicação: Publish / Subscribe (MQTT)

## Tecnologias Utilizadas

ESP32
C++
Java
MQTT
Eclipse Paho
HiveMQ
Wokwi

## Execução
Firmware

Abrir no Arduino IDE ou Wokwi e realizar upload para o ESP32.

Aplicação Java

Abrir no IntelliJ e executar a classe Main.

## Finalidade

Projeto acadêmico voltado à integração entre hardware e software em um contexto de monitoramento industrial utilizando IoT.
