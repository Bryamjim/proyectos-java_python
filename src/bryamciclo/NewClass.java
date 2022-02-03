            
package bryamciclo;

import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int j,i,mayor,cont;
        mayor=0;cont=0;
        
        
        int [][] A = new int [3][4];
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 4; j++) {
                System.out.println("Ingrese los datos de la posición A["+i+"]["+j+"]= ");
                A[i][j] = leer.nextInt();
            }
        }
        mayor=A[0][0];
        cont = mayorRep(A,mayor);
        
        System.out.println("Se repitió " + cont + " cantidad de veces.");
    }
    public static int mayorRep(int B[][], int mayor1){
        int cont=0;
        // Encontrar el mayor
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if(mayor1<B[i][j]){
                    mayor1 = B[i][j];
                }
            }
        }
        
        // contar las veces que se repite el numero mayor
        for (int i = 0; i < 3; i++) {
            for ( int j = 0; j < 4; j++) {
                if(mayor1 == B[i][j]){
                    cont = cont + 1;
                }
            }
        }
        return cont;
    }
}
