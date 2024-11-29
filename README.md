# 🌟 Perfil de Usuario - Aplicación "Sobre Mi"

### 📝 Descripción

Este proyecto implementa una clase Java llamada **`Perfil`** que permite gestionar la información de un usuario dentro de la aplicación **"About Me"**. Es ideal para almacenar datos personales como nombre, historia, aficiones, comidas favoritas y datos curiosos. Además, ofrece métodos para presentar esta información de forma clara y divertida.

---

## 🎯 Características principales

- **Atributos personalizados**:
  - 🧑‍🦱 **Nombre (`name`)**: Nombre del usuario.
  - 📜 **Historia (`story`)**: Una descripción corta sobre el usuario.
  - 🎨 **Aficiones (`hobbies`)**: Una lista con actividades favoritas.
  - 🍕 **Comidas favoritas (`foods`)**: Alimentos que el usuario prefiere.
  - 💡 **Datos curiosos (`funFacts`)**: Pequeñas curiosidades del usuario.

- **Métodos útiles**:
  - 📤 Recuperar datos individuales del perfil (`getName`, `getStory`, etc.).
  - 📖 Mostrar la historia del usuario en un formato atractivo (`getFormattedStory`).
  - 📋 Presentar aficiones y comidas favoritas de forma organizada (`getFormattedFavorites`).
  - 🎲 Seleccionar un dato curioso aleatorio (`getRandomFunFact`).

---

## 🚀 Cómo usarlo

### 🔧 Requisitos

- Tener instalado **Java 8** o superior.

### 🛠️ Pasos para usar la clase:

1. **Crear un objeto `Perfil`**: Inicializa un perfil con los datos del usuario:
   ```java
   List<String> hobbies = List.of("ejemplo1", "ejemplo2", "ejemplo3");
   List<String> foods = List.of("ejemplo1", "ejemplo2", "ejemplo3");
   List<String> funFacts = List.of("ejemplo1", "ejemplo2");

   Perfil perfil = new Perfil(ejemplos);

   
Acceder a la información:

Mostrar la historia:  System.out.println(perfil.getFormattedStory());
Presentar hobbies y comidas favoritas: System.out.println(perfil.getFormattedFavorites());
Obtener un dato curioso al azar: System.out.println(perfil.getRandomFunFact());

📂 Estructura del proyecto

📁 src/
   ├── 📄 Perfil.java   // Clase principal con la definición del perfil.
📄 README.md            // Documentación del proyecto.
💻 Ejemplo de salida


Al ejecutar el código anterior, se puede obtener un resultado como este:

Mi historia: ejemplo.
Aficiones: ejemplos
Foods: ejemplos
Curiosidades: ejemplo



🤝 Cómo contribuir
¡Todos son bienvenidos a contribuir! Si tienes ideas para mejorar este proyecto:

Haz un fork del repositorio.
Crea una rama para tus cambios (git checkout -b mi-nueva-funcionalidad).
Haz un commit (git commit -m "Añadida nueva funcionalidad").
Envía un pull request.


📜 Licencia
Este proyecto está licenciado bajo la licencia MIT, lo que significa que puedes usarlo, modificarlo y distribuirlo libremente. Consulta el archivo LICENSE para más detalles.
