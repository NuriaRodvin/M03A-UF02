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
