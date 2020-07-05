package pe.edu.upeu.rmsa.examen;
import pe.edu.upeu.rmsa.utils.LeerTeclado;
public class TabladeMultiplicar {
    public static void calculartablademultiplicacion(){
    LeerTeclado teclado=new LeerTeclado();
         //definir variables
         int factor_1;
         double factor_2;
         double respuesta=0;
         // datos de entrada 
         System.out.println("ingrese el primero factor de la tabla de multiplicar del (1-20)");
         factor_1=teclado.leer(0, "");
         System.out.println("ingrese el segundo factor que desea multiplicar (1-10)");
         factor_2=teclado.leer(0,"");
         // proceso 1 
         if (factor_2>=1 && factor_2<=10) {
             factor_2 = factor_2+0;
             switch (factor_1) {
             case 1:
                 respuesta = factor_1*factor_2;
                 break;
             case 2:
                 respuesta = factor_1*factor_2;
                 break;
             case 3:
                 respuesta = factor_1*factor_2;
                 break;
             case 4:
                 respuesta = factor_1*factor_2;
                 break;
             case 5:
                 respuesta = factor_1*factor_2;
                 break;
             case 6:
                 respuesta = factor_1*factor_2;
                 break;
             case 7:
                 respuesta = factor_1*factor_2;
                 break;
             case 8:
                 respuesta = factor_1*factor_2;
                 break;
             case 9:
                 respuesta = factor_1*factor_2;
                 break;
             case 10:
                 respuesta = factor_1*factor_2;
                 break;
             case 11:
                 respuesta = factor_1*factor_2;
                 break;
             case 12:
                 respuesta = factor_1*factor_2;
                 break;
             case 13:
                 respuesta = factor_1*factor_2;
                 break;
             case 14:
                 respuesta = factor_1*factor_2;
                 break;
             case 15:
                 respuesta = factor_1*factor_2;
                 break;
             case 16:
                 respuesta = factor_1*factor_2;
                 break;
             case 17:
                 respuesta = factor_1*factor_2;
                 break;
             case 18:
                 respuesta = factor_1*factor_2;
                 break;
             case 19:
                 respuesta = factor_1*factor_2;
                 break;
             case 20:
                 respuesta = factor_1*factor_2;
                 break;
             }
              // datos de salida 
        System.out.println("la respuesta que tiene es : "+respuesta);
         }
        }
    }