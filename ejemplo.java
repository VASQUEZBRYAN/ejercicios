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
public class ejemplo {
    public static void main(String[] args) {
        Scanner bry=new Scanner(System.in);
        //declaracion de variales 
        String departamento;
        //ingresar por teclado 
        System.out.println("ingrese el departamento ");
        departamento=bry.next();
        //escojemos los casos
        switch (departamento){
            case "a":
                System.err.println("desarrollo");
                break;
            case "b":
                System.out.println("recursos humanos");
                break;
            case "c":
                System.out.println("finazas");
                break;
            case "d":
                System.out.println("mercadeo");
                break;
            default:
                System.out.println("departamento invalido");
        }
        System.out.println("codigo para departamneto es "+ departamento);
    }
}
