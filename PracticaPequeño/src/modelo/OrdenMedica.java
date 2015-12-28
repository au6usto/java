package modelo;
class OrdenMedica {
    private Medicamento medicamento;
    private int cantindad;
    private String indicacion;
    private Fecha fecha;

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public int getCantindad() {
        return cantindad;
    }

    public void setCantindad(int cantindad) {
        this.cantindad = cantindad;
    }

    public String getIndicacion() {
        return indicacion;
    }

    public void setIndicacion(String indicacion) {
        this.indicacion = indicacion;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public OrdenMedica(Medicamento medicamento, int cantindad, String indicacion, Fecha fecha) {
        this.medicamento = medicamento;
        this.cantindad = cantindad;
        this.indicacion = indicacion;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "OrdenMedica{" + "medicamento=" + medicamento + ", cantindad=" + cantindad + ", indicacion=" + indicacion + ", fecha=" + fecha + '}';
    }
}
