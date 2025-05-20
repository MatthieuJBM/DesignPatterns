public abstract class Builder
{
  protected Plan plan;
  
  public void newPlan()
  {
	  plan = new Plan();
  }
  
  public Plan getPlan()
  {
	 return plan; 
  }
  
  public abstract void proponujPrzedmiot1();
  public abstract void proponujPrzedmiot2();
  public abstract void proponujPrzedmiot3();
}
