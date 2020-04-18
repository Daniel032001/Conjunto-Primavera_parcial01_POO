package com.FGGP.x00055419;
import javax.swing.*;

public final class CalculadoraImpuestos {
    int tipoBuscado;
    private double totalRenta, totalISSS, totalAFP;
    public double isss,renta,afp,pagoEmpleado,restante,x;

    private CalculadoraImpuestos(){
    }

    public double calcularPago(Empleado empleado){
        tipoBuscado=Integer.parseInt(JOptionPane.showInputDialog(null,"1) Servicio Provisional\n2) Plaza Fija\nDigite opcion: ","Selecciona el tipo de Empleado",JOptionPane.QUESTION_MESSAGE));
        switch (tipoBuscado){
            case 1://SERVICIO PROVICIONAL
                renta=0.1*empleado.getSalario();
                pagoEmpleado=empleado.getSalario()*renta;
                break;
            case 2://PLAZA FIJA
                afp=0.0625*empleado.getSalario();
                isss=0.03*empleado.getSalario();
                restante=empleado.getSalario()-afp-isss;
                x=restante;
                if(restante>=0.01 && restante<=472.00){
                    renta=0;
            } else if(restante>=472.01 && restante<=895.24) {
                    renta = 0.1 * (x - 472) + 17.67;
                }  else if(restante>=895.25 && restante<=2038.10) {
                    renta = 0.2 * (x - 472) + 17.67;
                } else if(restante>=2038.11) {
                    renta = 0.3 * (x - 472) + 17.67;
                }
                pagoEmpleado=restante-renta;
                break;
        }
        return pagoEmpleado;
    }
    public String mostrarTotales(){
        totalISSS+=isss;
        String mensaje="";
        totalRenta+=renta;
        totalAFP+=afp;
        JOptionPane.showMessageDialog(null,"Total AFP: "+totalAFP+"\nTotal ISSS: "+totalISSS+"\nTotal Renta: "+totalRenta,"Totales",JOptionPane.INFORMATION_MESSAGE);
        return mensaje;
    }
}
