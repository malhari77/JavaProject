package classobjectmethods;

public class Employeemain {

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		
		emp1.eid=101;
		emp1.ename="malhari";
		emp1.job= "Test Engineer";
		emp1.sal=30000;
		
		emp1.dispaly();
		
		Employee emp2 = new Employee();
		
		emp2.eid=102;
		emp2.ename="Patil";
		emp2.job="Engineer";
		emp2.sal=27000;
		
		emp2.dispaly();
		
		
		Employee emp3 = new Employee();
		
		emp3.fid=145;
		emp3.Fname="Apple";
		emp3.colur="Red";
		emp3.rate=145;
		emp3.weight=02.45;
		
		
		emp3.show();
		
	}

}
