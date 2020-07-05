package pe.edu.upeu.rmsa.examen;
import pe.edu.upeu.rmsa.utils.LeerTeclado;
public class CompañiaAutomotriz { 
    
	public static void impuestoporautomoviles(){
    LeerTeclado teclado=new LeerTeclado(); 
		int costo=0;
		int vehiculo=0;
		int tiposdevehiculos=0;
		System.out.println("ingrese que tipo de clave de vehiculo desea");
		tiposdevehiculos = teclado.leer(0, "ingrese que tipo de clave de vehiculo desea: ");
		System.out.println("ingrese el costo de vehiculo: ");
		costo=teclado.leer(0,"ingrese el costo de vehiculo: ");
		switch (tiposdevehiculos){
		case 1:
			vehiculo = (int) (costo*0.10);
			break;
		case 2:
			vehiculo = (int) (costo * 0.07);
			break;
		case 3:
			vehiculo = (int) (costo * 0.05);
			break;
			default:System.out.println("la opcion no existe");
			break;
		}
		System.out.println("el impuesto a pagar es "+vehiculo);
		System.out.println("costo de vehiculo es "+costo);
    }
    
}