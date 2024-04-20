package apr16;
/*W.A.J.P to find all interleaving of given strings.
The given strings are: WX YZ
The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ*/
import java.util.*;

public class InterleavingAtring 
{
	public static void allInterleavings(String res, String P, String Q, Set < String > out) 
	{
		  if (P.length() == 0 && Q.length() == 0) 
		  {
		   out.add(res);
		   return;
		  }
		  if (P.length() > 0)
		  {
		   allInterleavings(res + P.charAt(0), P.substring(1), Q, out);
		  }
		  if (Q.length() > 0)
		  {
		   allInterleavings(res + Q.charAt(0), P, Q.substring(1), out);
		  }
	}

		 public static void main(String[] args) 
		 {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter the first string : ");
			 String P = sc.next();
			 System.out.println("Enter the second string : ");
			 String Q = sc.next();
			 System.out.println("The given strings are: " + P + "  " + Q);
			 System.out.println("The interleavings strings are: ");
			 Set < String > out = new HashSet < > ();
			 allInterleavings("", P, Q, out);

			 out.stream().forEach(System.out::println);
			 
		 }
}