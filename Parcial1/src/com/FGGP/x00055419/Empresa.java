package com.FGGP.x00055419;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> planilla=new ArrayList();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public ArrayList<Empleado> getPlanilla() {
        return planilla;
    }
    public void addEmpleado(Empleado emp){
        planilla.add(emp);
    }
    public void quitEmpleado(String nombre){
        if(planilla.removeIf(s->s.getNombre().equals(nombre))) {
            System.out.println("grande");
        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", planilla=" + planilla +
                '}';
    }
}
