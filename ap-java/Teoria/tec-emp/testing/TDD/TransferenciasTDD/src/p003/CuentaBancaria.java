/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p003;

/**
 *
 * @author poo
 */
public class CuentaBancaria {

    private double saldo;
    private Moneda moneda;

    public CuentaBancaria(Moneda moneda) {
        this.moneda = moneda;
    }

    public CuentaBancaria(Moneda moneda, double cantidad) {
        this.moneda = moneda;
        saldo = cantidad;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
    
    public void depositar(double cantidad) {
        saldo = cantidad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirar(double cantidad) {
        validar(cantidad);
        saldo -= cantidad;        
    }

    private void validar(double cantidad) {
        if (cantidad > saldo) {
            String msj = "La cantidad solicitada excede el saldo.";
            throw new LimiteExcedidoException(msj);            
        }
    }
    
}
