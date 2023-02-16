class Demo{     // TO
	public static void main(String[] args){
		System.out.println("Mickey");
		Park p = new Park();
		p.fotosynthese();
		System.out.println("Donald");
	}
}
class Park{
	Boom b1 = new Boom();
	void fotosynthese(){
		System.out.println("fotosynthese");
		b1.groeien();
	}
}
class Boom{
	void groeien() throws Exception{
		System.out.println("groeien");
	}
}



