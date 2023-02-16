class Demo{     // TK
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
	void fietsen(){
		System.out.println("f in mtb" + speed);
	}
}
class MTB extends Fiets{
	int speed = 9;
	void fietsen(){
		System.out.println("f in mtb" + speed);
	}
}



