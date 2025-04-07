import java.util.ArrayList;
import java.util.List;

public class ControladorDePrestables {
    List<Persona> personas;
    List<Prestables> prestables;

    public ControladorDePrestables(List<Persona> personas, List<Prestables> prestables){
        this.personas = personas;
        this.prestables= prestables;
    }

    public void setPrestables(List<Prestables> prestables) {
        this.prestables = prestables;
    }

    public List<Prestables> getPrestables() {
        return prestables;
    }

    public List<Persona> getPersonas() {
        return personas;
    }
    public void setPersonas(List<Persona> persona){
        this.personas=persona;
    }

    public void addEstudiante(Estudiante estu) {
        Estudiante.add(estu);
    }
    public void remuveEstudiante(Estudiante estudiante) {
        estudiante.remuve(estudiante);
    }


}