package Week2Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class exceptionHandling {

	void display (String S) 
	{
		if (S == null)
		{
			throw new NullPointerException("Exception : String S is null - no values has been taken as input");
		
		}
		System.out.println("Inside display Method else condition: "+S);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		exceptionHandling EH = new exceptionHandling();
		ArrayList<String> counter = new ArrayList<String>();//creating an Arraylist
		counter.add("one");
		counter.add("two");
		counter.add(null);
		counter.add("four");
		for (String S:counter)
		{
			try
			{
				EH.display(S);
			}
			catch (NullPointerException e)
			{
				System.out.println(e.getMessage());
                System.out.println("Exception handled. The program will continue");              
			}
			finally 
			{
				System.out.println("Inside finally block");
			}
			System.out.println(" the progam is conitnuing to run");
			System.out.println("**************************************");
					
	}

}
}	
