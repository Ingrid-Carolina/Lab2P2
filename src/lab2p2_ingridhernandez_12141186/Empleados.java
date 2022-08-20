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
public class Empleados {
 private String nombre;
    private int edad;
    private String hora_tinicio;
    private String hora_tsalida;
    private double sueldo;
    private String RRHH;
    private ArrayList <String> estadoT = new ArrayList();   

    public Empleados() {
    }

    public Empleados(String nombre, int edad, String hora_tinicio, String hora_tsalida, double sueldo, String RRHH) {
        this.nombre = nombre;
        this.edad = edad;
        this.hora_tinicio = hora_tinicio;
        this.hora_tsalida = hora_tsalida;
        this.sueldo = sueldo;
        this.RRHH = RRHH;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHora_tinicio() {
        return hora_tinicio;
    }

    public void setHora_tinicio(String hora_tinicio) {
        this.hora_tinicio = hora_tinicio;
    }

    public String getHora_tsalida() {
        return hora_tsalida;
    }

    public void setHora_tsalida(String hora_tsalida) {
        this.hora_tsalida = hora_tsalida;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getRRHH() {
        return RRHH;
    }

    public void setRRHH(String RRHH) {
        this.RRHH = RRHH;
    }

    public ArrayList<String> getEstadoT() {
        return estadoT;
    }

    public void setEstadoT(ArrayList<String> estadoT) {
        this.estadoT = estadoT;
    }
    
    
}
