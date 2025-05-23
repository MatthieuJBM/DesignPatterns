public abstract class Kredyt
{
  protected double stopa;

  abstract void getStopa(double stopa);

  public void oblicz_rate(double kwota, int ile_lat)
   {                  
      double rata;
      int n;
      n=ile_lat*12;
      stopa=stopa/1200;

      rata=((stopa*Math.pow((1+stopa),n))/((Math.pow((1+stopa),n))-1))*kwota;
      System.out.printf("Twoja miesi�czna sp�ata wynosi %.2f z�, dla po�yczki= %.2f z�",rata,kwota);
      

   }

}
