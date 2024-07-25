
package prueva1;

import java.util.*;
public class ejercicio2 {
public static void main(String[] args) {
       
    Random rand = new Random();
        
        int [][] matriz = new int[rand.nextInt(5)+1][rand.nextInt(5)+1];
        
        Imprimir(matriz);
        System.out.println(esCuadrada(matriz));
    }
    
    
    
    public static boolean esCuadrada(int [][] matriz){
        
        if(matriz.length == matriz[0].length){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public static void Imprimir(int [][] matriz){
        
       for(int i = 0; i < matriz.length; i++){
           for(int j = 0; j < matriz[0].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
           System.out.print("\n");
           
       }   
    }
}
    
    
    
    

