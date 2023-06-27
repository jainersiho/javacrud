/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foradso;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ForAdso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
       int canes;
        System.out.println("CUANTOS ESTUDIANTES DESEA EVALUAR");
        canes=en.nextInt();
        for (int i = 0; i < canes; i++) {
            System.out.println("EVALUAR  ESTUDIANTES");
            String nombre;
            float not1,not2,not3, pro;
            
            System.out.println("Ingrese el nombre del estudiante");
            nombre=en.next();
            
            System.out.println("Ingrese la primera nota del estudiante " + nombre);
            not1=en.nextFloat();
            
            System.out.println("Ingrese la senda nota del estudiante " + nombre);
            not2=en.nextFloat();
            
            System.out.println("Ingrese la tercera nota del estudiante " + nombre);
            not3=en.nextFloat();
            
            pro=(not1+not2+not3)/3;
            System.out.println(" EL PROMEDIO DEL ESTUDIANTE " + nombre +" es "+ pro);
            if (pro>=3) {
                System.out.println(" EL ESTUDIANTE " + nombre +" APROBO CON UN PROMEDIO DE " + pro);
                
            }else{
              System.out.println(" EL ESTUDIANTE " + nombre +" NO APROBO CON UN PROMEDIO DE " + pro);  
            }
            
        }
        
    }
    
}
