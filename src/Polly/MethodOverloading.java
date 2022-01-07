package Polly;

public class MethodOverloading extends Betty {
public void stdId(int id) {
	System.out.println("Student ID is: "+id);

}
public void stdName(String name) {
	System.out.println("Student Name is: "+name);

}
public void stdSub(char initial,String n,int i) {
	System.out.println("Details are: "+initial+"."+n+","+i+".");
	
}
public static void main(String[] args) {
	MethodOverloading t = new MethodOverloading();
	t.emp(14);
	t.emp("Betty");
	t.stdId(15);
	t.stdName("Jughead");
	
}
}
