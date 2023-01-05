package decorator;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee kenyaAmericano = new KenyaAmericano();
		kenyaAmericano.brewing();
		System.out.println();
		
		Coffee kenyaLatte = new Latte(kenyaAmericano);
		kenyaLatte.brewing();
		System.out.println();
		
		Mocha kenyMocha = new Mocha(new Latte(kenyaAmericano));
		kenyMocha.brewing();
		System.out.println();
		
		Coffee etiopiaAmericano = new WhippedCream(new Mocha(new Latte(kenyaAmericano)));
		etiopiaAmericano.brewing();
	}
	
}
