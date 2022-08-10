package ui;
import model.Dog;

import model.Friend;

import java.awt.EventQueue;
import java.util.Scanner;

import controler.SearchMethod;
import org.w3c.dom.ls.LSOutput;

public class DriverProgram {
    public static void main(String[] args){
        System.out.println("PROGRAMA PERRERA 2022");

        Friend miAmigo;
        Dog lostDog;
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese los datos requeridos para iniciar el programa");
        miAmigo = enterFriendData(in);
        lostDog = enterDogData(in);

        String option = "";

        SearchMethod llamarPerrera = new SearchMethod(20, 5, 0);
        SearchMethod anuncioEnPoste = new SearchMethod(20, 10, 25);
        SearchMethod anuncioPeriodico = new SearchMethod(20, 15, 125);


        while (!option.equals("7")) {

            printMenu();


            option = "" + in.nextInt();

            switch (option) {
                case "1":{
                    miAmigo = enterFriendData(in);
                }break;

                case "2":{
                    lostDog = enterDogData(in);
                }break;

                case "3":{
                    if (llamarPerrera.operationCanBeExecuted(miAmigo)) {
                        //Si se puede ejecutar la busqueda
                        if (llamarPerrera.isSuccessfulOperation(miAmigo, lostDog)) {
                            //Si se encontro el perrito
                            System.out.println("El perrito ha sido encontrado");
                            ShowDogData(lostDog);
                        } else {
                            //No se encontro el perrito
                            System.out.println("No se tuvo exito con la busqueda su nuevo saldo es " + miAmigo.getActualMoney());
                        }
                    } else {
                        //No se puede ejecutar la busqueda
                        System.out.println("La busqueda no se pudo ejecutar por: " + llamarPerrera.getFailureDetails());
                    }

                }break;


                case "4":{
                    if (anuncioEnPoste.operationCanBeExecuted(miAmigo)) {
                        //Si se puede ejecutar la busqueda
                        if (anuncioEnPoste.isSuccessfulOperation(miAmigo, lostDog)) {
                            //Si se encontro el perrito
                            System.out.println("El perrito ha sido encontrado");
                            ShowDogData(lostDog);
                        } else {
                            //No se encontro el perrito
                            System.out.println("No se tuvo exito con la busqueda su nuevo saldo es " + miAmigo.getActualMoney());
                        }
                    } else {
                        //No se puede ejecutar la busqueda
                        System.out.println("La busqueda no se pudo ejecutar por: " + anuncioEnPoste.getFailureDetails());
                    }

                }break;

                case "5":{
                    if (anuncioPeriodico.operationCanBeExecuted(miAmigo)) {
                        //Si se puede ejecutar la busqueda
                        if (anuncioPeriodico.isSuccessfulOperation(miAmigo, lostDog)) {
                            //Si se encontro el perrito
                            System.out.println("El perrito ha sido encontrado");
                            ShowDogData(lostDog);
                        } else {
                            //No se encontro el perrito
                            System.out.println("No se tuvo exito con la busqueda su nuevo saldo es " + miAmigo.getActualMoney());
                        }
                    } else {
                        //No se puede ejecutar la busqueda
                        System.out.println("La busqueda no se pudo ejecutar por: " + anuncioPeriodico.getFailureDetails());
                    }

                }break;

                case "6":{
                    System.out.println("El dinero disponible es: " + miAmigo.getActualMoney());
                }break;

                case "7":{
                    System.out.println("GRACIAS POR USAR EL PROGRAMA");
                }break;

                default:{
                    System.out.println("OPCION NO VALIDA");
                }
            }

        }
    }
}


