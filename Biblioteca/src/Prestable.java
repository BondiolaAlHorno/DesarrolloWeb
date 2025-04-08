public class Prestable {
    private String fechaRetiro;
    private String fechaEntrega;
    private boolean disponibilidad;

    public Prestable(String fechaRetiro, String fechaEntrega, boolean disponibilidad){
        this.fechaRetiro = fechaRetiro;
        this.fechaEntrega = fechaEntrega;
        this. disponibilidad = disponibilidad;
    }

    public String getFechaRetiro(){
        return this.fechaRetiro;
    }
    public void setFechaRetiro(String fechaRetiro){
        this.fechaRetiro = fechaRetiro;
    }

    public String getFechaEntrega(){
        return this.fechaEntrega;
    }
    public void setFechaEntrega(String fechaEntrega){
        this.fechaEntrega = fechaEntrega;
    }

    public boolean getDisponibilidad(){
        return this.disponibilidad;
    }
    public void setDisponibilidad(boolean disponibilidad){
        this.disponibilidad = disponibilidad;
    }

    public void modificarPrestable(String fechaRetiro, String fechaEntrega, boolean disponibilidad){
        setFechaRetiro(fechaRetiro);
        setFechaEntrega(fechaEntrega);
        setDisponibilidad(disponibilidad);
    }
}

