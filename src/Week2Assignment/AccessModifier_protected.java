package Week2Assignment;

class AccessModifier_protected {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test_AM_protected Obj = new test_AM_protected();
		Obj.display();
	}
	
}
class AM_protected
{
	protected void display()
	{
		System.out.println("Access_Modifier_protected");
	}
}
class test_AM_protected extends AM_protected { }



