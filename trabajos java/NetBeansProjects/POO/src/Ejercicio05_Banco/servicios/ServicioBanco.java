/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05_Banco.servicios;

import Ejercicio05_Banco.entidades.CuentaBancaria;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioBanco {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Random random = new Random();

    public CuentaBancaria CrearCuenta() {
        String nombreApellido = "";
        long dni = 0;
        int numCuenta = random.nextInt(200);
        double saldoActual = 0;

        System.out.println("Bienvenido al Sistema para crear una nueva cuenta: ");

        do {
            System.out.println("Por favor Ingrese su nombre y apellido:");
            nombreApellido = leer.next();

        } while (nombreApellido.equals(""));

        do {

            System.out.println("Ingrese su numero de Dni entre 7 y 8 numeros:");
            dni = leer.nextLong();
            if ((dni < 999999 || dni > 99999999)) {
                System.out.println("Dni mal ingresado, reintente");
            }

        } while (dni < 999999 || dni > 99999999);

        do {

            System.out.println("Ingrese saldo con el que va a establecer su cuenta: ");
            saldoActual = leer.nextDouble();

            if (saldoActual < 0) {
                System.out.println("Saldo negativo ingresado, Reintente:");
            }

        } while (saldoActual < 0);

        return new CuentaBancaria(numCuenta, nombreApellido, dni, saldoActual);
    }

    public void Ingresar(CuentaBancaria usuario) {
        double ingreso = 0;

        System.out.println("Ingresar Dinero:");
        System.out.println("----------------");
        System.out.println("Ingrese el dinero a agregar a su cuenta: ");
        ingreso = leer.nextDouble();
        ingreso = usuario.getSaldoActual() + ingreso;
        usuario.setSaldoActual(ingreso);
        System.out.println("Ingreso exitoso. Su saldo actual es $"+usuario.getSaldoActual());

    }

    public void Retirar(CuentaBancaria usuario) {
        double retiro = 0.;

        System.out.println("Retirar Dinero:");
        System.out.println("--------------");
        System.out.println("Ingrese el dinero a retirar de su cuenta: ");
        retiro = leer.nextDouble();

        if (usuario.getSaldoActual() < retiro) {

            System.out.println("El monto deseado, excede al monto de su cuenta. Solo se extrajeron: "+usuario.getSaldoActual());
            usuario.setSaldoActual(0);
        } else {
            retiro = usuario.getSaldoActual() - retiro;
            usuario.setSaldoActual(retiro);
            System.out.println("Retiro exitoso. Su saldo actual es $"+usuario.getSaldoActual());
        }

    }
    
     public void ExtraccionRapida(CuentaBancaria usuario) {
        double extraccionr = 0;
        double porciento = 0;

        System.out.println("ExtraccionRapida:");
        System.out.println("----------------");
        porciento = (usuario.getSaldoActual() * 20)/100;
        System.out.println("Ingrese el dinero a extraer de su cuenta no mayor al 20% de su saldo: ");
        extraccionr = leer.nextDouble();
        

        while (porciento <= extraccionr) {

            System.out.println("Extraccion mayor a la permitida, reintente");
            extraccionr = leer.nextDouble();
        }
        
            extraccionr = usuario.getSaldoActual() - extraccionr;
            usuario.setSaldoActual(extraccionr);
            System.out.println("Extraccion rapida exitosa. Su saldo actual es $"+usuario.getSaldoActual());
       
    }
     
     public void ConsultarSaldo(CuentaBancaria usuario){
         
         System.out.println("Metodo consultar Saldo: ");
         System.out.println("El saldo actual de su cuenta es : "+usuario.getSaldoActual());
     }
     
     public void ConsultarDatos(CuentaBancaria usuario){
         
         System.out.println("Metodo consultar Datos: ");
         System.out.println("Usuario: "+usuario.getNombreApellido());
         System.out.println("Dni: "+usuario.getDni());
         System.out.println("Numero de cuenta:"+usuario.getNumCuenta());
         System.out.println("El saldo actual de su cuenta es : "+usuario.getSaldoActual());
     }
     
     private void mostrarMenu(){
         
         System.out.println("-------Menu------\n"
                 +"1 - Ingreso \n"
                 +"2 - Extraccion \n"
                 +"3 - Extraccion Rapida \n"
                 +"4 - Consultar Saldo \n"
                 +"5 - Consultar Datos \n"
                 +"6 - Salir \n"
                 +"---Elija una opcion---");
         
     }
     
     private int elegirOpcion(){
         
         int sel;
         
         do{
             sel = leer.nextInt();
             if (sel < 1 || sel > 6) {
                 
                 System.out.println("Seleccion invalida ,intente nuevamente: ");
             }
             
         } while(sel < 1 || sel > 6);
         
         return sel;
     }
     
     public void ejecutarMenu(){
         CuentaBancaria c1 = CrearCuenta();
         mostrarMenu();
         int sel;
         
         do{
             
             sel = elegirOpcion();
             switch(sel){
                 
                 case 1:
                     Ingresar(c1);
                     mostrarMenu();
                     break;
                 case 2:
                     Retirar(c1);
                     mostrarMenu();
                     break;
                 case 3:
                     ExtraccionRapida(c1);
                     mostrarMenu();
                     break;
                 case 4:
                     ConsultarSaldo(c1);
                     mostrarMenu();
                     break;
                 case 5:
                     ConsultarDatos(c1);
                     mostrarMenu();
                     break;
                 case 6:
                     System.out.println("Saliendo del menu del Banco");
             }
             
         }while(sel !=6);
         
     }
}
