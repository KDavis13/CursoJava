package accesoaleatorio;

public class Ejemplo {
    public static void main(String args[]) {
        Alumno alumno;
        /* CREACION DEL FICHERO CON 50 ALUMNOS */
        FicheroAleatorio fichero = new FicheroAleatorio("lista.dat", "rw");
        fichero.crear();
        fichero.cerrar();

        /* INSERCION EN EL FICHERO DE ALUMNOS */
        fichero = new FicheroAleatorio("lista.dat", "rw");
        alumno = new Alumno(Integer.MAX_VALUE, "1234567890", "123456789012345");
        fichero.insertar(alumno, 2);
        alumno = new Alumno(28, "Julio", "Casas");
        fichero.insertar(alumno, 1);
        alumno = new Alumno(41, "Rosa", "Garcia");
        fichero.insertar(alumno, 2);
        alumno = new Alumno(37, "Ramon", "Fernandez");
        fichero.insertar(alumno, 4);
        fichero.cerrar();

        /* BUSQUEDA EN EL FICHERO DE ALUMNOS */
        fichero = new FicheroAleatorio("lista.dat", "r");
        alumno = fichero.leer(1);
        System.out.println("Su edad es      : " + alumno.getEdad());
        System.out.println("Su nombre es    : " + alumno.getNombre());
        System.out.println("Su apellido es  : " + alumno.getApellido());
        fichero.cerrar();
    }

}
