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
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int j,i,n,m;
        System.out.println("Ingrese el número de filas: ");
        n = leer.nextInt();
        System.out.println("Ingrese el número de columnas: ");
        m = leer.nextInt();
        int [][] A = new int [n][m];
        for (i = 0; i < n; i++) {
            for ( j = 0; j < m; j++) {
                System.out.println("Ingrese los datos de la posición A["+i+"]["+j+"]= ");
                A[i][j] = leer.nextInt();
            }
        }
        System.out.println("Matriz normal");
        for (i = 0; i < n; i++) {
            for ( j = 0; j < m; j++) {
                System.out.print(A[i][j] + "   ");
            }
            System.out.println("  ");
        }
        System.out.println("-------------------");
        System.out.println("Matriz revertida");
        for (i =n-1 ; i >=0; i--) {
            for ( j = 0; j<m; j++) {
                System.out.print(A[i][j] + "   ");
            }
            System.out.println("  ");
        }
        
    }
}
