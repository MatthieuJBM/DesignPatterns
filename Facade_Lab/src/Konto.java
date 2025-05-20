public class Konto
{
  @SuppressWarnings("unused")
  private String haslo;
  String login;
  
  public Konto(String login)
  {
	 this.login = login;
	 
  }
  
  public void setHaslo(String haslo)
  {
	  this.haslo = haslo;
	 
  }
  
  public String getLogin()
  {
	  return login;
  }
	
}
