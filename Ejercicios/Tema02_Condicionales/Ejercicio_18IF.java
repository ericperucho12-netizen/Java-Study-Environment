/*
 "Desarrollar un programa que solicite al usuario el día, mes
 y año de una fecha. El sistema debe determinar si la fecha es
 válida siguiendo estas reglas:

* Febrero (Mes 2): Máximo 28 días.
*Meses de 30 días: Abril (4), Junio (6), Septiembre (9) y Noviembre (11).
*Meses de 31 días: Enero (1), Marzo (3), Mayo (5), Julio (7),
Agosto (8), Octubre (10) y Diciembre (12).
*Año: Debe ser distinto de cero."

*/

package Ejercicios.Tema02_Condicionales;

import java.util.Scanner;

public class Ejercicio_18IF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, year;

        System.out.println("Digite el dia: ");
        dia = entrada.nextInt();
        if(dia >=1 && dia <=31){
            System.out.println("Digite el mes: ");
            mes = entrada.nextInt();
            if(mes>=1 && mes <=12){
                System.out.println("Digite el year: ");
                year = entrada.nextInt();
                if(year !=0){
                //Validacion espesifica por tipo de mes
                    if(mes ==2 & dia ==28){
                        System.out.println("La fecha "+ dia+"/"+mes+"/"+year+ " es correcta");
                    }else if((mes == 4 || mes==6 || mes==9 || mes==11) && dia ==30){
                        System.out.println("La fecha "+ dia+"/"+mes+"/"+year+ " es correcta");
                    }else if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 ||mes==10 || mes ==12) && dia ==31){
                        System.out.println("La fecha "+ dia+"/"+mes+"/"+year+ " es correcta");
                    }else {
                        System.out.println("Fecha incorrecta: el dia no corresponde al mes ");
                    }
                }else{
                    System.out.println("Fecha incorrecta: El año no puede ser cero");
                }
            }else{
                System.out.println("Fecha incorrecta:  El mes debe estar entre 1 y12.");
            }
        }else{
            System.out.println("Fecha incorrecta: El dia debe estar entre 1 y 31");
        }

    }

}



