import java.util.*;
class Smallestoffour
{
    public static void main(String args [])
    {
         Scanner sc=new Scanner(System.in);
         int a,b,c,d;
         
         System.out.println("enter the value of a,b,c,d");
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         d=sc.nextInt();

         if(a<b && a<c && a<d)   
                 System.out.println("a is small est");
         else if(b>c && b>d)
                 System.out.println("b is smallest");
         else if(c>d)
                 System.out.println("c is smallest");
         else 
                 System.out.println("d is smallest");
       
     
    
     }
}
