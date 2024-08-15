package practical;

class X
{
  int  i;
   X()
  {
     i=5;
  }


}
class Y extends X
{
    int  j;
    Y()
   {
     j=6;
   }
   
}
class Z extends Y
{
   int k;
   Z()
   {
      k=7;
   }
}


public class multilevel_inheritance_14 {
    public static void main(String args[])
{
    X a=new X();   
    Y b=new Y();   
    Z c=new Z();  
    System.out.println(a.i);
    System.out.println(b.i+b.j);
    System.out.println(c.i+c.j+c.k);

}
}
