
package com.mycompany.dao;

import com.mycompany.model.Producto;
import java.util.ArrayList;


public interface ProductoDAO {
    public boolean createProducto(Producto pro);
    public ArrayList<Producto> readProducto();
    public boolean updateProducto(Producto Pro);
    public boolean deleteProducto(String id);
}
