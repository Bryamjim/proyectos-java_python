/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bryamciclo;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class Bryamciclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n,i,cont, num;
        cont = 0;
        System.out.println("Ingrese la longitud del vector");
        n = leer.nextInt();
        System.out.println("ingrese un número entero:");
        num = leer.nextInt();
        int [] A = new int [n];
        
        for (i = 0; i < n; i++) {
            System.out.println("A["+i+"] = ");
            A[i] = leer.nextInt();
        }
        for(i=0; i<4; i++) {
           
                System.out.print(A[i] + "  ");
            
          
        }
        for (i = 0; i < n; i++) {
            if( (A[i]%10) == num){
                cont = cont+1;
            }
        }
        System.out.println("Hay "+ cont + " números dentro del vector que terminen  en: " + num);
        
    }
    
}
