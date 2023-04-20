package evaluacion.evaluacionajax.entidad;

public class producto {
    private int cod;
    private String nombre;
    private String categoria;
    private int precio;
    private int cantidad;
    private int total;
    private int totalIva;

    public producto(int cod, String nombre, String categoria, int precio, int cantidad) {
        this.cod = cod;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public producto(String nombre, int precio, int cantidad, int total, int totalIva) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = total;
        this.totalIva = totalIva;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(int totalIva) {
        this.totalIva = totalIva;
    }

}
