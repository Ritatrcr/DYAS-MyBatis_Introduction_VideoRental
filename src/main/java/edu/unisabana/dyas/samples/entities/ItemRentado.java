/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unisabana.dyas.samples.entities;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author cesarvefe
 */
public class ItemRentado implements Serializable {

    private int id;

    private Item item;
    private String fechaInicioRenta;
    private String fechaFinRenta;

    public ItemRentado(int id, Item item, String fechaInicioRenta, String fechaFinRenta) {
        this.id = id;
        this.item = item;
        this.fechaInicioRenta = fechaInicioRenta;
        this.fechaFinRenta = fechaFinRenta;
    }

    public ItemRentado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getfechaInicioRenta() {
        return fechaInicioRenta;
    }

    public void setfechaInicioRenta(String fechaInicioRenta) {
        this.fechaInicioRenta = fechaInicioRenta;
    }

    public String getfechaFinRenta() {
        return fechaFinRenta;
    }

    public void setfechaFinRenta(String fechaFinRenta) {
        this.fechaFinRenta = fechaFinRenta;
    }

    @Override
    public String toString() {
        return "ItemRentado{" + "id=" + id + ", item=" + item + ", fechaInicioRenta=" + fechaInicioRenta + ", fechaFinRenta=" + fechaFinRenta + '}';
    }

    
    
}
