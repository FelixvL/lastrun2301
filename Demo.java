class Demo{   // BA
	public static void main(String args[]){
		Vraag v = new Vraag();
		v.awoord = new Antwoord();
		v.awoord.juistAntwoord = 5;
		v.vraagNr = 23;
		Vraag b = new Vraag();
		System.out.println(b.vraagNr);
	}
}
class Vraag{
	String deTekst;
	static int vraagNr;
	Antwoord awoord;
}
class Antwoord{
	int juistAntwoord;
	Antwoord(){
		System.out.println("Een Antwoord");
	}
}


