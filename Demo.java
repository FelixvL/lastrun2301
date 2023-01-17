class Demo{   // AD
	public static void main(String args[]){
		System.out.println("Hij doet het");
		Voeding v = new Voeding();
		Voeding r = new Voeding();
		v.oogsten();
		v.oogsten();
		v.prijs += 25;
		System.out.println(v.prijs);
		r = v;
		System.out.println(r.prijs);
		v.oogsten();
		System.out.println(r.prijs);
	}
}

class Voeding{
	int prijs;
	void oogsten(){
		prijs++;
		System.out.println("Geoogst");
	}

}