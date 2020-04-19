package com.FGGP.x00055419;
import java.math.BigDecimal;
import java.math.RoundingMode;
public final class CalculadoraImpuestos {
    private static double totalRenta = 0;
    private static double totalISSS = 0;
    private static double totalAFP = 0;

    private CalculadoraImpuestos() {
    }

    public static double calcularPago(Empleado empleado) {//CALCULANDO DESCUENTOS POR TIPO DE EMPLEADO
        double ISSS = 0, Renta = 0, AFP = 0, pagoEmpleado = 0, restante = 0, x = 0;
        if (empleado instanceof PlazaFija) {//SI ES PLAZA FIJA
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
                Renta = 0.2 * (x - 895.24) + 60;
            } else if (empleado.getSalario() >= 2038.11) {
                Renta = 0.3 * (x - 2038.1) + 288.57;
            }
            totalRenta += Renta;
            pagoEmpleado = restante - Renta;

        } else if (empleado instanceof ServicioProfesional) {//SI ES SERVICIO PROFESIONAL
            Renta = 0.1 * empleado.getSalario();
            totalRenta += Renta;
            pagoEmpleado = empleado.getSalario() - Renta;
        }
        BigDecimal bigDecimal = new BigDecimal(pagoEmpleado).setScale(2, RoundingMode.UP);
        return bigDecimal.doubleValue();
    }

    public static String mostrarTotales() {
        BigDecimal bigDecimal = new BigDecimal(totalAFP).setScale(2, RoundingMode.UP);
        BigDecimal bigDecimal1 = new BigDecimal(totalISSS).setScale(2, RoundingMode.UP);
        BigDecimal bigDecimal2= new BigDecimal(totalRenta).setScale(2, RoundingMode.UP);
        String totales="";
        if (totalAFP == 0 && totalRenta == 0 && totalISSS == 0) {
            totales="No se han calculado pagos";
        }
        else{
            totales = "Total AFP: " + bigDecimal.doubleValue() + "\nTotal ISSS: " + bigDecimal1.doubleValue() + "\nTotal Renta: " + bigDecimal2.doubleValue();
        }
        return totales;
    }
}