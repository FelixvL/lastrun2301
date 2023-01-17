class Demo{   // AH
	public static void main(String args[]){
		Voedsel v = new Pizza();
		v.bakken();

	}
}

class Voedsel{
	int prijs = 24;
	void bakken(){
		System.out.println("extra bakken ");
	}
}
class Pizza extends Voedsel{
	void bakken(int graden){
		System.out.println("bakken");
	}
	Pizza(){
		prijs = 36;
		System.out.println("er wordt pizza gemaakt");
	}
}