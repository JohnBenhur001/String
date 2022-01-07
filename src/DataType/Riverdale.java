package DataType;

public class Riverdale {
public void empId(int id) {
	System.out.println("Employee ID is: "+id);

}
public void empName(String name) {
	System.out.println("Employee name is: "+name);

}
public static void main(String[] args) {
	Riverdale r = new Riverdale();
	r.empId(12);
	r.empName("Archie");
}
}
