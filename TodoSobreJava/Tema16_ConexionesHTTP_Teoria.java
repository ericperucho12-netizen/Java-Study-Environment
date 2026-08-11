package TodoSobreJava;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * ============================================================================
 * GUÍA MAESTRA: CONEXIONES HTTP (APIs y REST)
 * ============================================================================
 * 
 * 1. ¿QUÉ ES UNA API REST?
 * ----------------------------------------------------------------------------
 * Es como un "mesero" de un restaurante. Tú (el cliente) le pides un dato a 
 * una página web (el servidor), y la API va a la base de datos, lo busca y
 * te lo trae de regreso en un formato de texto universal llamado JSON.
 * 
 * 2. JAVA.NET.HTTP (Java 11+)
 * ----------------------------------------------------------------------------
 * Antes, conectarse a internet en Java era un dolor de cabeza. A partir de 
 * Java 11 se introdujeron 3 clases clave:
 * 
 * A) HttpClient: Es tu navegador invisible. Él es quien hace la conexión.
 * B) HttpRequest: Es la petición. Aquí configuras a qué URL vas a ir y por
 *    qué método (GET para pedir, POST para enviar, DELETE para borrar).
 * C) HttpResponse: Es la respuesta que te da el servidor. Generalmente te 
 *    devuelve un código (Ej. 200 = OK, 404 = No Encontrado) y un cuerpo (JSON).
 * 
 * 3. ¿CÓMO SE HACE?
 * ----------------------------------------------------------------------------
 * 1. Construyes tu cliente HTTP.
 * 2. Construyes tu petición (Request) hacia una URL.
 * 3. Le dices al cliente que envíe la petición y te guarde la Respuesta (Response).
 */
public class Tema16_ConexionesHTTP_Teoria {
    public static void main(String[] args) {
        System.out.println("=== TEORÍA: CONEXIONES A INTERNET ===\n");
        
        try {
            // 1. Cliente
            HttpClient cliente = HttpClient.newHttpClient();
            
            // 2. Petición (Request) a un servidor de pruebas gratuito
            HttpRequest peticion = HttpRequest.newBuilder()
                    .uri(new URI("https://jsonplaceholder.typicode.com/posts/1"))
                    .GET() // Queremos LEER datos
                    .build();
            
            // 3. Enviar y recibir Respuesta (Response)
            System.out.println("Enviando petición a internet...");
            HttpResponse<String> respuesta = cliente.send(peticion, HttpResponse.BodyHandlers.ofString());
            
            // Ver resultados
            System.out.println("Código de estado: " + respuesta.statusCode() + " (200 = Éxito)");
            System.out.println("Cuerpo del JSON devuelto:\n" + respuesta.body());
            
        } catch (Exception e) {
            System.out.println("Fallo al conectar. Revisa tu internet.");
        }
    }
}