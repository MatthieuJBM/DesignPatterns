public class Plan
{
  private String przedmiot1;
  private String przedmiot2;
  private String przedmiot3;
  
  public void setPrzedmiot1(String przedmiot1)
  {
	  this.przedmiot1=przedmiot1;
  }
  
  public void setPrzedmiot2(String przedmiot2)
  {
	  this.przedmiot2=przedmiot2;
  }
  
  public void setPrzedmiot3(String przedmiot3)
  {
	  this.przedmiot3=przedmiot3;
  }
  
  public void show()
  {
	  System.out.println("Przedmiot obieralny1 to " + przedmiot1);
	  System.out.println("Przedmiot obieralny2 to " + przedmiot2);
	  System.out.println("Przedmiot obieralny3 to " + przedmiot3);
  }
  
}











