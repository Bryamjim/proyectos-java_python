/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bryamciclo;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class fibonaccibryam {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int j,i,k,mayorA,n1,n2,n3,mayorB;
        n1=0;n2=1;n3=0;mayorA=0;mayorB=0;
        
        int [][] A = new int [4][6];
        int [][] B = new int [4][6];
        int[] fib = new int [100];
        for(k=0;k<100;k++){    
            n3=n1+n2;   
            fib[k] = n3;
               
                    n1=n2;    
                    n2=n3;
                }
        for (i = 0; i < 4; i++) {
            for ( j = 0; j < 6; j++) {
                System.out.println("Ingrese los datos de la posición A["+i+"]["+j+"]= ");
                A[i][j] = leer.nextInt();
            }
        }
        for (i = 0; i < 4; i++) {
            for ( j = 0; j < 6; j++) {
                System.out.println("Ingrese los datos de la posición B["+i+"]["+j+"]= ");
                B[i][j] = leer.nextInt();
            }
        }
        System.out.println("MATRIZ A");
        //presentar vector A
        for(i=0; i<4; i++) {
            for(j=0; j<6 ; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println("MATRIZ B");
        // Presentar vector B
        for(i = 0; i < 4; i++) {
            for(j = 0;j < 6 ; j++) {
                System.out.print(B[i][j] + "  ");
            }
            System.out.println(" ");
        }
        //COMPROBAR VECTOR A
        for (i = 0; i < 4; i++) {
            for ( j = 0; j < 6; j++) {
                
                for(k=0;k<100;k++){    
                    if((A[i][j] == fib[k]) &&(mayorA < A[i][j])){ 
                        mayorA = A[i][j];
                    }
                }
            }
        }
        System.out.println("El mayor de  matriz A es: "+mayorA);
        
        //VECTOR B a COMPROBAR
        for (i = 0; i < 4; i++) {
            for ( j = 0; j < 6; j++) {
                
                for(k=0;k<100;k++){    
                    
                    if((B[i][j] == fib[k]) &&(mayorB < B[i][j])){ 
                        mayorB = B[i][j];
                    }
                }
            }
        }
        System.out.println("El mayor de  matriz B es: "+mayorB);
        if(mayorA == mayorB){
            System.out.println("Las 2 matrices tienen el mismo número mayor perteneciente a la serie Fibonacci");
        }
        else{
            System.out.println("Las 2 matrices no tienen el mismo número mayor perteneciente a la serie Fibonacci");
            System.out.println("Mayor matriz A = "+mayorA);
            System.out.println("Mayor matriz B = "+mayorB);
            
        }
    }
    
}
