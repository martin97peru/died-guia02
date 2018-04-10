
package died.guias.guia02.app;
import java.util.Date;
import java.util.GregorianCalendar;
/** Clase de test de java
* @author marti
*/
public class Hola2 {
	public static void main(String[] args) {
		Date fechaActual = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(fechaActual);
		Integer dia = calendar.get(GregorianCalendar.DAY_OF_MONTH);
		// tener en cuenta que en JAVA para la clase Calendar, el mes empieza en CERO, 
		// es decir que ENERO no es el mes 1 sino el mes CERO!!!
		Integer mes = 1+calendar.get
		(GregorianCalendar.MONTH);
		Integer anio = calendar.get(GregorianCalendar.YEAR);
		System.out.println("Hola la fecha actual es "+dia+"/"+mes+"/"+anio);
		calendar.add(GregorianCalendar.HOUR, 250);
		dia = calendar.get(GregorianCalendar.DAY_OF_MONTH);
		mes = 1+calendar.get(GregorianCalendar.MONTH);
		anio = calendar.get(GregorianCalendar.YEAR);
		System.out.println("Fecha en 300 horas sera "+dia+"/"+mes+"/"+anio);
		}
}
