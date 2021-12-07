/*Ejercicio 2: Hacer un programa que calcule e imprima el salario semanal 
de un empleado a partir de sus horas semanales trabajadas 
y de su salario por horas */
package appli_eje2;

import java.util.Scanner;

public class Appli_Eje2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float horasT, salarioH, salarioS; //Declaración de variables
        
        //Ingreso de las horas trabajadas y el valir de la hora
        System.out.println("Digite la  cantidad de horas trabajadas en la semana:");
        horasT = entrada.nextFloat();
        
        System.out.println("Digite el valor de la hora: ");
        salarioH = entrada.nextFloat();
        
        //Cálcular el salario semanal
        salarioS = horasT*salarioH;
                        
        //Imprimir el resultado en pantalla
        System.out.println("El salario semanal es: "+salarioS);
      
    }
    
}
