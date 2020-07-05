package pe.edu.upeu.rmsa.examen;
import java.util.Scanner;
public class NumeroPerfecto {

    public static void numeroperfectos() {
        int numn, suma = 0, n;
        Scanner numero = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        n = numero.nextInt();
            for (numn = 1; numn < n; numn++) {                          
                if (n % numn == 0) {
                    suma = suma + numn;   
                }
                }
                if (suma == n) {                          
                    System.out.println("Perfecto");
                } else {
                    System.out.println("No es perfecto");
              
                }        

                
            }
        
    }
