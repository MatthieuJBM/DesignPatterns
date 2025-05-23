public class KreatorFabryki
{
   public static FabrykaAbstrakcyjna getFabryka(String choice)
   {
     if(choice.equalsIgnoreCase("Bank"))
      {
        return new FabrykaBanku();
      } 
     else if(choice.equalsIgnoreCase("Kredyt"))
     {
       return new FabrykaKredytu();
     }
     return null;
   }
}
