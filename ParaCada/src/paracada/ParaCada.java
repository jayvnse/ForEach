/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paracada;

import java.util.Random;

/**
 *
 * @author jacks
 */
public class ParaCada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        double[] notas = new double[10];
        Random numRandom = new Random();
        
        System.out.println("USANDO FOR");
        
        for (int i=0; i<notas.length; i++){
            notas[i] = numRandom.nextInt(11);
        }
        
        for (int i=0; i<notas.length; i++){
            System.out.println(notas[i]);
        }
    
        System.out.println();
        System.out.println("USANDO FOR EACH");
        
        for(double nota : notas){ 
            System.out.println(nota);
        }
        
        /* o que acontece num for each, em relação a um for:
        
        for (int i=0; i<notas.length; i++){
            double nota = notas[i];
            System.out.println(nota);
        }
        
        */
    }
    
}
