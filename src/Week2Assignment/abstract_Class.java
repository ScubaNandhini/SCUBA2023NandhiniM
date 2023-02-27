package Week2Assignment;

class abstract_Class {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* we cannot access an Abstract class directly -- it needs to be inherited into another class*/
		
		Ultron Obj = new Ultron();
		Obj.display();
		Obj.transferOfAccess();
	}
	
}
abstract class Jarvis
{
	public void display()
	{
		System.out.println("Access Jarvis Main memory");
	}
}
class Ultron extends Jarvis
{
	public void transferOfAccess()
	{
		System.out.println("Ultron tries to get access");
	}
	
}




