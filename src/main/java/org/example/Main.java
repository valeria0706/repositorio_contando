package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String password;
        Integer numpassword;
        Integer contadorIntentos = 0;
        Integer contadorMalas = 0;
        Integer contadorBuenas = 0;
        System.out.print("digita el numero de contraseñas que vas a ingresar: ");
        numpassword = keyboard.nextInt();
        System.out.println("ingrese las contraseñas");
        do {
            contadorIntentos = contadorIntentos+1;
            password = keyboard.next();
            Integer contadorLetras = password.length();
            if (contadorLetras>=8){
                contadorBuenas=contadorBuenas+1;

            }else {
                contadorMalas = contadorMalas + 1;

            }
        }while (contadorIntentos<numpassword);
        System.out.println("el numero de las contraseñsd buenas fue de " + contadorBuenas + " y el numero de contraseñas malas fue de "+contadorMalas);
    }
}