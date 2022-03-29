import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    String polchoinki = "*";
    int x = 4;
      for(int s=0; s <4; s++){
    for(int i=1; i <=x; i++)
      {
        for(int j =0; j<(x-i); j++)
        System.out.print(" ");
        for( int j=0; j < i; j++)
          System.out.print (polchoinki);
        System.out.println("");
       
      }
        }
    }
}
