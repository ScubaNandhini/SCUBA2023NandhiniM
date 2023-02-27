package Week2Assignment;
//example of singleton class where the method name is same as the class name 
// other checks are done to insure only one instance of the call is created.
class singletonClass {
	 // private field that refers to the object
	
	private static singletonClass singleton_object;
	
	//Constructor of the singletonClass
	 private singletonClass()
	    {
		 System.out.println("Hello I am a string part of Singleton class");
	    }
	public static singletonClass getInstance()
	{
		if (singleton_object == null)
		{
			singleton_object = new singletonClass();
		}
		return singleton_object;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singletonClass singleton_object2;
		singleton_object2 = singletonClass.getInstance();
		singletonClass singleton_object3;
		singleton_object3 = singletonClass.getInstance();
	     
	}


	}


