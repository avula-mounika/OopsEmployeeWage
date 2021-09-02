
public class EmpWage {

public static void main(String[] args) {
	int EMP_RATE_PER_HOUR = 20;
	int empHrs = 0;
	int empWage = 0;
	double empcheck = Math.floor(Math.random() *10) % 2;
	if (empcheck == 1)
		empHrs = 8;
	else 
		empHrs =0;
	empWage = empHrs * EMP_RATE_PER_HOUR;
	System.out.println("Emp Wage: " + empWage);
	}
}
