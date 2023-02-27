package Week2Assignment;

public interface interface_Assignment {
	void assignment();
	
}
	class Week1 implements interface_Assignment
	{
		public void assignment()
		{
			System.out.println("Week1Assignment");
		}
	}
	class Week2 implements interface_Assignment
	{
		public void assignment()
		{
			System.out.println("Week1Assignment");
		}
	
		public static void main(String[] args){
	interface_Assignment W1 = new Week1();
	W1.assignment();
	interface_Assignment W2 = new Week2();
	W2.assignment();
}
	}
	

