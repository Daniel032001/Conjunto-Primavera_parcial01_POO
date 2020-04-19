package com.FGGP.x00055419;
import javax.swing.*;
public class Main {
        public static double salario;
        public static boolean agregardoc;
        public static String nombreempleado,puesto,nombredoc,numerodoc;
        public static int meses,extension,tipo;
        public static void main(String[] args) {
            ServicioProfesional servicio;PlazaFija plaza;
            Empresa nuevaEmpresa;
            int op = 0;
            String nombreempresa = "";
            do {
                try {
                    nombreempresa = JOptionPane.showInputDialog(null, "Ingresa el nombre de la empresa : ", "Crear nueva empresa", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (NullPointerException e){
                    campovacio();
                }
                if(nombreempresa==null){
                    System.exit(0);
                }
            }
            while (nombreempresa.equals("") );
            nuevaEmpresa = new Empresa(nombreempresa);
            do {
                op = menu();
                switch (op) {
                    case 1://AGREGAR EMPLEADO
                        agregarempleado();
                        agregardoc=true;
                        if (tipo == 1) {
                            meses=0;
                            while(meses==0){
                                try {
                                    meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Meses :",
                                            "Ingresa los meses", JOptionPane.QUESTION_MESSAGE));
                                } catch (NullPointerException e) {
                                    campovacio();
                                }
                                catch(NumberFormatException e){
                                    JOptionPane.showMessageDialog(null,"Dato invalido","Error",JOptionPane.ERROR_MESSAGE);
                                }
                                if(meses<0){
                                    JOptionPane.showMessageDialog(null,"Ingresa un valor valido","Error",JOptionPane.ERROR_MESSAGE);
                                    meses=0;
                                }
                            }
                            plaza = new PlazaFija(nombreempleado, puesto, salario, meses);
                            nuevaEmpresa.addEmpleado(plaza);
                            while(agregardoc==true) {
                                agregardoc();
                                Documento nuevodocumento= new Documento(nombredoc, numerodoc);
                                plaza.addDocumento(nuevodocumento);
                            }
                            System.out.println(plaza.toString());
                        } else {
                            extension=0;
                            while(extension==0){
                                try {
                                    extension= Integer.parseInt(JOptionPane.showInputDialog(null, "Contrato :",
                                            "Extension del contrato", JOptionPane.QUESTION_MESSAGE));
                                } catch (NullPointerException e) {
                                    campovacio();
                                }
                                if(extension<0){
                                    JOptionPane.showMessageDialog(null,"Ingresa un valor valido","Error",JOptionPane.ERROR_MESSAGE);
                                    extension=0;
                                }
                            }
                            servicio= new ServicioProfesional(nombreempleado, puesto, salario, extension);
                            nuevaEmpresa.addEmpleado(servicio);
                            while(agregardoc==true) {
                                agregardoc();
                                Documento nuevodocu= new Documento(nombredoc, numerodoc);
                                servicio.addDocumento(nuevodocu);
                            }
                            System.out.println(servicio.toString());
                          }
                        JOptionPane.showMessageDialog(null,"Empleado agregado correctamente","Hecho",JOptionPane.INFORMATION_MESSAGE);

                        break;
                    case 2://DESPEDIR EMPLEADO
                        nombreempleado="";
                        String nombreaux="";
                       while(nombreempleado.equals("")) {
                           try {
                               nombreempleado = JOptionPane.showInputDialog(null, "Nombre :", "Ingresa nombre del empleado",JOptionPane.INFORMATION_MESSAGE);
                           }
                           catch (NullPointerException e){
                               campovacio();
                           }
                       }
                        for (Empleado aux:nuevaEmpresa.getPlanilla()) {
                            if(nombreempleado.equals(aux.getNombre())){
                                nombreaux=aux.getNombre();
                            }
                        }
                        if(nombreaux==""){
                           JOptionPane.showMessageDialog(null,"No se encontro este empleado","Error",JOptionPane.ERROR_MESSAGE);
                        }else{
                            nuevaEmpresa.quitEmpleado(nombreaux);
                        }
                       break;
                    case 3://VER LISTA DE EMPLEADOS
                        String mensaje = nuevaEmpresa.getPlanilla().toString();
                        JOptionPane.showMessageDialog(null, mensaje, "Lista de empleados", JOptionPane.INFORMATION_MESSAGE);
                       break;
                    case 4://CALCULAR SUELDO
                        int valores=0;
                        for (Empleado aux: nuevaEmpresa.getPlanilla()
                             ) {
                            valores++;
                            System.out.println("omg");
                            CalculadoraImpuestos.calcularPago(aux);
                        }
                        if(valores==0){
                            JOptionPane.showMessageDialog(null,"No hay datos","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case 5://MOSTRAR TOTALES
                        JOptionPane.showMessageDialog(null, CalculadoraImpuestos.mostrarTotales(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Gracias por usar el programa, te recomendamos buscar: " +
                                "Tu ultima cancion-Los temerarios...", "Saliendo...", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            }
            while (op != 6);
        }
        public static void campovacio () {
            JOptionPane.showMessageDialog(null, "No puedes dejar el campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
        public static void agregardoc(){
            nombredoc="";numerodoc="";
            int eleccion=0;
            while (nombredoc.equals("")) {
                nombredoc = JOptionPane.showInputDialog(null, "Nombre :", "Documento", JOptionPane.QUESTION_MESSAGE);
                if (nombredoc.equals("")) {
                    campovacio();
                }
            }
            while(numerodoc.equals("")){
                numerodoc = JOptionPane.showInputDialog(null, "numero :", "Documento", JOptionPane.QUESTION_MESSAGE);
                if (numerodoc.equals("")) {
                    campovacio();
                }
            }
            while (eleccion == 0) {
                try {
                    eleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseas agregar otro documento?\n1)Si\n2)No",
                            "Documento", JOptionPane.QUESTION_MESSAGE));
                } catch (NullPointerException e ) {
                    campovacio();
                }
                catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Dato invalido","Error",JOptionPane.ERROR_MESSAGE);
                }
                if (tipo > 2 || tipo < 0) {
                    JOptionPane.showMessageDialog(null, "Opcion Invalida", "Error", JOptionPane.ERROR_MESSAGE);
                    tipo = 0;
                }
                if(eleccion==2){
                    agregardoc=false;
                }
            }
        }
        public static void agregarempleado () {
            nombreempleado = "";
            puesto = "";
            salario = 0;
            tipo = 0;
            while (nombreempleado.equals("")) {
                nombreempleado = JOptionPane.showInputDialog(null, "Nombre: ", "Ingresa el nombre", JOptionPane.QUESTION_MESSAGE);
                if (nombreempleado.equals("")) {
                    campovacio();
                }
            }
            while (puesto.equals("")) {
                puesto = JOptionPane.showInputDialog(null, "Puesto: ", "Ingresa el puesto", JOptionPane.QUESTION_MESSAGE);
                if (puesto.equals("")) {
                    campovacio();
                }
            }
            while (salario == 0) {
                try {
                    salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario :", "Ingresa un salario", JOptionPane.INFORMATION_MESSAGE));
                } catch (NumberFormatException e) {
                    campovacio();
                }
            }
            while (tipo == 0) {
                try {
                    tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona :\n1)Plaza fija\n2)Servicio Profesional",
                            "Tipo de servicio", JOptionPane.QUESTION_MESSAGE));
                } catch (NullPointerException e ) {
                    campovacio();
                }
                catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Dato invalido","Error",JOptionPane.ERROR_MESSAGE);
                }
                if (tipo > 2 || tipo < 0) {
                    JOptionPane.showMessageDialog(null, "Opcion Invalida", "Error", JOptionPane.ERROR_MESSAGE);
                    tipo = 0;
                }
            }
        }
        public static int menu () {
            int valor=0;
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa una opcion \n1)Agregar empleado\n2)Despedir empleado" +
                        "\n3)Ver lista de empleados\n4)Calcular sueldo\n5)Mostrar totales\n6)Salir", "Menu principal", JOptionPane.QUESTION_MESSAGE));
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Dato invalido","Error",JOptionPane.ERROR_MESSAGE);
            }
            catch (NullPointerException e){
                campovacio();
            }
       return valor;
      }
}
