package com.training;
import javax.swing.*;

public class HolaMundoForm {
    static String mensaje;

    public static void main(String[] args) {
        String[] idiomas = {"Español","Ingles","Portugues","Italiano","Aleman","Frances","Ruso","Chino","Japones"};
        String idiomaIng = (String)JOptionPane.showInputDialog(null, "Seleccione el idioma del saludo",
                "Sofka_U::Training::Jorge Martinez::Ejercicio CERO", JOptionPane.QUESTION_MESSAGE, null, idiomas, idiomas[0]);
        idioma(idiomaIng);
        JOptionPane.showMessageDialog(null,mensaje,"Ejercicio CERO::Jorge Martinez(" + idiomaIng + ")",1);

    }//Fin main

    static String idioma (String pIdioma){
        switch(pIdioma){
            case "Español": mensaje = "HOLA MUNDO";
                break;
            case "Ingles": mensaje = "HELLO WORLD";
                break;
            case "Portugues": mensaje = "OLA MUNDO";
                break;
            case "Italiano": mensaje = "CIAO MONDO";
                break;
            case "Aleman": mensaje = "HALO WELT";
                break;
            case "Frances": mensaje = "SALUT MONDE";
                break;
            case "Ruso": mensaje = "-PRIVET MIR-";
                break;
            case "Chino": mensaje = "-NI HAO SHIJIE-";
                break;
            case "Japones": mensaje = "-KONNICHIWA SEKAI-";
                break;
            default: mensaje = "No selecciono ningun idioma";
        }
        return mensaje;
    }//Fin idioma
}//Fin Clase
