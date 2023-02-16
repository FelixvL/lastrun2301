class Demo{     // TH
	public static void main(String[] args){
		System.out.println("maan");
		Fiets f = new MTB();
		System.out.println(f.speed);
		f.fietsen();
		System.out.println("zon");
	}
}
class Fiets{
	int speed = 3;
	Fiets(){
		System.out.println("Fiets");
	}
	void fietsen(){
		System.out.println("f in fiets");
	}
}
class MTB extends Fiets{
	int speed = 9;
	MTB(){
		System.out.println("MTB");
	}
	void fietsen(){
		System.out.println("f in mtb");
	}
}



