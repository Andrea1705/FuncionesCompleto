/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication27;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*           
        Ejercicio:
        Crear un vector de 10 posiciones
        Pedirle al usuario que cargue 10 valores para ese vector
        Mostrar con foreach el listado de números que ingresó.
        Mostrar la suma de todos los elementos.
        Indicar cuántos números pares y cuántos impares 
        Mostrar el promedio
        Indicar cuántas veces se repitió el número 2
        Resolver todo dentro de un método que sea invocado dentro del main.
        */       
  
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese diez números enteros de a uno y presione enter en el medio: ");
        
        int[] numeros = new int[10];
        
        numeros[0] = teclado.nextInt();
        numeros[1] = teclado.nextInt();
        numeros[2] = teclado.nextInt();
        numeros[3] = teclado.nextInt();
        numeros[4] = teclado.nextInt();
        numeros[5] = teclado.nextInt();
        numeros[6] = teclado.nextInt();
        numeros[7] = teclado.nextInt();
        numeros[8] = teclado.nextInt();
        numeros[9] = teclado.nextInt();     
  
        
        impNumeros(numeros);
        System.out.println("Los elementos del vector son: "+numeros[0] + numeros[1] +
                            numeros[2] + numeros[3] + numeros[4] + numeros[5] + numeros[6] +
                            numeros[7] + numeros[8] + numeros[9]);
   
        int contarPares = contarPares(numeros);
        contarPares(numeros);
        System.out.println("La cantidad de números pares es: " +contarPares);
        
        int contarImpares = contarImpares(numeros);
        contarImpares(numeros);
        System.out.println("La cantidad de números impares es: " +contarImpares); 
      
        double promedio = promedio(numeros);
        System.out.println("El promedio de los números es: "+ promedio);

        int contarNum2 = contarNum2(numeros);
        System.out.println("La suma de los números 2 es de: "+contarNum2);
          
    }
   
    
    public static void impNumeros(int[] numeros){
        
        for (int numero : numeros){
            System.out.println(numero);
        }     
    }  
   
  
    public static int sumar(int numeros[]){
           
        int sumar = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            sumar += numeros[i];
        }    
        return sumar;
    }

   
    public static int contarPares(int numeros[]){
     
        int contarPares = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contarPares++;
            } 
        }
        return contarPares;
    }
   
     public static int contarImpares(int numeros[]){
     
        int contarImpares = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                contarImpares++;
            }
        }
        return contarImpares;
    }
    
    
    public static double promedio(int numeros[]){
        
        double sumar = 0;
        
        for (int i = 0; i < numeros.length; i ++){
            sumar += numeros[i];
        }
            return sumar/numeros.length;   
    }
           
    public static int contarNum2(int numeros[]){
     
        int contar = 0;
    
        for (int i = 0; i < numeros.length; i ++){
            if (numeros[i]== 2){
                contar++;
            } 
        }
         return contar;     
    } 
}    