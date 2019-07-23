package com.everykan.everykanapp.model;

import java.util.Date;

public class Gastos {

    private Integer codigo;
    private Date fechaRegistro;
    private double importe;
    private String descripcion;
    // datos adicionales, lugar geolocalizado donde se hace el registro del gasto.
    private long latitud;
    private long longitud;

    public Gastos(){

    }
    //Generar Setter y Getter
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getLatitud() {
        return latitud;
    }

    public void setLatitud(long latitud) {
        this.latitud = latitud;
    }

    public long getLongitud() {
        return longitud;
    }

    public void setLongitud(long longitud) {
        this.longitud = longitud;
    }
    //Generar toString
    @Override
    public String toString() {
        return "Gastos{" +
                "codigo=" + codigo +
                ", fechaRegistro=" + fechaRegistro +
                ", importe=" + importe +
                ", descripcion='" + descripcion + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                '}';
    }

}
