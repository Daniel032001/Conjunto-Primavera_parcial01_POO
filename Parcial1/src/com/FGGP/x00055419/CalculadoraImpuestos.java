package com.FGGP.x00055419;
import javax.swing.*;

import static javax.swing.JOptionPane.*;

public final class CalculadoraImpuestos {
    private static double totalRenta=0;
    private static double totalISSS=0;
    private static double totalAFP = 0;

    private CalculadoraImpuestos(){}

    public static double calcularPago(Empleado empleado){
        double ISSS=0, Renta = 0, AFP=0, pagoEmpleado=0, restante=0, x=0;
        if (empleado instanceof PlazaFija) {
            AFP = 0.0625 * empleado.getSalario();
            ISSS = 0.03 * empleado.getSalario();
            totalISSS += ISSS;
            totalAFP += AFP;
            restante = empleado.getSalario() - AFP - ISSS;
            x = restante;
            if (empleado.getSalario() >= 0.01 && empleado.getSalario() <= 472.00) {
                Renta = 0;
            } else if (empleado.getSalario() >= 472.01 && empleado.getSalario() <= 895.24) {
                Renta = 0.1 * (x - 472) + 17.67;
            } else if (empleado.getSalario() >= 895.25 && empleado.getSalario() <= 2038.10) {
                Renta = 0.2 * (x - 472) + 17.67;
            } else if (empleado.getSalario() >= 2038.11) {
                Renta = 0.3 * (x - 472) + 17.67;
            }
            totalRenta += Renta;
            pagoEmpleado = restante - Renta;

        } else if (empleado instanceof ServicioProfesional) {
            Renta = 0.1 * empleado.getSalario();
            totalRenta += Renta;
            pagoEmpleado = empleado.getSalario() - Renta;
            showInputDialog(null, "Total Pago: " + pagoEmpleado, QUESTION_MESSAGE);
        }
        return 0.0;
    }
    public static String mostrarTotales(){
        String totales="Total AFP: "+totalAFP+"\nTotal ISSS: "+totalISSS+"\nTotal Renta: "+totalRenta;
        return totales;
    }
}
//calculadora.calcularPago(aux);