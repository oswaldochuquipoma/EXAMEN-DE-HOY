
package com.mycompany.controller;

import com.mycompany.controllerimpl.Detalle_ventaCtrlImpl;
import java.io.Serializable;
import com.mycompany.model.Venta;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.mycompany.dao.VentaDAO;

/**
 *
 * oswaldo
 */
@ManagedBean(name = "ventaCtrl")
@SessionScoped
public class VentaCtrl implements Serializable {

    private Venta selected;
    private boolean est;
    VentaDAO vendao;
    private ArrayList<Venta> list = new ArrayList<>();

    public VentaCtrl() {
        this.selected = new Venta();
        this.vendao = new Detalle_ventaCtrlImpl();
    }

    public void createVenta() {        
        if (vendao.createVenta(selected)) {
            System.out.println("Insertado");
        } else {
            System.out.println("Error al momento de insertar");
        }
    }

    public ArrayList<Venta> getList() {
        list = vendao.readVenta();
        return list;
    }

    public void updateVenta(Venta ven) {
        System.out.println("Venta = "+ven.getId_venta());
        if (vendao.updateVenta(ven)) {
            System.out.println("Actualizado");
        } else {
            System.out.println("Error al momento de actualizar");
        }
    }
    public void deleteCliente(String id){
        
        if (vendao.deleteVenta(id)) {
            System.out.println("Eliminado"+id);
        } else {
            System.out.println("Error al momento de eliminar");
        }
    }
    public Venta getSelected() {
        return selected;
    }

    public void setSelected(Venta selected) {
        this.selected = selected;
    }

}
