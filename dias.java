/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class dias {
     public static void main(String[] args) {
        Scanner bry=new Scanner(System.in);
        //declaracion de variales 
        String dia;
        
        //ingresamos por teclado el dia 
         System.out.println("INFGRESE EL DIA ");
         dia=bry.next();
         
         //casos
         switch (dia){
             case "lunes":
                 System.out.println("la materias el dia lunes son ");
                 System.out.println("10-11 "+" GP 1.2");
                 System.out.println("15-18 "+" estadistica");
                 System.out.println("18-21 "+" administracion empresarial");
                 break;
             case "martes":
                 System.out.println("la materias el dia martes son ");
                 System.out.println("8-11 "+"electronica digital");
                 break;
             case "miercoles":
                 System.out.println("la materias el dia miercoles son ");
                 System.out.println("7-10 "+"fundamentos de programacion");
                 break;
             case "mjueves":
                 System.out.println("la materias el dia jueves son ");
                 System.out.println("libr");
                 break;
             case "viernes":
                 System.out.println("la materias el dia viernes son ");
                 System.out.println("8-11 "+"guiones audiovisuales");
                 break;
             default:
                 System.out.println("dia incorrecto");
                 
         }
    
}
  } 
