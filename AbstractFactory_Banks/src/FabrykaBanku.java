public class FabrykaBanku extends FabrykaAbstrakcyjna
{
   public Bank getBank(String bank){
	 if(bank == null)
	  {
	      return null;
	  }

	 if(bank.equalsIgnoreCase("mBank"))
	  {
	   return new mBank();
	  } 
	 else if(bank.equalsIgnoreCase("Alior"))
	  {
	   return new Alior();
	  }
	 else if(bank.equalsIgnoreCase("PKO"))
	  {
	   return new PKO_BP();
	  }
	 return null;
    }
	   

   public Kredyt getKredyt(String loan) 
    {
	   return null;
	}
}