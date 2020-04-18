package com.FGGP.x00055419;

public class Documento {
    private String nombre,numero;

    public Documento(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nombre='" + nombre + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }

    public String getNumero() {
        return numero;
    }
}
