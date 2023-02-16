class Demo{     // TB
	public static void main(String[] args){
		System.out.println("hoi");
		Tent t = new Tent();
		Tent d = new Tent();
		d.openen();
	}
}

class Tent{
	boolean dicht;

	void openen(){
		if(dicht){
			System.out.println("open");	
		}else{
			System.out.println("dicht");
		}
	}

}


