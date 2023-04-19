package evaluacion.evaluacionajax.controlador;

import evaluacion.evaluacionajax.entidad.producto;
import evaluacion.evaluacionajax.servicio.servicioProducto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;

@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
public class controladorProducto {

    servicioProducto metodos = new servicioProducto();
    ArrayList no= new ArrayList(Collections.singleton("Esta categoria no existe"));
    @GetMapping("/verlista")
    public ArrayList<producto> lista() {
        return metodos.getLista();
    }

    @GetMapping("/categoria/{cate}")
        public ArrayList<producto> categoria(@PathVariable("cate") String cate) {
        if(metodos.mostrarCategoria(cate).size()>0){
            return metodos.mostrarCategoria(cate);
        }
        else{
            return no;
        }
    }
    @GetMapping("/totales")
    public ArrayList<producto> totales() {
        return metodos.precios();
    }

}
