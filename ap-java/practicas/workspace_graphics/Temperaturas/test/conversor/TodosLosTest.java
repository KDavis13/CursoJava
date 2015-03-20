package conversor;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import conversor.TestConversorTemperaturas.TestConversorTemperaturasBateria;

@RunWith(Suite.class)
@SuiteClasses({
	TestConversorTemperaturas.class,
	TestConversorTemperaturasBateria.class
} )
public class TodosLosTest {

}