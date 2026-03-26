# 🎧 Playlist & Recommendation Service

A scalable **Spring Boot REST API** for managing playlists and generating song recommendations using modern backend design principles like **SOLID**, **Strategy Pattern**, **Observer Pattern**, **Rate Limiting**, and **Redis Caching (Cache-Aside Pattern)**.

---

## 🚀 Features

* 🎵 Playlist Management (CRUD APIs)
* 🤖 Recommendation System (Multiple Algorithms)
* ⚡ Redis Cache-Aside Pattern for performance
* 🚦 API Rate Limiting (Token Bucket Algorithm)
* 🧩 SOLID Principles for clean architecture
* 🔄 Strategy Pattern for dynamic recommendation logic
* 🔔 Observer Pattern for notifications
* 🧪 Tested using Postman / REST clients

---

## 🏗️ Project Architecture

```
playlist-recommendation-service/
│
├── controller/        # REST API endpoints
├── service/           # Business logic
├── repository/        # Data access layer
├── config/            # Configuration classes
├── cache/             # Redis cache implementation
├── strategy/          # Recommendation algorithms
├── observer/          # Notification system
├── model/             # Entities and DTOs
└── PlaylistApplication.java
```

---

## 🛠️ Tech Stack

* **Backend:** Java, Spring Boot
* **Caching:** Redis
* **Build Tool:** Maven
* **API Testing:** Postman
* **Database:** In-memory (HashMap) / Optional MySQL

---

## ⚙️ Setup & Installation

### 1️⃣ Clone the repository

```bash
git clone https://github.com/your-username/playlist-recommendation-service.git
cd playlist-recommendation-service
```

### 2️⃣ Start Redis (Required for caching)

```bash
redis-server
```

### 3️⃣ Run the application

```bash
mvn spring-boot:run
```

OR run directly from IDE:

* Open `PlaylistServiceApplication.java`
* Click ▶ RUN

---

## 🌐 API Endpoints

### 📌 Playlist APIs

| Method | Endpoint              | Description     |
| ------ | --------------------- | --------------- |
| POST   | `/api/playlists`      | Create playlist |
| GET    | `/api/playlists/{id}` | Get playlist    |
| PUT    | `/api/playlists/{id}` | Update playlist |
| DELETE | `/api/playlists/{id}` | Delete playlist |

---

### 🤖 Recommendation APIs

| Method | Endpoint                      | Description             |
| ------ | ----------------------------- | ----------------------- |
| GET    | `/api/recommend?type=collab`  | Collaborative filtering |
| GET    | `/api/recommend?type=content` | Content-based           |
| GET    | `/api/recommend?type=popular` | Popular songs           |

---

### 🚦 Rate Limiting API

| Method | Endpoint                 | Description             |
| ------ | ------------------------ | ----------------------- |
| GET    | `/api/rate?user=user123` | Check request allowance |

---

## 🧪 Sample Requests

### ➤ Create Playlist

```json
POST /api/playlists
{
  "name": "My Favorite Songs",
  "userId": "user123",
  "songIds": ["song1", "song2"]
}
```

---

### ➤ Get Playlist

```
GET /api/playlists/{id}
```

---

### ➤ Get Recommendations

```
GET /api/recommend?type=collab
```

---

## ⚡ Performance Optimization

* 🔹 Redis caching reduces database load
* 🔹 Cache hit vs miss improves response time
* 🔹 Rate limiting prevents API abuse

---

## 📊 Design Patterns Used

### 🔸 Strategy Pattern

Used to switch between recommendation algorithms dynamically.

### 🔸 Observer Pattern

Used to notify users on playlist updates (Email/Push).

---

## 🧠 Key Concepts Learned

* REST API Design
* Caching (Redis)
* Rate Limiting
* Scalable Backend Architecture
* Design Patterns in real-world systems

---

## 📸 Screenshots (Optional)

> Add your Postman and console screenshots here

---

## 🤝 Contributing

Pull requests are welcome! For major changes, please open an issue first.

---

## 📜 License

This project is for educational purposes.

---

## 👨‍💻 Author

**Nandan Kumar**
B.Tech IT | Backend Developer | DevOps Enthusiast

---

⭐ If you found this useful, consider giving a star!
