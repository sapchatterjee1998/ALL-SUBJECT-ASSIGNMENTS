import java.util.*;
class A{
   void mrk(int a) throws ArithmeticException
   { if (a>33)
     throw new ArithmeticException("you passed");
    }
}
class Marks{
public static void main(String args[])
{  System.out.println("enter the Marks");
  Scanner sc = new Scanner(System.in);
  int marks = sc.nextInt();
A a = new A();
 try{ a.mrk(marks);
     
    if(marks>33)
      System.out.print("you failed");
    else 
      throw new ArrayIndexOutOfBoundsException("you have passed");
    }

catch(ArrayIndexOutOfBoundsException b)
{System.out.println(b.getMessage());}
catch(ArithmeticException c)
{

System.out.println(c.getMessage());

}
} 
}