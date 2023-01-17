class Demo{   // AI
	public static void main(String args[]){
		Voedsel v = new Pizza();
		v.bakken();
		System.out.println(v.prijs);

	}
}

class Voedsel{
	int prijs = 24;
	void bakken(){
		System.out.println("extra bakken ");
	}
}
class Pizza extends Voedsel{
	int bakken(){
		System.out.println("bakken");
		return prijs++;
	}
	Pizza(){
		prijs = 36;
		System.out.println("er wordt pizza gemaakt");
	}
}