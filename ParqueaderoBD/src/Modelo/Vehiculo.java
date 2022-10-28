/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author auxiliar
 */
public class Vehiculo {
    
    private String placa;
    private Date fecha;
    private Integer modelo;
    private String tipo;
    private Integer valor;

    public Vehiculo() {
    }

    public Vehiculo(String placa, Date fecha, Integer modelo, String tipo, Integer valor) {
        this.placa = placa;
        this.fecha = fecha;
        this.modelo = modelo;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
    

}