import java.util.*;
class Salarycaluculater
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
         
          System.out.println("enter employe number");
          int eno = sc.nextInt();
          System.out.println("enter employe name");
          String ename = sc.next();
          System.out.println("enter salary");
          double salary = sc.nextDouble();
              
          System.out.println("enter designation (m/a/c:");
          char designation = sc.next().charAt(0);

           double totalsalary = salary + bonus;
           double bonus=0;
          
          switch (designation) {
               case'n':
                   bonus = 1.2 * salary;
                   break;
               case'a':
                   bonus = 1.0 * salary;
                   break;
               case'c':
                   bonus = 0.05 * salary;
               default:
                   System.out.println("valid designation.");
                     return;
          }     System.out.println("Employee number:"+ eno);
          System.out.println("Employee name:"+ ename);
          System.out.println("Salary: $" + salary);
          System.out.println("Bonus: $" + bonus);
          System.out.println("Total salary: $" + totalsalary);

          sc.close();

              
     }
}