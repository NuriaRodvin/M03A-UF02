// Importamos las clases necesarias para el programa
//clase Main
//clase perfil

import java.util.Scanner; // Para leer lo que escribe el usuario
import java.util.Arrays;  // Para manejar listas de datos como hobbies y comidas

// Creamos la clase principal donde estará nuestro programa
public class Main {

    // Este es el punto de entrada del programa. Aquí empieza todo
    public static void main(String[] args) {

        // Creamos el perfil de Nuria con sus hobbies, comidas y datos curiosos
        Perfil myProfile = new Perfil(
                "Nuria Rodríguez", // Nombre
                "Me gusta disfrutar de la vida rural y compartir momentos con mis dos perros.", // Historia
                Arrays.asList("📺 Ver televisión", "🍴 Comer", "🚶‍♀️ Pasear"), // Hobbies
                Arrays.asList("🍝 Pasta", "🍲 Cocido madrileño", "🍫 Chocolates"), // Comidas favoritas
                Arrays.asList("🎓 Me gustaría aprobar el FP", "🐕 Tengo 2 perros", "🌄 Me gusta la vida rural") // Datos curiosos
        );

        // Creamos un Scanner para leer las opciones del usuario
        Scanner scanner = new Scanner(System.in);

        // Variable para guardar la opción que elige el usuario
        int option;

        // Creamos un bucle que muestra el menú hasta que el usuario elija salir
        do {
            // MOSTRAR EL MENÚ
            System.out.println("********** Menu Sobre mi **********");
            System.out.println("1. Ver mi historia 📖");
            System.out.println("2. Ver mis favoritos 🌟");
            System.out.println("3. Ver un dato curioso 🤔");
            System.out.println("4. Ver todo el perfil 📋");
            System.out.println("5. Salir 🚪");
            System.out.print("Elige una opción (1-5): ");

            // Validamos que el usuario escriba un número
            while (!scanner.hasNextInt()) {
                System.out.println("⚠️ ERROR: Por favor, ingresa un número válido.");
                scanner.next(); // Limpiamos la entrada inválida
            }

            // Guardamos la opción ingresada por el usuario
            option = scanner.nextInt();

            // Aquí decidimos qué hacer según la opción elegida
            switch (option) {
                case 1: // Opción 1: Mostrar la historia
                    System.out.println("📖 Mi Historia:");
                    System.out.println(myProfile.getFormattedStory());
                    break;
                case 2: // Opción 2: Mostrar hobbies y comidas favoritas
                    System.out.println("🌟 Mis Favoritos:");
                    System.out.println(myProfile.getFormattedFavorites());
                    break;
                case 3: // Opción 3: Mostrar un dato curioso
                    System.out.println("🤔 Un Dato Curioso:");
                    System.out.println(myProfile.getRandomFunFact());
                    break;
                case 4: // Opción 4: Mostrar todo el perfil
                    System.out.println("📋 Todo Sobre Mí:");
                    System.out.println(myProfile.getFormattedStory());
                    System.out.println(myProfile.getFormattedFavorites());
                    System.out.println(myProfile.getRandomFunFact());
                    break;
                case 5: // Opción 5: Salir del programa
                    System.out.println("🚪 ¡Gracias por usar el programa! Adiós. 👋");
                    break;
                default: // Opción inválida (no debería pasar si validamos bien)
                    System.out.println("⚠️ ERROR: Opción no válida, intenta de nuevo.");
            }

        } while (option != 5); // Repetimos mientras el usuario no elija salir

        // Cerramos el Scanner para liberar recursos
        scanner.close();
    }
}