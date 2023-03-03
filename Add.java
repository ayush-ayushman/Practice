class Add
{
  int sum(int x,int y)
  {
     return x+y;
  }
}
public class Test
{
  public static void main(String[] args)
  {
    Add op=new Add();
    int y=op.sum(10,40);
  }
}