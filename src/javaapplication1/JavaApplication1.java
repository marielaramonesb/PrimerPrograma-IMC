/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author marielaramonesbalvoa
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Calcular IMC");
    //Paso 1. Declaracion de variables (Identificadores)
    double w, l, imc;
    String eIMC;
    //En la siguiente linea, le indico a java que utilizare un teclado
    Scanner Keyboard = new Scanner (System.in);
    //Paso 2. Asignar valores a las variables.
    System.out.println("Introduce el peso");
    w=Keyboard.nextDouble();
    System.out.println("Introduce la estatura");
    l=Keyboard.nextDouble();
    //Paso 3. Resolver el problema.
    imc= w / Math.pow (l, 2);
    //3.1 Evaluar IMC.
     if (imc>25){
         eIMC= "Sobrepeso";
     }else if(imc<19){
         eIMC="Desnutrición";
     }else {
         eIMC="Normal";
     }          
                   
            
//Paso 4. Mostar el resultado.
System.out.println("peso=" + w);
System.out.println("estatura= " + l);
System.out.println("IMC= " +imc);
System.out.println("eIMC");  
    }
}