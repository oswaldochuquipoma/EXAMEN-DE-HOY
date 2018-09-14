
package com.mycompany.controller;

import java.io.Serializable;
import com.mycompany.model.Producto;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.mycompany.dao.VentaDAO;


@ManagedBean(name = "productoCtrl")
@SessionScoped
public class ProductoCtrl implements Serializable {

    private Producto selected;
    private boolean est;
    VentaDAO prodao;
    private ArrayList<Producto> list = new ArrayList<>();

    public ProductoCtrl() {
        this.selected = new Producto();
//        this.prodao = new Detalle_ventaCtrlImpl();
    }

    public void createProducto() {        
        if (prodao.createProducto(selected)) {
            System.out.println("Insertado");
        } else {
            System.out.println("Error al momento de insertar");
        }
    }

    public ArrayList<Producto> getList() {
        list = prodao.readProducto();
        return list;
    }

    public void updateProducto(Producto pro) {
        System.out.println("producto = "+pro.getNombre());
        if (prodao.updateProducto(pro)) {
            System.out.println("Actualizado");
        } else {
            System.out.println("Error al momento de actualizar");
        }
    }
    public void deleteProducto(String id){
        
        if (prodao.deleteProducto(id)) {
            System.out.println("Eliminado"+id);
        } else {
            System.out.println("Error al momento de eliminar");
        }
    }
    public Producto getSelected() {
        return selected;
    }

    public void setSelected(Producto selected) {
        this.selected = selected;
    }

}
