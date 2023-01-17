class Demo{   // AB
	public static void main(String args[]){
		System.out.println("Hij doet het");
		Voeding v = new Voeding();
		Voeding r = new Voeding();
		v.prijs = 25;
		System.out.println(v.prijs);
		r = v;
		System.out.println(r.prijs);
	}
}

class Voeding{
	int prijs;
	Voeding(){
		System.out.println("Geoogst");
	}

}