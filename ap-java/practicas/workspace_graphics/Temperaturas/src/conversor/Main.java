package conversor;

public class Main {
	public static void main(String[] args) {
		
		ConversorTemperaturas conversor = new ConversorTemperaturas();
		double fahrenheit, reamur;
		
		System.out.println("celsius\t\tfahrenheit\treamur");
		
		for (int celsius = 0; celsius < 101; celsius += 5) {
			try {
				fahrenheit = conversor.celsiusAFahrenheit(celsius);
				reamur = conversor.celsiusAReamur(celsius);
				System.out.println(celsius + "\t\t" + fahrenheit + "\t\t"
						+ reamur);
			} catch (TemperaturaNoValidaException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}