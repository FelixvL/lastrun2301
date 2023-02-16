class Demo{     // TG
	public static void main(String[] args){
		System.out.println("maan");
		wandelen();
		System.out.println("zon");
	}
	static void wandelen(){
		System.out.println("wandelen");
		Fiets f = new MTB();
		System.out.println(f.speed);
	}
}
class Fiets{
	int speed;
	Fiets(){
		System.out.println("Fiets");
	}
}
class MTB extends Fiets{
	class MTB(){
		System.out.println("MTB");
	}
}



