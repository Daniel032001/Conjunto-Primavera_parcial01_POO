package com.FGGP.x00055419;
import java.util.ArrayList;
public abstract class Empleado {
    protected String nombre, puesto;
    protected ArrayList<Documento> documento;
    protected double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public ArrayList<Documento> getDocumento() {
        return documento;
    }
    public addDocumento(Documento){

    }
    public removeDocumento(String documento){

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
