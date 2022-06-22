package com.training;

import javax.swing.*;

public class EjercicioUnoForm {
    static String usuarioF = "";
    static String celularF = "";
    static String edadF = "";

    public static void main(String[] args) {
    usuarioF = (String) JOptionPane.showInputDialog(null, "Ingrese el Nombre del usuario","Sofka_U::Training::Jorge Martinez::Ejercicio Uno",1);
    celularF = (String) JOptionPane.showInputDialog(null, "Ingrese el Numero de Celular","Sofka_U::Training::Jorge Martinez::Ejercicio Uno",1);
    edadF = (String) JOptionPane.showInputDialog(null, "Ingrese la Edad del Usuario","Sofka_U::Training::Jorge Martinez::Ejercicio Uno",1);

    JOptionPane.showMessageDialog(null, "Bienvenido/a Señor/a " + usuarioF + ", es un placer para nosotros contar con una persona de " + edadF + " años.\n\"Proximamente nos comunicaremos con usted al numero " + celularF + ".\n\"¡¡¡¡¡FELIZ DIA!!!!!", "Sofka_U::Training::Jorge Martinez::Ejercicio Uno",1);

    }//fin main
}//Fin clase
