# Insider Careers Automation


Bu proje, [Insider](https://useinsider.com/) web sitesindeki **Kariyer** sayfasının ve iş başvuru sürecinin otomasyon testlerini içermektedir.  
Testler **Java**, **Selenium WebDriver**, ve **Page Object Model (POM)** mimarisi kullanılarak geliştirilmiştir.

---

## 🎯 Amaçlar

- Insider ana sayfasının başarıyla açıldığını doğrulama
- Navigasyondan "Company > Careers" adımına giderek kariyer sayfasını kontrol etme
- **Locations**, **Teams**, ve **Life at Insider** bloklarının görünüp görünmediğini test etme
- QA (Quality Assurance) pozisyonlarını **Istanbul, Turkey** ve **Quality Assurance** filtresiyle listeleme
- Listelenen her işin doğru lokasyon, departman ve başlık içerdiğini doğrulama
- "View Role" butonuna tıklanınca Lever başvuru sayfasına yönlendirme yapıldığını kontrol etme

---

## 🛠 Kullanılan Teknolojiler

- Java 22
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- SLF4J + Logback (Logging için)

---

## 📁 Proje Yapısı

```
mucahit-selcuk-case
│
├── src
│   ├── main
│   │   └── java
│   │   ├── base            # Temel yapıların yer aldığı sınıflar (örneğin BaseTest, StepInit vb.)
│   │   ├── driver          # Driver yönetimi (DriverManager)
│   │   ├── pages           # Sayfa nesne modeli sınıfları (POM)
│   │   ├── reusablemethods # Ortak kullanılabilir metotlar ve Logger sınıfı
│   │   └── steps           # Adım tanımlamaları (test senaryolarında kullanılan adımlar)
│   ├──test
│   │    └── java
│   │        └── tests            # Test sınıfları
│   └── resources                 #log4j2 konfigürasyon doyası       
│
├── pom.xml
└── README.md
```

---

## ▶️ Testleri Çalıştırmak

1. Projeyi klonla:
   ```bash
   git clone https://github.com/mucahitselcuk/mucahit-selcuk-case.git
   cd mucahit-selcuk-case
   ```

2. Maven bağımlılıklarını yükle:
   ```bash
   mvn clean install
   ```

3. Testleri çalıştır:
   ```bash
   mvn test
   ```

---

## License

This project is licensed under the [MIT License](LICENSE.md) © 2025 Mücahit Selçuk.
