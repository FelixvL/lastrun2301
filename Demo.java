class Demo{     // UG
	public static void main(String[] args){
		System.out.println("rij");
		Persoon p = new Persoon();
		p.rondlopen();
		CCC pp = new Persoon();
		p.rondlopen();
		System.out.println("kolom"); 
	}
}


interface CCC{
	void rondlopen();
}

class Persoon implements CCC{
	int a = 3;
	public void rondlopen(){
		System.out.println("rondlopen" + ++a);
	}

}



