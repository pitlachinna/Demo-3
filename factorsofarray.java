import java .util.*;
class factorsofarray
{
  public static void main(String args[])
  {
       Scanner sc=new Scanner(System.in);
       
       int i,j,temp=0;
      
     System.out.println("enter the value of n");
     n=sc.nextInt();
    
     for(i=1;i<a.length;i++)
     {
        for(j=2;j<=a[i];j++)
        {
           if(a[i]%j==0)
            temp=1;
        }
        if(temp==0)
            System.out.println(a[i]+"");
        }
     }
}
      
       