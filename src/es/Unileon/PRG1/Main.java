package es.unileon.prg.tema6;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class Main {


public static void main (String[] args){
	
	Date fecha = new Date (30,12,1967);
	Date fecha2 = new Date (20,12,1950);
	
	System.out.println(fecha.isSameMonth(fecha2));
	System.out.println(fecha.isSameDay(fecha2));
	System.out.println(fecha.isSameYear(fecha2));
	System.out.println(fecha.isSameDate(fecha2));
	System.out.println(fecha);
	System.out.println(fecha2);

}

}
