import java.util.*;

public class Data 
{

	public int getWiek(int rok_ur)
	{
	  int rok = Calendar.getInstance().get(Calendar.YEAR);
	  
	  return rok-rok_ur;
	}
	
	public void wypiszDate()
	{
	  int rok = Calendar.getInstance().get(Calendar.YEAR);
	  int miesiac = Calendar.getInstance().get(Calendar.MONTH)+1;
	  int dzien = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	  
	  if(miesiac<10)
	    if(dzien<10) 
	      System.out.println("Aktualna data: " + rok + "-0" + miesiac + "-0" + dzien);
	    else
	      System.out.println("Aktualna data: " + rok + "-0" + miesiac + "-" + dzien);
	  else
		  if(dzien<10) 
		      System.out.println("Aktualna data: " + rok + "-0" + miesiac + "-0" + dzien);
		    else
		      System.out.println("Aktualna data: " + rok + "-" + miesiac + "-" + dzien);
	}
	
}
