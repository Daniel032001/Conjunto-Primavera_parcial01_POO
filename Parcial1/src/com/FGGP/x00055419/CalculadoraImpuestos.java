/*package com.FGGP.x00055419;
import javax.swing.*;

public final class CalculadoraImpuestos {
    int tipoBuscado;
    private double totalRenta, totalISSS, totalAFP;
    public double ISSS,Renta,AFP,pagoEmpleado,restante,x;


    private CalculadoraImpuestos(){
    }
    public double calcularPago(Empleado empleado){*/
        /*Empresa.planilla.forEach((tipoEmpleado)->{
        });if(Empresa.planilla.contains(""))*/
       /* empleado.getSalario()=salario;
        tipoBuscado=Integer.parseInt(JOptionPane.showInputDialog(null,"1) Servicio Provisional\n2) Plaza Fija\nDigite opcion: ","Selecciona el tipo de Empleado",JOptionPane.QUESTION_MESSAGE));
        if(empleado instanceof PlazaFija){
            AFP=0.0625*empleado.getSalario();
            ISSS=0.03*empleado.getSalario();
            totalISSS+=ISSS;
            totalAFP+=AFP;
            restante=empleado.getSalario()-AFP-ISSS;
            x=restante;
            if(empleado.getSalario()>=0.01 && empleado.getSalario()<=472.00){
                Renta=0;
            } else if(empleado.getSalario()>=472.01 && empleado.getSalario()<=895.24) {
                Renta = 0.1 * (x - 472) + 17.67;
            }  else if(empleado.getSalario()>=895.25 && empleado.getSalario()<=2038.10) {
                Renta = 0.2 * (x - 472) + 17.67;
            } else if(empleado.getSalario()>=2038.11) {
                Renta = 0.3 * (x - 472) + 17.67;
            }
            totalRenta+=Renta;
            pagoEmpleado=restante-Renta;

        }else if(empleado instanceof ServicioProfesional){
            Renta = 0.1 * empleado.getSalario();
            totalRenta+=Renta;
            pagoEmpleado = empleado.getSalario() - Renta;
            JOptionPane.showInputDialog(null, "Total Pago: " + pagoEmpleado, JOptionPane.QUESTION_MESSAGE);
        }*/
       /* switch (tipoBuscado){
            case 1://SERVICIO PROVICIONAL
                Renta=0.1*empleado.getSalario();
                pagoEmpleado=empleado.getSalario()-Renta;
                break;
            case 2://PLAZA FIJA
                AFP=0.0625*empleado.getSalario();
                ISSS=0.03*empleado.getSalario();
                restante=empleado.getSalario()-AFP-ISSS;
                x=restante;
                if(empleado.getSalario()>=0.01 && empleado.getSalario()<=472.00){
                    Renta=0;
            } else if(empleado.getSalario()>=472.01 && empleado.getSalario()<=895.24) {
                    Renta = 0.1 * (x - 472) + 17.67;
                }  else if(empleado.getSalario()>=895.25 && empleado.getSalario()<=2038.10) {
                    Renta = 0.2 * (x - 472) + 17.67;
                } else if(empleado.getSalario()>=2038.11) {
                    Renta = 0.3 * (x - 472) + 17.67;
                }
                pagoEmpleado=restante-Renta;
                break;`
        }*/
   /* }
    public String mostrarTotales(){
        totalISSS+=ISSS;
        totalRenta+=Renta;
        totalAFP+=AFP;
        JOptionPane.showInputDialog(null,"Total AFP: "+totalAFP+"\nTotal ISSS: "+totalISSS+"\nTotal Renta: "+totalRenta,"Totales",JOptionPane.QUESTION_MESSAGE));
    }
}*/
