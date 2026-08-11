package Ejercicios.Tema16_ConexionesHTTP;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * ---------------------------------------------------------
 * EJERCICIO 183: PRÁCTICA CON HTTP CLIENT
 * ---------------------------------------------------------
 * Conceptos: HttpClient, HttpRequest, HttpResponse, JSON.
 * 
 * Enunciado:
 * Realiza una petición GET al servidor de pruebas de JSONPlaceholder
 * y muestra la respuesta en consola. (Simulación de consumo de API #183).
 */
public class Ejercicio_183 {
    public static void main(String[] args) {
        System.out.println("=== CONSUMO DE API #183 ===");
        try {
            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest peticion = HttpRequest.newBuilder()
                    .uri(URI.create("https://jsonplaceholder.typicode.com/todos/" + (183 - 180)))
                    .GET().build();
                    
            HttpResponse<String> respuesta = cliente.send(peticion, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status: " + respuesta.statusCode());
            System.out.println("JSON:\n" + respuesta.body());
        } catch (Exception e) {
            System.out.println("Error de conexión.");
        }
    }
}