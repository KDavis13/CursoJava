/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p002;

/**
 *
 * @author poo
 */
public class CuentaBancaria {

    private double saldo;
    
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
