class Demo{   // BD
	public static void main(String args[]){
		Vraag c = new Vraag();
		c.wandelen();
		char t = 25;
		t++;
		int h = t;
		System.out.println(h);
	}
}
class Vraag{
	static void lopen(){
		System.out.println("hoi");
	}
	void wandelen(){
		lopen();
		System.out.println("doei");
	}
}
class Antwoord{

}


