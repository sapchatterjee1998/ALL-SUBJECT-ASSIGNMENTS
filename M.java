import java.util.*;
class A{
   void go() throws ArithmeticException
   { int c = 5/2;
     throw new ArithmeticException("no division by zero");
    }
}
class M {
public static void main(String args[])
{  System.out.println("enter the age");
  Scanner sc = new Scanner(System.in);
  int age = sc.nextInt();
A a = new A();
 try{ a.go();
     
    if(age>18)
      System.out.print("you can vote in elections,");
    else 
      throw new ArrayIndexOutOfBoundsException("you can not vote");
    }

catch(ArrayIndexOutOfBoundsException b)
{System.out.println(b.getMessage());}
catch(ArithmeticException c)
{

System.out.println(c.getMessage());

}
} 
}