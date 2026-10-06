package TodoSobreJava.Tema07_Abstraccion;

public class CafeteraAutomatica {

    public void prepararAmericano() {
        System.out.println("Iniciando preparación de Americano....");
        calentarAgua();
        molerGranos();
        servirEnTaza();
        System.out.println("Tu cafe esta listo...");
    }

    private void calentarAgua(){
        System.out.println("(Interno) Calentando el agua a 90°");
    }
    private void molerGranos(){
        System.out.println("(Interno) Iniciando moler granos a velocidad media....");
    }
    private void servirEnTaza(){
        System.out.println("(Interno) Iniciando servir Taza....");
    }


}
