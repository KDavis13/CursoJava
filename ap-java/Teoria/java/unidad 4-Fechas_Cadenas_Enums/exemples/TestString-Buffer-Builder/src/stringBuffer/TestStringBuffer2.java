package stringBuffer;

public class TestStringBuffer2 {

	public static void main(String[] args) {
		StringBuffer buffer = 
				new StringBuffer();
		
		buffer
		   .append("En un lugar ")
		      .append("de La Mancha ")
		         .append("cuyo nombre...");
		
		buffer.append("no quiero acordarme.");
		
		buffer.insert(49, "NI ");
		
		System.out.println(buffer);
		
		buffer.replace(49, 52, "ni ");
		System.out.println(buffer);
	}

}
