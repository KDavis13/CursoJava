package servicios;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import sistema.UtilesFichero;

@RunWith(MockitoJUnitRunner.class)
public class TestGestorContenidos {

	private GestorContenidos SUT;

	@Mock
	private UtilesFichero util;

	@Before
	public void inicio() {
		SUT = new GestorContenidos(util);
	}

	@Test
	public void testCheckCredencialesCorrectas() {
		final String usr = "pepe";
		final String pwd = "epep";

		final boolean res = SUT.checkCredenciales(usr, pwd);
		assertTrue(res);
	}

	@Test
	public void testGuardar() {
		final String usr = "pepe";
		final String pwd = "epep";
		final String nomFichero = "nomFichero.txt";
		final String contenido = "bla,bla,bla";

		SUT.guardar(usr, pwd, nomFichero, contenido);

		try {
			Mockito.verify(util, Mockito.times(1)).escribir(nomFichero,contenido);		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testLeer() {
		final String usr = "pepe";
		final String pwd = "epep";
		final String nomFichero = "nomFichero.txt";
		final String contenido = "bla,bla,bla";

		try {
			Mockito.doReturn("bla,bla,bla").when(util).leer(nomFichero);
		} catch (IOException e1) {			
			e1.printStackTrace();
		}
		
		SUT.guardar(usr, pwd, nomFichero, contenido);
		final String contentRecuperado = SUT.leer(usr, pwd, nomFichero);
		try {
			Mockito.verify(util, Mockito.times(1)).escribir(nomFichero,contenido);		
			Mockito.verify(util, Mockito.times(1)).leer(nomFichero);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(contenido, contentRecuperado);
	}

}
