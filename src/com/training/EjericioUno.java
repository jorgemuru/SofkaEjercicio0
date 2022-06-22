package com.training;
import java.util.Scanner;

public class EjericioUno {
    static String usuario = "";
    static String celular = "";
    static int edad = 0;
    static Scanner lector = new Scanner (System.in);


    public static void main(String[] args) {
        System.out.println("Sofka U :: DEV C3 UY :: Training");
        System.out.println("Ejercicio 1 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        cargarDatos();

        if (usuario == "" || celular == "" || edad <= 0){
            System.out.println("ERROR!!!! Debe completar todos los datos y la edad debe ser mayor a CERO");
        }
        else{
            System.out.println("Bienvenido/a Señor/a " + usuario + ", es un placer para nosotros contar con una persona de " + edad + " años.");
            System.out.println("Proximamente nos comunicaremos con usted al numero " + celular + ".");
            System.out.println("¡Feliz dia!");
            System.out.println("-------------------------------------------");
        }

    }//Fin Main

    //Metodo para cargar datos
    public static void cargarDatos(){
        System.out.println("Ingrese un nombre de Usuario:");
        usuario = lector.next();
        System.out.println("Ingrese el numero de Celular:");
        celular = lector.next();
        System.out.println("Ingrese la Edad:");
        String dato = lector.next();
        edad = Integer.parseInt(dato);
    }//Fin cargarDatos

}//Fin clase