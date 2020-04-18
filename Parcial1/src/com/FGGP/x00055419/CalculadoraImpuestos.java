package com.FGGP.x00055419;
import javax.swing.*;

public static class CalculadoraImpuestos {
    int tipoBuscado;
    private double totalRenta, totalISSS, totalAFP;
    public double pagoEmpleado,restante,x;

    private CalculadoraImpuestos(){
    }

    public double calcularPago(Empleado empleado){
        tipoBuscado=Integer.parseInt(JOptionPane.showInputDialog(null,"1) Servicio Provisional\n2) Plaza Fija\nDigite opcion: ","Selecciona el tipo de Empleado",JOptionPane.QUESTION_MESSAGE));
        switch (tipoBuscado){
            case 1://SERVICIO PROVICIONAL
                totalRenta=0.1*salario;
                pagoEmpleado=salario*totalRenta;
                break;
            case 2://PLAZA FIJA
                totalAFP=0.0625*salario;
                totalISSS=0.03*salario;
                restante=salario-totalAFP-totalISSS;
                x=restante;
                if(restante>=0.01 && restante<=472.00){
                    totalRenta=0;
            } else if(restante>=472.01 && restante<=895.24) {
                    totalRenta = 0.1 * (x - 472) + 17.67;
                }  else if(restante>=895.25 && restante<=2038.10) {
                    totalRenta = 0.2 * (x - 472) + 17.67;
                } else if(restante>=2038.11) {
                    totalRenta = 0.3 * (x - 472) + 17.67;
                }
                pagoEmpleado=restante-totalRenta;
                break;
        }
    }
    public String mostrarTotales(){
        JOptionPane.showInputDialog(null,"Total AFP: "+totalAFP+"\nTotal ISSS: "+totalISSS+"\nTotal Renta: "+totalRenta,"Totales",JOptionPane.QUESTION_MESSAGE));
    }
}
