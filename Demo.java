class Demo{     // UE
	public static void main(String[] args){
		System.out.println("rij");
		Persoon p = new Persoon();
		p.rondlopen();
		System.out.println("kolom"); 
	}
}


interface CCC{
	void rondlopen();
}

class Persoon implements CCC{
	void rondlopen(){
		System.out.println("rondlopen");
	}

}



