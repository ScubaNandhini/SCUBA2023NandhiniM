package Week2Assignment;
//A regular expression is a sequence of characters that forms a search pattern.
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("We are requesting the user to provide the sentenc in which string needs to be searched");
		String inputText = read.nextLine();
		System.out.println("You have entered:"+inputText);
		Pattern searchString = Pattern.compile("avenger",Pattern.CASE_INSENSITIVE);
		boolean matchString = searchString.matches(inputText, "avenger");
			
		if (matchString)
		{
			System.out.println("MatchFound");
		}
		else
		{
			System.out.println("MatchFound");
		}
		
		
	}

}
