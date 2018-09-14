package test;


import com.mycompany.controllerimpl.Detalle_ventaCtrlImpl;
import com.mycompany.controllerimpl.ProductoCtrlImpl;
import com.mycompany.model.Producto;
import java.util.ArrayList;
import com.mycompany.dao.VentaDAO;

 
public class TestProducto {
    static ArrayList<Producto> list = new ArrayList<>();
    
    public static void main(String[] args) {
        VentaDAO prodao;
        prodao = new ProductoCtrlImpl();
        /*list = catdao.readCategoria();
        for(Categoria item: list){
            System.out.println(""+item.getName_cat());
        }*/
        Producto pro = new Producto();
        pro.setId_producto("001");
        pro.setId_categoria("lacteos");
        pro.setNombre("peras");
        pro.setDescripcion("muy bueno");
        pro.setCodigo("0001");
        
        if(prodao.createProducto(pro)){
            System.out.println("insertado");
        }else{
            System.out.println("Grave Error Al Momento de insertar");
        }
    }
    
}
