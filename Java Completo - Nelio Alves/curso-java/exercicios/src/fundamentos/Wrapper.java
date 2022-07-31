package fundamentos;

public class Wrapper {
	
	public static void main(String[] args) {
		
		//byte
		Byte b = 1;
		//Short s = 1000;
		Integer i = 10000; //int
		//Long l = 1000000L; //convert de long pra long, por isso o 'L' no final
		
		System.out.println(b.byteValue());
		System.out.println(i*3);
		System.out.println(i/3);
		
		Float f = 123.5F;
		System.out.println(f);
		
		Double d = 1455.3343;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c.toString());
		System.out.println(c + "...");
	}
}
