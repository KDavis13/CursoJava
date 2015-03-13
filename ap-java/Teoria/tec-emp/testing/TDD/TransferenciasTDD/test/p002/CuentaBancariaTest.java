/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p002;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author poo
 */
public class CuentaBancariaTest {
    
    private CuentaBancaria cuenta;
    
    public CuentaBancariaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cuenta = new CuentaBancaria();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testDepositarDineroEnCuenta() {        
        cuenta.depositar(100);
        assertEquals(100, cuenta.getSaldo(), 0.001);
    }
    
    @Test
    public void testRetirarDineroDeCuentaConSaldoSuficiente() {        
        cuenta.depositar(100);        
        cuenta.retirar(60);
        assertEquals(40, cuenta.getSaldo(), 0.001);
    }
    
    @Test(expected = LimiteExcedidoException.class)
    public void testRetirarDineroDeCuentaSinSaldoSuficiente() {        
        cuenta.depositar(100);        
        cuenta.retirar(101);        
    }
}
