package com.FGGP.x00055419;
<<<<<<< HEAD
=======

import javax.swing.*;
>>>>>>> bcecf5aae190c88259fa1f58e924a947aae08e90
public class Main {
    public static double salario;
    public static String nombreempleado,puesto,nombredoc,numerodoc;
    public static int meses,extension,tipo;
    public static void main(String[] args) {
	Empresa nuevaEmpresa;
	int op=0;
	String nombreempresa="";
	do{
        nombreempresa=JOptionPane.showInputDialog(null,"Ingresa el nombre de la empresa : ","Crear nueva empresa",JOptionPane.INFORMATION_MESSAGE);
    }
	while(nombreempresa.equals(""));
	nuevaEmpresa=new Empresa(nombreempresa);
    do {
    op = menu();
    switch (op){
        case 1:
            agregarempleado();
            if(tipo==1){
                PlazaFija plaza=new PlazaFija(nombreempleado,puesto,salario,meses);
                nuevaEmpresa.addEmpleado(plaza);
            }else{
                ServicioProfesional servicio=new ServicioProfesional(nombreempleado,puesto,salario,extension);
                nuevaEmpresa.addEmpleado(servicio);
            }
            break;
        case 2:
            break;
        case 3:
            break;
        case 4:
            break;
        case 5:
            break;
        case 6:
            break;
    }
   }
    while(op!=5);
    }
    public static void campovacio(){
        JOptionPane.showMessageDialog(null,"No puedes dejar el campo vacio","Error",JOptionPane.ERROR_MESSAGE);
    }
    public static void agregarempleado(){
        nombreempleado="";puesto="";salario=0;tipo=0;
        while(nombreempleado.equals("")) {
            nombreempleado = JOptionPane.showInputDialog(null, "Nombre: ", "Ingresa el nombre", JOptionPane.QUESTION_MESSAGE);
            if(nombreempleado.equals("")){
                campovacio();
            }
        }
        while(puesto.equals("")) {
            puesto = JOptionPane.showInputDialog(null, "Puesto: ", "Ingresa el puesto", JOptionPane.QUESTION_MESSAGE);
            if(puesto.equals("")){
                campovacio();
            }
        }
        while(salario==0) {
            try {
                salario = Double.parseDouble(JOptionPane.showInputDialog(null, "omg", "omg", JOptionPane.INFORMATION_MESSAGE));
            } catch (NumberFormatException e) {
               campovacio();
            }
        }
        while(tipo==0) {
            try {
                tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona :\n1)Plaza fija\n2)Servicio Profesional",
                        "Tipo de servicio", JOptionPane.QUESTION_MESSAGE));
            }
            catch (NullPointerException e){
                campovacio();
            }
            if(tipo>2 || tipo<0){
                JOptionPane.showMessageDialog(null,"Opcion Invalida","Error",JOptionPane.ERROR_MESSAGE);
                tipo=0;
            }
        }
    }
    public static int menu(){
    int valor=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa una opcion \n1)Agregar empleado\n2)Despedir empleado+"+
            "\n 3)Ver lista de empleados\n4)Calcular sueldo\n5)Mostrar totales", "Menu principal", JOptionPane.QUESTION_MESSAGE));
    return valor;
    }
}
