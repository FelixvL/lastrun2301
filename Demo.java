class Demo{   // BB
	public static void main(String args[]){
		Vraag v = new Vraag();
		v.awoord = new Antwoord();
		v.awoord.juistAntwoord = 5;
		v.vraagNr = 23;
		Vraag b = new Vraag();
		System.out.println(b.vraagNr);
		System.out.println( v.geefAntwoord().juistAntwoord );
		System.out.println( b.geefAntwoord().juistAntwoord );
	}
}
class Vraag{
	String deTekst;
	int vraagNr;
	Antwoord awoord;
	Antwoord geefAntwoord(){
		System.out.println("geef antwoord");
		return awoord;
	}
}
class Antwoord{
	int juistAntwoord;
	Antwoord(){
		System.out.println("Een Antwoord");
	}
}


