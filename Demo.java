class Demo{   // BE
	public static void main(String args[]){
		Vraag c = new StrikVraag();
		c.lopen();
		System.out.println(c.a);
	}
}
class Vraag{
	int a = 3;
	void lopen(){
		System.out.println("hoi");
	}
	
}
class StrikVraag extends Vraag{
	int a = 4;
	void lopen(){
		System.out.println("doei");
	}
}


