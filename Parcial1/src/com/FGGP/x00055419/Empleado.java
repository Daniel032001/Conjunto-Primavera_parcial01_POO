package com.FGGP.x00055419;
import java.util.ArrayList;
public abstract class Empleado {
    protected String nombre, puesto;
    protected ArrayList<Documento> documentos=new ArrayList();
    protected double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", documento=" + documentos +
                ", salario=" + salario +
                '}';
    }

    public String getPuesto() {
        return puesto;
    }

    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }
    public void addDocumento(Documento doc){
        documentos.add(doc);
    }
    public void removeDocumento(String documento){

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
