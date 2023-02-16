class Demo{     // UD
	public static void main(String[] args){
		System.out.println("rij");
		CCC a = q -> q < 3;
		System.out.println( a.doen(4) );
		System.out.println("kolom"); 
	}
}


interface CCC{
	boolean doen(int a);

}




