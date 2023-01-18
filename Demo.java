class Demo{   // BF
	public static void main(String args[]){
		Vraag c = new StrikVraag();
		c.lopen();
		System.out.println(c.a);
		c.go();
	}
}
abstract class Vraag{
	int a = 3;
	public void lopen(){
		System.out.println("hoi");
	}
	abstract void go();
	
}
class StrikVraag extends Vraag{
	int a = 4;
	void lopen(){
		System.out.println("doei");
	}
	public void go(){
		System.out.println("Go");
	}
}


