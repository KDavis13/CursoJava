import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsaCotxe {
	
	private Cotxe coche1;

	UsaCotxe() {
		coche1=new Cotxe("SEAT","Toledo 1.9",1998,5,
				"pintura metalizada","HU",1234,"ZX",0.08F);
		
		String marca=coche1.getMarca();
		String model=coche1.getModel();
		String any=String.valueOf(coche1.getAny());
		String places=String.valueOf(coche1.getPlaces());
		String extras=coche1.getExtres();
		String matricula=coche1.getMatrícula();
		System.out.println("El coche "+marca+ " modelo "				
				+model+ " del año " + any + " con "
				+places+ " plazas y "
				+"matricula "+ matricula);
		
		System.out.println("tiene "+
				"los siguientes extras: "+extras );
		
		// Añadimos un extra
		String s="";
		while (!s.equals("s")) {
			
			System.out.print("\nNuevo extra? ");
			BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
			
			try{
				s = in.readLine();
			}
			catch(IOException exc)
			{
				System.out.println(exc);
			}
			
			if (!s.equals("s")) coche1.afegirExtra(s);
		}
		
		extras=coche1.getExtres();
		
		System.out.println("tiene "+
				"los siguientes extras: "+extras );
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UsaCotxe();
	}

}
