package org.example;

import java.util.Scanner;

//import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        String cedula;

        //LocalDate fecha=LocalDate.
        String nombresCliente;

        String nombreempleado;
        String contrasenaEmpleado;
        String nombreEmpleadoBD="andres1234";
        String contrasenaEmpleadoBD="admin123";

        Integer opcion;
        Scanner lea=new Scanner(System.in);

        System.out.println("****Pan de Bonos Nairo");
        System.out.println("**********************");
        System.out.println("Apreciado empleado; inicie sesion por favor: ");
        boolean loginExitoso = false;

        while (!loginExitoso) {
            System.out.println("Digite su usuario: ");
            nombreempleado=lea.nextLine();
            System.out.println("Digite su contraseña: ");
            contrasenaEmpleado=lea.nextLine();

            //login
            if (nombreempleado.equals(nombreEmpleadoBD) && contrasenaEmpleado.equals(contrasenaEmpleadoBD)){
                System.out.println("Cargando sistema...");
                loginExitoso= true;
            }else {
                System.out.println("*usuario incorrecto*");
            }
        }
        System.out.println("\n....pandesoftware....");
        System.out.println("1. Registrar Compra ");
        System.out.println("2. Calcular Total ");
        System.out.println("3. Modificar Compra ");
        System.out.println("4. SALIR ");
        do {
            System.out.println("Seleccione una opcion: ");
            opcion=lea.nextInt();

            Integer cantidadTradicional=0;
            Integer cantidadGuayaba=0;
            Integer cantidadArequipe=0;
            Integer cantidadQueso=0;
            Integer cantidadBebidas=0;

            Integer productoSeleccionado;
            switch (opcion) {
                case 1:
                    System.out.println("1. Pandebono Traicional ($8000)");
                    System.out.println("2. Pandebono Guayaba ($9500)");
                    System.out.println("3. Pandebono Arequipe ($12000)");
                    System.out.println("4. Pandebono 7 Quesos ($20000)");
                    System.out.println("5. Bebida ($9500)");
                    System.out.println("6. Enviar Pedido");
                    System.out.println("................................");

                    do {
                        System.out.println("Digite producto deseado: ");
                        productoSeleccionado=lea.nextInt();
                        switch (productoSeleccionado){
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
                            default:
                                break;
                        }
                    }while (productoSeleccionado!=6);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }

        }while (opcion !=4);
        



    }
}