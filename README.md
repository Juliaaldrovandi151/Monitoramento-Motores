Monitoramento de Motor com ESP32 e Java (MQTT)

Sistema de monitoramento em tempo real utilizando ESP32 para coleta de dados e Java para recepção via protocolo MQTT.

Sobre o projeto

O ESP32 realiza a leitura de:

Temperatura (DHT22)

Vibração (potenciômetro)

Corrente (potenciômetro)

Os dados são enviados via MQTT para o broker público HiveMQ e recebidos por uma aplicação Java que exibe as informações no console.

Tópico utilizado:

senai/julia/motor/dados
Arquitetura

ESP32 (C++) → Broker HiveMQ → Java (Eclipse Paho)

Comunicação baseada no modelo publish/subscribe.

Tecnologias

ESP32

C++

Java

MQTT

Eclipse Paho

HiveMQ

Wokwi

Como executar
ESP32

Abrir no Wokwi

Instalar bibliotecas necessárias

Fazer upload do firmware

Java

Abrir no IntelliJ

Verificar dependência do Paho no pom.xml

Executar a classe Main

Objetivo

Demonstrar a integração entre hardware e software em um sistema de monitoramento utilizando arquitetura IoT.
