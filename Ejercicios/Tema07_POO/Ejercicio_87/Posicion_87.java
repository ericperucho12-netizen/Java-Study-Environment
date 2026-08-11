package Ejercicios.Tema07_POO.Ejercicio_87;

public class Posicion_87 {
    //Atributos
    private  int x;
    private int y;

   public Posicion_87(int x, int y){
        this.x=x;
        this.y=y;
    }
    //Mover hacia arriba
    public void Arriba(){
        y +=1;
        System.out.println("MOVER HACIA ARRIBA");
        System.out.println("POSICION:("+x+","+y+") ");
    }
    //Mover hacia abajo
    public void Abajo(){
       y -=1;
        System.out.println("MOVER HACIA ABAJO");
        System.out.println("POSICION:("+x+","+y+") ");
    }
    //Mover hacia Derecha
    public void Derecha(){
        x +=1;
        System.out.println("MOVER HACIA DERECHA");
        System.out.println("POSICION:("+x+","+y+") ");

    }
    //Mover hacia Izquierda
    public void Izquiera(){
       x -=1;
       System.out.println("MOVER HACIA IZQUIERA");
       System.out.println("POSICION:("+x+","+y+") ");
    }
    //Getter Posicion x
    public int getX() {
        return x;
    }
    //Getter Posicion y
    public int getY() {
       return y;
    }
}
