class Demo{   // AC
	public static void main(String args[]){
		System.out.println("Hij doet het");
		Voeding v = new Voeding();
		Voeding r = new Voeding();
		v.prijs = 25;
		System.out.println(v.prijs);
		v = r;
		System.out.println(r.prijs);
	}
}

class Voeding{
	int prijs;
	void Voeding(){
		System.out.println("Geoogst");
	}

}