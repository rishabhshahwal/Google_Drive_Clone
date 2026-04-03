<div align="center">

# ☁️ Google Drive Clone

### A full-stack cloud file management application inspired by Google Drive.
Upload, download, organize, and manage files through a clean React interface — powered by a Spring Boot REST API and MySQL database.

<br/>

[![React](https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB)](https://reactjs.org)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org)
[![Axios](https://img.shields.io/badge/Axios-5A29E4?style=for-the-badge&logo=axios&logoColor=white)](https://axios-http.com)

<br/>

🚧 **Live Demo: Coming Soon (Deployment in progress)**  
📂 **GitHub Repository:** https://github.com/rishabhshahwal/Google_Drive_Clone

</div>

---

## 📌 Overview

**Google Drive Clone** is a full-stack web application that replicates the core file management experience of Google Drive. Users can upload files into a folder-based structure, download or delete them, and manage everything through an intuitive React UI. File metadata is persisted in MySQL, while the Spring Boot backend exposes clean RESTful APIs to handle all operations.

This project demonstrates end-to-end full-stack development — from database schema design and REST API development to React component architecture and HTTP communication via Axios.

---

## 🚀 Key Highlights

- Built a full-stack file management system handling file upload, download, and deletion
- Designed RESTful APIs using Spring Boot with efficient database integration
- Implemented folder-based hierarchical storage system
- Integrated React frontend with backend using Axios for seamless communication
- Managed file storage and metadata synchronization between server and database

---
## ✨ Features
 
- 📤 File Upload  
- 📥 File Download  
- 🗑️ File Deletion  
- 📁 Folder Structure Support  
- 🗄️ MySQL Metadata Storage  
- 🖥️ Clean File Manager UI  
- 🔗 REST API Integration  
 
---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| **Frontend** | React.js, Axios, CSS3 |
| **Backend** | Java, Spring Boot, Spring MVC, Spring Data JPA |
| **Database** | MySQL |
| **Build Tool** | Maven |
| **API Style** | RESTful |

---

## 📂 Project Structure

```
Google_Drive_Clone/
│
├── Backend/                          # Spring Boot REST API
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── com/gdrive/
│   │       │       ├── controller/   # REST Controllers
│   │       │       ├── service/      # Business Logic
│   │       │       ├── repository/   # JPA Repositories
│   │       │       └── model/        # Entity Classes
│   │       └── resources/
│   │           └── application.properties
│   └── pom.xml
│
└── Frontend/                         # React Application
    ├── public/
    ├── src/
    │   ├── components/               # Reusable UI Components
    │   ├── pages/                    # Page-level Components
    │   ├── services/                 # Axios API Calls
    │   └── App.js
    └── package.json
```

---

## 🚀 Installation & Setup

### Prerequisites

Ensure the following are installed on your system:

| Tool | Version |
|------|---------|
| Java | 11+ |
| Maven | 3.6+ |
| Node.js & npm | 16+ |
| MySQL | 8.0+ |

---

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/rishabhshahwal/Google_Drive_Clone.git
cd Google_Drive_Clone
```

---

### 2️⃣ Configure the Database

Log into MySQL and create the database:

```sql
CREATE DATABASE drive_backend;
```

Then open `Backend/src/main/resources/application.properties` and update your credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/gdrive_clone
spring.datasource.username=YOUR_MYSQL_USERNAME
spring.datasource.password=YOUR_MYSQL_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 3️⃣ Start the Backend

```bash
cd Backend

# Build and run the Spring Boot application
mvn clean install
mvn spring-boot:run
```

> ✅ Backend starts at **`http://localhost:3000`**

---

### 4️⃣ Start the Frontend

Open a **new terminal window**, then:

```bash
cd Frontend

# Install dependencies
npm install

# Start the React development server
npm start
```

> ✅ Frontend opens at **`http://localhost:3000`** (React auto-selects an available port)

---

### ⚡ Quick Start Summary

| Service | Command | URL |
|---------|---------|-----|
| Backend | `cd Backend && mvn spring-boot:run` | `http://localhost:3000` |
| Frontend | `cd Frontend && npm install && npm start` | `http://localhost:3000` |

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/api/files` | Retrieve all files and folders |
| `GET` | `/api/files/{id}` | Get metadata for a specific file |
| `POST` | `/api/files/upload` | Upload a new file |
| `GET` | `/api/files/download/{id}` | Download a file by ID |
| `DELETE` | `/api/files/{id}` | Delete a file by ID |
| `POST` | `/api/folders` | Create a new folder |
| `GET` | `/api/folders` | List all folders |
| `DELETE` | `/api/folders/{id}` | Delete a folder by ID |

---

## 📸 UI

<img width="1897" height="907" alt="Screenshot 2026-04-03 103815" src="https://github.com/user-attachments/assets/d992f03f-442d-41da-8dda-4046907f908d" />


## File Uploaded

<img width="1898" height="905" alt="Screenshot 2026-04-03 103935" src="https://github.com/user-attachments/assets/5c5e9bdb-99d2-41af-b6c8-fa175086f2e5" />


---

## 🔮 Future Improvements

- Authentication (JWT)
- File sharing system
- Drag & drop upload
- File preview (PDF/Image)
- Cloud storage (AWS S3)

---


## 👨‍💻 Author

<div align="center">

**Rishabh Kumar Shahwal**

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/rishabhshahwal)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](#)

</div>

---

<div align="center">
  <sub>⭐ If you found this project helpful, consider giving it a star on GitHub!</sub>
</div>
