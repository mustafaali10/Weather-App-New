# 🌦️ WeatherApp — Jetpack Compose MVVM Android Project

_A modern Android weather application built with Jetpack Compose, Kotlin, and OpenWeather API._

---

## 🔍 Overview

This project is a fully functional **Weather App** developed following professional Android development practices using **Jetpack Compose** and **MVVM architecture**.  
It fetches real-time weather data from the **OpenWeather API**, processes it using **Retrofit**, and displays it through a clean, responsive UI.  

This project demonstrates skills in **Android app architecture, state management, API integration, and UI design** — reflecting strong Android development fundamentals and production-ready code quality.

---

## 🎥 Reference

📺 **Tutorial Source:** [Build a Complete Weather App with Jetpack Compose & MVVM](https://www.youtube.com/watch?v=Kn6vUH1uJT4&t=2146s)  
Based on this tutorial, I implemented my own version with enhancements and design refinements.

---

## 🛠️ Technologies Used

| Layer | Technology | Purpose & Highlights |
|-------|-------------|----------------------|
| **Language** | Kotlin | Primary development language for Android — concise, safe, and expressive. |
| **UI Framework** | Jetpack Compose | Declarative UI toolkit providing modern, reactive, and flexible UI design. |
| **Architecture** | MVVM (Model-View-ViewModel) | Clean architecture pattern separating logic, data, and UI layers for scalability. |
| **Networking** | Retrofit + OkHttp + Gson | API integration layer for network calls and JSON serialization. |
| **State Management** | ViewModel + LiveData + Compose State | Lifecycle-aware architecture for smooth UI updates. |
| **Dependency Injection** | Hilt (Dagger) | Simplifies dependency management and improves testability. |
| **Asynchronous Tasks** | Kotlin Coroutines + Flow | Efficient async operations for API requests and UI updates. |
| **Local Storage** | Room (optional) | Caching data locally for offline support. |
| **Version Control** | Git + GitHub | Complete Git workflow for collaboration and version management. |

---

## 🧩 Architecture & Workflow

1. **User enters city name** → triggers a Retrofit API call.  
2. **Repository** layer handles the network logic.  
3. **ViewModel** receives parsed weather data, updates Compose state.  
4. **Compose UI** reacts automatically to state changes and displays weather data dynamically.  
5. (Optional) **Room** or local cache ensures offline access.

---

## 📈 Infrastructure Diagram

*(Leave space below for diagram — you can paste a screenshot or insert a Mermaid diagram later)*

```mermaid
graph TD
    A[User Input: City Name] --> B[ViewModel]
    B --> C[Repository]
    C --> D[Retrofit API Call]
    D --> E[OpenWeather API]
    E --> F[JSON Response]
    F --> G[Data Model]
    G --> H[Compose UI Updates]
    H --> I[Display Weather Data]
