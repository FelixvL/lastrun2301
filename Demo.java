class Demo{     // TC
	public static void main(String[] args){
		System.out.println("hoi");
		Tent t = new Tent();
		Tent d = new Tent();
		d.openen();
	}
}

class Tent{
	boolean dicht;

	static int doen = doen();

	Tent(){
		System.out.println("een tent");
	}

	static int doen(){
		System.out.println("niet doen");
		return 4;
	}

	void openen(){
		if(dicht){
			System.out.println("open");	
		}else{
			System.out.println("dicht");
		}
	}

}


