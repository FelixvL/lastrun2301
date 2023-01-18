class Demo{   // BC
	public static void main(String args[]){
		Vraag c = new Vraag();
		c.lopen();
	}
}
class Vraag{
	static void lopen(){
		System.out.println("hoi");
		wandelen();
	}
	void wandelen(){
		System.out.println("doei");
	}
}
class Antwoord{

}


