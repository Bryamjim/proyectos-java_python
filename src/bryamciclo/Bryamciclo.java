
package bryamciclo;
import java.util.Scanner;

public class Bryamciclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Leer n números enteros, almacenarlos en un vector. 
        Luego leer un entero y determinar cuántos números de los 
        almacenados en el vector terminan en el 
        mismo dígito que el último valor leído.*/
        
        Scanner leer = new Scanner(System.in);
        int n,i,cont, num;
        cont = 0;
        
        System.out.println("Ingrese la longitud del vector");
        n = leer.nextInt();
        
        System.out.println("ingrese un número entero:");
        num = leer.nextInt();
        
        int [] A = new int [n];
        
        for (i = 0; i < n; i++) {
            System.out.println(" Ingrese datos del vector A["+i+"] = ");
            A[i] = leer.nextInt();
        }
        for(i=0; i < n; i++) {
           
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
