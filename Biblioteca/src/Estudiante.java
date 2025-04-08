public class Estudiante extends Persona{
    private String dni;

    public Estudiante (String apellido, String nombre,String dni){
        super(apellido, nombre);
        this. dni = dni;
    }

    public String getDni(){
        return this.dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void modificarEstiduante(String apellido, String nombre,String dni){
        modificarPersona(apellido, nombre);
        setDni(dni);
    }
}

