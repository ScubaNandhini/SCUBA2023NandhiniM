package Week2Assignment;

class inheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		spiderMan Obj = new spiderMan();
		Obj.display();
		Obj.transferOfAccess();
	}
	
}
class Iron_Man
{
	public void display()
	{
		System.out.println("Iron Man");
	}
}
class spiderMan extends Iron_Man
{
	public void transferOfAccess()
	{
		System.out.println("Give access to Jarvis after Iron_Man's end");
	}
	
}




