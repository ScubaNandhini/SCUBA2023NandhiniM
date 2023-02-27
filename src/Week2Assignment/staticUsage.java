package Week2Assignment;

class staticUsage {
static int n = 19 ;//static variable
static int a = staticfunction();//staticfunction
static int staticfunction()
{
	a = n*10;
	return a;
}
static { System.out.println("inside static block");}//static block
static void display()//static method
	{
		System.out.println("inside Static member");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside Main");
		display();
		System.out.println("value of n :"+n);
		System.out.println("value of a :"+a);
	}
	
}





