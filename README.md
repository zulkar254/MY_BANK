# 💳 Banking System Application with Razorpay Integration

A **Full Stack Banking System** built using **Spring Boot**, **React**, **Oracle Database**, and **Razorpay** for secure online payments.

This project demonstrates how to build a modern end-to-end banking application that includes:
- User registration & login with JWT authentication
- Account management and transaction handling
- Razorpay payment integration (frontend + backend)
- Secure API communication with Spring Security
- CI/CD-ready Docker setup (coming soon)

---

## 🚀 Tech Stack

### 🖥️ Frontend
- React.js (v19)
- Axios for REST API calls
- Tailwind CSS for styling
- Razorpay Checkout Integration

### ⚙️ Backend
- Spring Boot (v3+)
- Spring Security + JWT Authentication
- Hibernate + JPA
- Oracle Database

### 🧰 Tools & Deployment
- Maven
- Docker (for containerization)
- GitHub Actions (CI/CD – planned)

---

## 🏦 Features

| Module | Description |
|--------|--------------|
| 👤 **Authentication** | User registration, login, JWT-based auth |
| 🏦 **Bank Account** | Create, view, and manage bank accounts |
| 💰 **Transactions** | Debit, credit, and transfer operations |
| 💳 **Razorpay Payments** | Secure online payment integration |
| 📊 **Dashboard (Recharts)** | Visual transaction summary charts |
| 🔐 **Security** | Role-based access with Spring Security |

---

---

## 🧠 API Endpoints (Sample)

| Endpoint | Method | Description |
|-----------|--------|--------------|
| `/api/auth/register` | POST | Register a new user |
| `/api/auth/login` | POST | Login and get JWT token |
| `/api/accounts/user` | GET | Get account details for logged-in user |
| `/api/payment/create-order` | POST | Create Razorpay payment order |
| `/api/payment/verify` | POST | Verify payment signature |

---

## 💵 Razorpay Integration Flow

1. **Frontend** calls backend `/api/payment/create-order` with amount.
2. **Backend (Spring Boot)** creates Razorpay order via API and returns order ID.
3. **Frontend (React)** opens Razorpay checkout using order ID.
4. On successful payment, Razorpay sends payment ID + signature.
5. **Frontend** calls `/api/payment/verify` to confirm payment.
6. **Backend** verifies signature and updates user transaction table.

---

## 🧩 Environment Setup

### 1️⃣ Backend Setup
```bash
cd backend
mvn clean install
mvn spring-boot:run
🧑‍💻 Author

Zulkar Naine Alam
💼 Java Developer | 3+ years experience
📍 Hyderabad, India
📧 zulkardbg1458@gmail.com

📞 6204658549
🌐 GitHub Profile
## 🔧 Project Structure

