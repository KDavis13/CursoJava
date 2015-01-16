package administracion;

import java.util.Calendar;

public class EmpleadoTemporal extends Empleado {
	
	private static final int SUELDO_TEMPORAL=134927; //En centimos
	
	private Calendar fechaAlta;
	private Calendar fechaBaja;
	
	public EmpleadoTemporal(){
		super();
	}
	public EmpleadoTemporal(String nombre, String dni, Calendar fechaAlta, Calendar fechaBaja){
		super(nombre, dni);
		this.fechaAlta=fechaAlta;
		this.fechaBaja=fechaBaja;
	}
	
	public Calendar getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Calendar fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Calendar getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(Calendar fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	
	@Override
	public int calcularSueldo(){
		int sueldo=0;
		int auxSueldoDia=0;
		
		auxSueldoDia=SUELDO_TEMPORAL/ diasDelMes(this.fechaBaja.get(Calendar.MONTH),this.fechaBaja.get(Calendar.YEAR));
		sueldo=auxSueldoDia *diasTrabajados();
		
		return sueldo;
	}
	private int diasTrabajados() {
		
		int auxDiasTrabajados=0;
		
		auxDiasTrabajados=fechaBaja.get(Calendar.DAY_OF_MONTH)- fechaAlta.get(Calendar.DAY_OF_MONTH)+1;
		
		return auxDiasTrabajados; 
	}
	
	public int diasDelMes(int mes, int año){
        
		switch(mes){
            case 0:  // Enero
            case 2:  // Marzo
            case 4:  // Mayo
            case 6:  // Julio
            case 7:  // Agosto
            case 9:  // Octubre
            case 11: // Diciembre
                return 31;
            case 3:  // Abril
            case 5:  // Junio
            case 8:  // Septiembre
            case 10: // Noviembre
                return 30;
            case 1:  // Febrero
                if ( ((año%100 == 0) && (año%400 == 0)) ||
                        ((año%100 != 0) && (año%  4 == 0))   )
                    return 29;  // Año Bisiesto
                else
                    return 28;
            default:
                throw new java.lang.IllegalArgumentException(
                "El mes debe estar entre 1 y 12");
        }
	}
	
}
