package com.generation;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Estructura de Control If
    /*
        if(condicion) {

        }else if {

        } else {

        }
    */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        System.out.println("¿Cual es tu nombre?");
        sc.nextLine();
        String nombre = sc.nextLine();


        if(edad > 18){
            System.out.println("Felicidades " + nombre + ", puedes votar");
        } else{
            System.out.println("Hola " + nombre + " Aun no puedes votar");
        }

*/

        //Solicitar a usuario 3 angulos de un triangulo y determinar si el triangulo
        //es valido

        /*
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Determinar si un triangulo es valido:");
        System.out.println("1° - Ingresa el primer angulo");
        int angulo1 = sc2.nextInt();
        System.out.println("2° - Ingresa el segundo angulo");
        int angulo2 = sc2.nextInt();
        System.out.println("3° - Ingresa el tercer angulo");
        int angulo3 = sc2.nextInt();
        sc2.close();

        int anguloTotal = angulo1 + angulo2 + angulo3;

        if(anguloTotal == 180){
            System.out.println("Es un angulo valido con " + anguloTotal + "°");
        } else{
            System.out.println("Es un angulo invalido con " + anguloTotal + "°");
        }
        */

        //Pedir un año al usuario por consola y determianr si el año es bisiesto
    /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Determinar si un año es bisiesto:");
        System.out.println("1° - Ingresa el año");
        int año = sc.nextInt();

        if(año % 4 == 0 && año % 100 != 0){
            System.out.println("Año bisiesto normal");
        } else{
            System.out.println("Año no bisiesto");
        }

     */

        // Control de Flujo switch
        /*
        switch(condicion) {
            case 1:
                codigo;
                break;
            case 2:
                codigo;
                break;
            default:
                codigo
        }
         */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num1 = sc.nextInt();
        System.out.println("Ingresa otro numero");
        int num2 = sc.nextInt();
        System.out.println("Ingresa la operacion deseada \n1)Suma \n2)Resta \n3)Multiplicacion \n4)Division");
        int opcion = sc.nextInt();
        float resultado = 0;

        switch (opcion){
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("La operacion que seleccionaste es invalida");
        }
        System.out.println(resultado);

         */

        // Pedir un numero al usuario y dependiendo la respuesta mostrar un dia de la semana,
        // ejemplo: 1) Domingo, 2)Lunes ... 7) Sabado
        // si elige un numero fuera de ese rango mostrar un mensaje de error

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero para saber que dia de la semana es");
        int num1 = sc.nextInt();
        sc.close();
        String dia = "";

        switch(num1){
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
        }

        if(dia == ""){
            System.out.println("ERROR: Elegiste un dia fuera del rango");
        } else{
            System.out.println("El dia que elegiste es " + dia);
        }

    }

}
