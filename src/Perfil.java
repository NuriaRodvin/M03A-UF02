import java.util.List;

public class Perfil {
    // Atributos privados para almacenar la información personal del perfil
    private String nombre;  // Nombre del perfil
    private String historia;  // Historia personal
    private List<String> hobbies;  // Lista de hobbies del perfil
    private List<String> comidasFavoritas;  // Lista de comidas favoritas
    private List<String> datosCuriosos;  // Lista de datos curiosos

    // Constructor que inicializa los atributos del perfil
    public Perfil(String nombre, String historia, List<String> hobbies, List<String> comidasFavoritas, List<String> datosCuriosos) {
        this.nombre = nombre;  // Inicializa el nombre
        this.historia = historia;  // Inicializa la historia
        this.hobbies = hobbies;  // Inicializa la lista de hobbies
        this.comidasFavoritas = comidasFavoritas;  // Inicializa la lista de comidas favoritas
        this.datosCuriosos = datosCuriosos;  // Inicializa la lista de datos curiosos
    }

    // Método que devuelve la historia del perfil formateada
    public String getFormattedStory() {
        return "Historia: " + historia;  // Retorna la historia con un prefijo "Historia: "
    }

    // Método que devuelve los hobbies y comidas favoritas formateados
    public String getFormattedFavorites() {
        StringBuilder favorites = new StringBuilder();
        favorites.append("Hobbies:\n");  // Agrega un título para los hobbies
        for (String hobby : hobbies) {  // Itera sobre la lista de hobbies
            favorites.append("- ").append(hobby).append("\n");  // Agrega cada hobby con una viñeta
        }
        favorites.append("Comidas favoritas:\n");  // Título para las comidas favoritas
        for (String food : comidasFavoritas) {  // Itera sobre la lista de comidas favoritas
            favorites.append("- ").append(food).append("\n");  // Agrega cada comida con una viñeta
        }
        return favorites.toString();  // Retorna la cadena de texto formateada
    }

    // Método que devuelve un dato curioso aleatorio
    public String getRandomFunFact() {
        int randomIndex = (int) (Math.random() * datosCuriosos.size());  // Genera un índice aleatorio
        return "Dato curioso: " + datosCuriosos.get(randomIndex);  // Retorna el dato curioso seleccionado
    }
}





