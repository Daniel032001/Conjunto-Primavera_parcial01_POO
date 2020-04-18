package com.FGGP.x00055419;

public class PlazaFija extends Empleado {
    public PlazaFija(String nombre, String puesto, double salario) {
        super(nombre, puesto, salario);
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
}
