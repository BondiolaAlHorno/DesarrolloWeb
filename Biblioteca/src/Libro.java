public class Libro extends Prestable {
    private String titulo;
    private String autor;

    public Libro(String fechaRetiro, String fechaEntrega, boolean disponibilidad, String titulo, String autor){
        super(fechaRetiro, fechaEntrega, disponibilidad);
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public void modificarLibro(String fechaRetiro, String fechaEntrega, boolean disponibilidad, String titulo, String autor){
        modificarPrestable(fechaRetiro,fechaEntrega,disponibilidad);
        setTitulo(titulo);
        setAutor(autor);
    }
}
