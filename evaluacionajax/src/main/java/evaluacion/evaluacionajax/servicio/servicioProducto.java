package evaluacion.evaluacionajax.servicio;

import evaluacion.evaluacionajax.entidad.producto;

import java.util.ArrayList;

public class servicioProducto {
    private ArrayList<producto> lista= new ArrayList<producto>();
    public servicioProducto(){
        lista.add(new producto(1,"mango","frutas",2500,50));
        lista.add(new producto(2,"kumis","lácteos",2100,50));
        lista.add(new producto(3,"frijoles","granos",6800,50));
        lista.add(new producto(4,"arroz","granos",2500,50));
        lista.add(new producto(5,"huevo","proteinas",600,50));
        lista.add(new producto(6,"leche","lácteos",4000,50));
        lista.add(new producto(7,"agua","bebidas",1800,50));
        lista.add(new producto(8,"cereal","granos",2000,50));
        lista.add(new producto(9,"plátano","verduras",2500,50));
        lista.add(new producto(10,"banano","frutas",600,50));
    }
    public ArrayList<producto> getLista() {
        return lista;
    }
    public ArrayList mostrarCategoria(String cate){
        ArrayList si= new ArrayList();
        String retorno="";
        for(producto i: lista){
            if(i.getCategoria().equalsIgnoreCase(cate)){
                si.add(i.toString());
            }
        }
        return si;
    }
    public ArrayList<producto> precios() {
        ArrayList si = new ArrayList();
        int acum = 0;
        int iva = 0;
        String retorno = null;
        for (producto i : lista) {
            String total = i.getNombre();
            if (i.getNombre() == total) {
                acum= i.getPrecio()*i.getCantidad();
                iva = (int) ((acum * 0.19) + acum);
                retorno = "Cantidad de : " + total + ": " + i.getCantidad() + "," +
                        " Precio de cada " + total + ": $" + i.getPrecio()+"," +
                        " Total: $" + acum + "," +
                        " Total con IVA: $" + iva + ".";
                si.add(retorno);
                i.setTotal(acum);
                i.setTotalIva(iva);
            }
        }
        return si;
    }
}
