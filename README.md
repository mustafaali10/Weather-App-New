# 🌦️ WeatherApp- Jetpack Compose MVVM Android Project

Minimalist Weather App using Kotlin


![WhatsApp Image 2025-10-25 at 10 24 33 PM](https://github.com/user-attachments/assets/6b37969f-eacc-4c62-a732-574a071cb1c6)  ![WhatsApp Image 2025-10-25 at 10 24 33 PM (1)](https://github.com/user-attachments/assets/c6d260c8-bdc1-4b73-8154-6ab6f77073c9)


---

## 🔍 Overview

This project is a fully functional **Weather App** developed following professional Android development practices using **Jetpack Compose** and **MVVM architecture**.  
It fetches real-time weather data from the **FreeWeatherAPI**, processes it using **Retrofit**, and displays it through a clean, responsive UI.  

This project demonstrates skills in **Android app architecture, State management, API Integration, and UI design**.
---
---

## 🛠️ Technologies Used

| Layer | Technology | Purpose & Highlights |
|-------|-------------|----------------------|
| **Language** | Kotlin | Primary development language for Android — concise, safe, and expressive. |
| **UI Framework** | Jetpack Compose | Declarative UI toolkit providing modern, reactive, and flexible UI design. |
| **Architecture** | MVVM (Model-View-ViewModel) | Clean architecture pattern separating logic, data, and UI layers for scalability. |
| **Networking** | Retrofit + OkHttp + Gson | API integration layer for network calls and JSON serialization. |
| **State Management** | ViewModel + LiveData + Compose State | Lifecycle-aware architecture for smooth UI updates. |
| **Asynchronous Tasks** | Kotlin Coroutines + Flow | Efficient async operations for API requests and UI updates. |
| **Version Control** | Git + GitHub | Complete Git workflow for collaboration and version management. |

---

## 🧩 Architecture & Workflow

1. **User enters city name** → triggers a Retrofit API call.  
2. **Repository** layer handles the network logic.  
3. **ViewModel** receives parsed weather data, updates Compose state.  
4. **Compose UI** reacts automatically to state changes and displays weather data dynamically.  

---

## 📈 Architecture Diagram
<img width="2642" height="2257" alt="Weather App Architecture" src="https://github.com/user-attachments/assets/a63cc38e-0ba8-4b59-bf52-2d150fd02c02" />
