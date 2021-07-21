/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class JavaApplication2 {

   private static Scanner teclado = new Scanner(System.in);
    public static String codifica(String palabra){
     int codificar = 0;
     String Resultado ="";
     int llave = 9; 
     
     for(int x=0; x<palabra.length();x++){
         codificar = (int)palabra.charAt(x);
         codificar = codificar + llave; 
         char caracter = (char) codificar;
         Resultado = Resultado + caracter;
         
     }
          return Resultado;
    }
    public static void main(String[]args){
        String pal;
        String Res;
        System.out.println("Ingrese una palabra:");
        pal = teclado.nextLine();
        Res = codifica(pal);
        
         
        System.out.println("palabra codificada="+Res);
        
         byte[] ascii = Res.getBytes(StandardCharsets.US_ASCII);//llamado de un conjunto de caracteres 
          
         System.out.println("-----palabra en codigo ascii-----");
        System.out.println("primer : "+ascii[0]);
        System.out.println("segundo: "+ascii[1]);
        System.out.println("tercero: "+ascii[2]);
        System.out.println("cuarto : "+ascii[3]);
       
         
    }



}
