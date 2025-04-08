import java.util.ArrayList;
import java.util.List;

public class ControladorDePrestables {
    private List<Persona> personas;
    private List<Prestable> prestables;

    public ControladorDePrestables(List<Persona> personas, List<Prestable> prestables){
        this.personas = personas;
        this.prestables= prestables;
    }

    public List<Prestable> getPrestables() {
        return this.prestables;
    }
    public void setPrestables(List<Prestable> prestables) {
        this.prestables = prestables;
    }

    public List<Persona> getPersonas() {
        return this.personas;
    }
    public void setPersonas(List<Persona> persona){
        this.personas=persona;
    }

    public List<Prestable> listarDisponibles(){
        List<Prestable> listaDisponibles = new ArrayList<>();
        for (Prestable prestable : getPrestables()) {
            if (prestable.getDisponibilidad()) {
                listaDisponibles.add(prestable);
            }
        }
        return listaDisponibles;
    }

    public void altaEstudiante(String apellido, String nombre,String dni){
        getPersonas().add(new Estudiante(apellido, nombre,dni));
    }
    public void bajaEstudiante(Estudiante estudiante){
        getPersonas().remove(estudiante);
    }
    public void modificacionEstudiante(Estudiante estudiante, String apellido, String nombre,String dni){
        estudiante.modificarEstiduante(apellido, nombre,dni);
    }

    public void altaDocente(String apellido, String nombre, String titulo){
        getPersonas().add(new Docente(apellido, nombre, titulo));
    }
    public void bajaDocente(Docente docente){
        getPersonas().remove(docente);
    }
    public void modificacionDocente(Docente docente, String apellido, String nombre, String titulo){
        docente.modificarDocente(apellido, nombre, titulo);
    }

    public void altaLibro(String fechaRetiro, String fechaEntrega, boolean disponiilidad, String titulo, String autor){
        getPrestables().add(new Libro(fechaRetiro, fechaEntrega, disponiilidad, titulo, autor));
    }
    public void bajaLibro(Libro libro){
        getPrestables().remove(libro);
    }
    public void modificacionLibro(Libro libro, String fechaRetiro, String fechaEntrega, boolean disponiilidad, String titulo, String autor){
        libro.modificarLibro(fechaRetiro, fechaEntrega, disponiilidad, titulo, autor);
    }

    public void altaNotebook(String fechaRetiro, String fechaEntrega, boolean disponiilidad, Integer numero, String marca){
        getPrestables().add(new Notebook(fechaRetiro, fechaEntrega, disponiilidad, numero, marca));
    }
    public void bajaNotebook(Notebook notebook){
        getPrestables().remove(notebook);
    }
    public void modificacionNotebook(Notebook notebook, String fechaRetiro, String fechaEntrega, boolean disponiilidad, Integer numero, String marca){
        notebook.modificarNotebook(fechaRetiro, fechaEntrega, disponiilidad, numero, marca);
    }
}