package pe.edu.upeu.rmsa;
import pe.edu.upeu.rmsa.utils.LeerTeclado;
import pe.edu.upeu.rmsa.examen.CompañiaAutomotriz;
import pe.edu.upeu.rmsa.examen.TabladeMultiplicar;
import pe.edu.upeu.rmsa.examen.NumeroPerfecto;
import pe.edu.upeu.rmsa.examen.MetodoRecursivo;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println( "hola que tal , mi examen..." );
        try {
            LeerTeclado teclado=new LeerTeclado();            
            char opcion='S'; //S=SI, N=NO
            int numAlgoritm=1;
            do{            
                numAlgoritm=teclado.leer(0,
                "Ingrese el tipo de ejercicio algoritmico que desea probar: \n"+
                "1= compañia automotriz\n"+
                "2= tabla de multiplicar \n"+
                "3= numero perfecto \n"+
                "4= metodo recursivo\n");  
                switch(numAlgoritm){
                    case 1: 
                        CompañiaAutomotriz.impuestoporautomoviles();         
                    break;  
                    case 2:{
                        TabladeMultiplicar.calculartablademultiplicacion();
                    }break;
                    case 3:{
                        NumeroPerfecto.numeroperfectos();
                    }break;
                    case 4:{
                        MetodoRecursivo.metododepontecia();
                    }break;                    
                    default: System.out.println("La opcion No existe!!"); break;
                }            
                opcion=teclado.leer(' ', "Desea Probar mas Algoritmos? S=SI, N=NO");
            }while(opcion=='S' || opcion=='s');   
        } catch (Exception er) {
            System.out.println(er.getMessage());
        } 
    }
}
