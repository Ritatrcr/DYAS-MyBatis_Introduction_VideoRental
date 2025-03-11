/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unisabana.dyas.samples.entities;

import java.io.Serializable;

/**
 *
 * @author cesarvefe
 */
public class Item implements Serializable{
    private TipoItem tipoItem;
    private int id;
    private String nombre;
    private String descripcion;
    private String fechaLanzamiento;
    private long tarifaxDia;
    private String formatoRenta;
    private String genero;

    public Item(TipoItem tipoItem, int id, String nombre, String descripcion, String fechaLanzamiento, long tarifaxDia, String formatoRenta, String genero) {
        this.tipoItem = tipoItem;
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.tarifaxDia = tarifaxDia;
        this.formatoRenta = formatoRenta;
        this.genero = genero;
    }

    public Item() {
    }

    
    
    
    public TipoItem getTipo() {
        return tipoItem;
    }

    public void setTipo(TipoItem tipItemo) {
        this.tipoItem = tipoItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descripcion = descrpcion;
    }

    public String getfechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setfechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public long getTarifaxDia() {
        return tarifaxDia;
    }

    public void setTarifaxDia(long tarifaxDia) {
        this.tarifaxDia = tarifaxDia;
    }

    public String getFormatoRenta() {
        return formatoRenta;
    }

    public void setFormatoRenta(String formatoRenta) {
        this.formatoRenta = formatoRenta;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Item{" + "tipo=" + tipoItem + ", id=" + id + ", nombre=" + nombre + ", tarifaxDia=" + tarifaxDia + '}';
    }


    
    
    
    
}
