package com.FGGP.x00055419;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
	Empresa nuevaEmpresa;
	int op=0;
	String nombreempresa="";
	do{
        nombreempresa=JOptionPane.showInputDialog(null,"Ingresa el nombre de la empresa : ","Crear nueva empresa",JOptionPane.INFORMATION_MESSAGE);
        if(nombreempresa!=null) {
            nuevaEmpresa=new Empresa(nombreempresa);
        }
    }
	while(nombreempresa.equals(""));
    do {
    op = menu();
    switch (op){
        case 1:
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
    public static int menu(){
    int valor=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa una opcion \n1)Agregar empleado\n2)Despedir empleado+"+
            "\n 3)Ver lista de empleados\n4)Calcular sueldo\n5)Mostrar totales", "Menu principal", JOptionPane.QUESTION_MESSAGE));
    return valor;
    }
}
