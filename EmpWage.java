
public class EmpWage {

public static void main(String[] args) {
	int EMP_RATE_PER_HOUR = 20;
	int empHrs = 0;
	int empWage = 0;
	int PART_TIME =2;
	int FULL_TIME =1;
	double empcheck = Math.floor(Math.random() *10) % 2;
	if (empcheck == FULL_TIME)
		empHrs = 8;
	else if (empcheck == PART_TIME)
		empHrs =4 ;
	else 
		empHrs =0;
	empWage = empHrs * EMP_RATE_PER_HOUR;
	System.out.println("Emp Wage: " + empWage);
	}
}
