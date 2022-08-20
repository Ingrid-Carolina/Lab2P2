/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_ingridhernandez_12141186;

import java.util.ArrayList;

/**
 *
 * @author incah
 */
public class Carros {
    private String marca;
    private String modelo;
    private int ano;
    private String fecha;
    private ArrayList<String>Estado;
    private ArrayList<String>dueno;
    private double costo;

    public Carros() {
    }

    public Carros(String marca, String modelo, int ano, String fecha, ArrayList<String> Estado, ArrayList<String> dueno, double costo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.fecha = fecha;
        this.Estado = Estado;
        this.dueno = dueno;
        this.costo = costo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<String> getEstado() {
        return Estado;
    }

    public void setEstado(ArrayList<String> Estado) {
        this.Estado = Estado;
    }

    public ArrayList<String> getDueno() {
        return dueno;
    }

    public void setDueno(ArrayList<String> dueno) {
        this.dueno = dueno;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
}
