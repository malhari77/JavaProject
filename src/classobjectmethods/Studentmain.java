package classobjectmethods;

public class Studentmain {

	public static void main(String[] args) 
	{
		Student st = new Student();
		
		st.sid=001;
		st.sname="Tester";
		st.grade='A';
		
		st.print();

		Student st1 = new Student();
		
		st1.sid=002;
		st1.sname="Tester";
		st1.grade='B';
		
		st1.print();
	}

}
