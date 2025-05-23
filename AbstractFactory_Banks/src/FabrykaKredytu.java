public class FabrykaKredytu extends FabrykaAbstrakcyjna
{
  public Bank getBank(String bank)
    {
      return null;
    }

   public Kredyt getKredyt(String kredyt)
   {
      if(kredyt == null)
       { 
         return null;
       }
      if(kredyt.equalsIgnoreCase("konsumpcyjny"))
       {
         return new KredytKonsumpcyjny();
       } 
      else if(kredyt.equalsIgnoreCase("biznesowy"))
       {
         return new KredytBiznesowy();
       } 
      else if(kredyt.equalsIgnoreCase("studencki"))
       {
         return new KredytStudencki();
       }
      return null;
   }
}