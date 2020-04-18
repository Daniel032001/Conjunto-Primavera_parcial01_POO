package com.FGGP.x00055419;

public class PlazaFija {
    private int extension;
    public String nombre, puesto;
    public double salario;

    public PlazaFija(int extension, String nombre, String puesto, double salario) {
        this.extension = extension;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
}
