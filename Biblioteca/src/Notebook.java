public class Notebook extends Prestable {
    private Integer numero;
    private String marca;

    public Notebook(String fechaRetiro, String fechaEntrega, boolean disponibilidad, Integer numero, String marca){
        super(fechaRetiro, fechaEntrega, disponibilidad);
        this.numero = numero;
        this.marca = marca;
    }

    public Integer getNumero(){
        return this.numero;
    }
    public void setNumero(Integer numero){
        this.numero = numero;
    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void modificarNotebook(String fechaRetiro, String fechaEntrega, boolean disponibilidad, Integer numero, String marca){
        modificarPrestable(fechaRetiro,fechaEntrega,disponibilidad);
        setNumero(numero);
        setMarca(marca);
    }
}
