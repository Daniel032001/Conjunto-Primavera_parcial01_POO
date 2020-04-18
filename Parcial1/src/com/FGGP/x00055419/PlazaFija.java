package com.FGGP.x00055419;

public class PlazaFija extends Empleado {
<<<<<<< HEAD
    int extension;
    public PlazaFija(String nombre, String puesto, double salario,int extension ) {
=======
    private int extension;
    public PlazaFija(String nombre, String puesto, double salario,int extension) {
>>>>>>> bcecf5aae190c88259fa1f58e924a947aae08e90
        super(nombre, puesto, salario);
        this.extension=extension;
    }
    public int getExtension() {
        return extension;
    }
    public void setExtension(int extension) {
        this.extension = extension;
    }
}
