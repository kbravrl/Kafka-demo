# Kafka-demo

Basit bir Spring Boot uygulaması ile Docker Compose üzerinden ayağa kaldırılmış bir Kafka broker’a mesaj gönderip tüketmeyi gösterir.

## Özellikler

- Uygulama başladığında `CommandLineRunner` ile `"Kafka-demo"` topiğine 0’dan 99’a kadar 100 adet mesaj üretir.  
- `/api/v1/messages` endpoint’ine gelen POST istekleri ile dinamik olarak mesaj yayınlayabilirsiniz.  
- Docker Compose ile ZooKeeper + Kafka broker’ı tek komutla ayağa kaldırır.

## Önkoşullar

- Java 17+  
- Maven veya Gradle  
- Docker & Docker Compose  

## Kurulum ve Çalıştırma

1. **Kafka’yı başlatın**  
   Proje kökünde:
   ```bash
   docker-compose up -d
