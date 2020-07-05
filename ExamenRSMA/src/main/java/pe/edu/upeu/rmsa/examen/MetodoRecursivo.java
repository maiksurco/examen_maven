package pe.edu.upeu.rmsa.examen;
import pe.edu.upeu.rmsa.utils.LeerTeclado;
public class MetodoRecursivo {
    public static void metododepontecia() {
    LeerTeclado teclado=new LeerTeclado(); 
    int b;
    int respuesta=0;
    int x;
    // datos de entrada 
    System.out.println("numero que quiere operar");
    x = teclado.leer(0,"");
    System.out.println("numero que quiere elevar a la potencia");
    b = teclado.leer(0,"");
    // proceso 
    if (x>0 && b==0) {
        respuesta = 1+0;
    } else {
        if (x>=1 && b>=2) {
            respuesta = (int) (x * (Math.pow(x, (b - 1))));
        } else {
            System.out.println("no hay respuesta");
        }
    }
    // datos de salida 
    System.out.println("el resultado de su operacion es: "+respuesta);
	}

	public void numeroperfectos() {
	}
}
