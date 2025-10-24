# 🏥 HealthCare Management System

⚙️ Features

✅ Simple Secure Staff Register & Login
✅ Manage Patient Medical Records (CRUD)
✅ Use Solid Principle & Vioalate Code Smells
✅ JUnit Testing
✅ Scan Health Card (QR Integration Ready)
✅ Performance Analytics Dashboard
✅ Search & Filter Patients
✅ System Settings Management
✅ Beautiful UI with Light & Gradient Theme

A **full-stack web application** designed for managing patients, staff, and medical records in a healthcare facility.  
The system offers secure authentication, user-friendly dashboards, and complete CRUD functionality — built using:

- **Backend:** Java Spring Boot  
- **Database:** MySQL  
- **Frontend:** React  
- **Testing:** JUnit  

---

## 🚀 Tech Stack

| Layer | Technology |
|--------|-------------|
| **Frontend** | React, React Router, Axios, CSS |
| **Backend** | Java Spring Boot |
| **Database** | MySQL |
| **Testing** | JUnit 5, Mockito, Spring Boot Test |
| **Build Tool** | Maven |
| **Version Control** | Git & GitHub |

---

## 🩺 Project Overview

The **HealthCare Management System** simplifies the process of managing hospital patients records.  
It allows healthcare professionals to maintain patient records & treatment plan

The system includes:
- Simple Secure **staff authentication**
- Easy **record management**
- **Data visualization** and performance analytics
- Sample Intuitive and modern **UI/UX design**

---

## ✨ Features

### 🔧 Backend (Spring Boot)
- RESTful API endpoints for all core modules  
- Authentication and Authorization (Staff Login)  
- Patient & Medical Record CRUD  
- Exception Handling and Validation  
- MySQL database integration  
- DTO and Service layer separation (clean architecture)

### 💻 Frontend (React)
- Interactive dashboard and navigation  
- Secure login and session storage  
- Fully responsive UI  
- Modern design using CSS and gradient themes  
- Dynamic routing using React Router  
- Analytics charts and reports (using Chart.js)

### 🧪 Testing (JUnit)
- Unit and Integration testing with **JUnit 5**  
- Mocking dependencies using **Mockito**  
- Controller and Service layer test coverage  
- Continuous Integration ready with GitHub Actions  

---

---

## ⚙️ Backend Setup (Spring Boot + MySQL)

 Clone the repository  

    ```bash
   git clone https://github.com/your-username/HealthCare.git
   cd HealthCare/backend
spring.datasource.url=jdbc:mysql://localhost:3306/healthcare_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

mvn clean install
mvn spring-boot:run

---

## 💻 Frontend Setup (React)

cd ../frontend
npm install
npm start

---

## 🧪 Testing — JUnit Integration

Frameworks Used
JUnit 5 (Jupiter) — for unit tests
Mockito — for mocking service and repository dependencies
Spring Boot Test — for integration testing

