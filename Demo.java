class Demo{     // TE
	public static void main(String[] args){
		System.out.println("hoi");
		new Tent().doen = 15;
		Tent t = new Tent();
		Tent d = t;
		d.doen++;
		System.out.println(d.doen++);
		d.openen();
		System.out.println(t.doen++);
	}
}

class Tent{
	boolean dicht;

	int doen = doen();

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
			System.out.println("dicht" + doen);
		}
	}

}


