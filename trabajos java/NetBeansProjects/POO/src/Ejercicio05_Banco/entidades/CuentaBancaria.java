/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05_Banco.entidades;

/**
 *
 * @author Gonza Cozzo
 */
public class CuentaBancaria {

    private int numCuenta;
    private String nombreApellido;
    private long dni;
    private double saldoActual;
    private double interes;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numCuenta, String nombreApellido, long dni, double saldoActual) {
        this.numCuenta = numCuenta;
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.saldoActual = saldoActual;
        
    }
    public CuentaBancaria(int numCuenta, long dni, double saldoActual, double interes) {
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    

    public int getNumCuenta() {
        return numCuenta;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numCuenta=" + numCuenta + ", nombreApellido=" + nombreApellido + ", dni=" + dni + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }

    
}
