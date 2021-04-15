/*
 * Jonathan Hendrix
 */
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.net.URL;
import java.io.File;
import java.io.PrintWriter;
public class Lab16 
{

	public static void main(String[] args) throws IOException, MalformedURLException
	{
		ArrayList <String> lastNames = new ArrayList <String>();
		URL ur1 = new URL("https://www2.census.gov/topics/genealogy/1990surnames/dist.all.last");
		String choice;
		boolean found = false;
				
		     Scanner input = new Scanner (ur1.openStream()).useDelimiter("[^\\p{Alpha}']+");
		     
		     
		     
		     while (input.hasNext())
		     {
		    	 lastNames.add(input.next());
		     }
		     Collections.sort(lastNames);
		     guessName(lastNames);
		     
		    	 
		    		 
		    	 	 
		     
		   
	}//main
 public static void guessName( ArrayList<String> lastNames) 
 {
		             Scanner in = new Scanner(System.in);
		    	     int low = 0; 
		             int high = lastNames.size() - 1;
		             int mid = (low + high) / 2;
		             String choice = "";
		             boolean found = false;
		             
		             
		    
		     while (found == false)
		     {
		    	 System.out.println("Is your last name "+ lastNames.get(mid) + "? Y/N "  );
			     choice = in.next().toUpperCase();
		     if(choice.equals("Y"))
		     {
		    	 found = true;
		    	 System.out.print("All done!");
		     }
		     else if(choice.equals("N"))
		     {
		    	 System.out.println("Does your name come before that name in the alphabet?");
		    	 choice = in.next().toUpperCase();
		    	 if (choice.equals("N"))
		    	 {
		    		 low = mid;
		    		 mid = (low + high) / 2;
		    		 
		    	 }

		    	 else if ( choice.equals("Y"))
		    	 {
		    		high = mid;
		    		mid = (low + high) / 2; 
		    		
		    	 }
		    	 
		      }
		      if (high == low + 1)
		    	 {
		    	     System.out.println("is your name" + lastNames.get(low));
		    	     choice = in.next().toUpperCase();
		    	     if(choice.equals("Y"))
		    	     {
		    	    	 System.out.println("All done!");
		    	     }
		    	     else
		    	     {
		    		 System.out.println("Sorry could not find name");
		    		 found = true;
		    	     }
		    	 }
		     }//while
		    	
		  
		    	 
		     }// guessName
}//class
		    	 
		   