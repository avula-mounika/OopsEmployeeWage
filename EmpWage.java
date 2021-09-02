
public class EmpWage {

public static void main(String[] args) {
	System.out.println("welcome to employee wage computation program");
	double empcheck = Math.floor(Math.random() *10) % 2;
	//computation
	if  (empcheck == 1)
		System.out.println("Employee is Present: " + empcheck);
	else
		System.out.println("Employee is Absent: " +empcheck);
	}
}
