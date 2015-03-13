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
public class LimiteExcedidoException extends RuntimeException {
    public LimiteExcedidoException(String mensaje) {
        super(mensaje);
    }
}
