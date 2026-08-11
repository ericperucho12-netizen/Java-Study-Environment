package EjercicioMoure;

public class prueba {
    static void main() {

        System.out.println("--- Especial 10 de Mayo | Perucho Dev ---\n");
        System.out.println("Iniciando sistema... Compilando amor incondicional...\n");

        //1.Creamos un arreglo con las "variables" que definen a una mamá
        String[] cualidadesMama={
             "Paciencia infinita (incluso cuando el código no compila",
             "Abrazos que reinician el sistema",
             "La mejor gestora de proyectos (y de la casa)",
             "Apoyo ténnico y emocional 24/7",
             "Amor sin bugs ni errores de sintaxis"
        };
        System.out.println("Analizando los atributos de la clase 'Mamá:\n");

        //2.Usamos el bucle For-Each para recorrer cada cualidad
        for(String cualidad:cualidadesMama){
            System.out.println("❤️ " + cualidad);
        }
        //3. El retorno final

        System.out.println("\nreturn \"¡Gracias por darnos la vida y enseñarnos a programar nuestro futuro!\";");
        System.out.println("System.out.println(\"¡Feliz Día de las Madres!\");");
    }
}
