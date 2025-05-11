//     ***Operators in JAVA***
import java.util.Scanner;
class Arithmetic
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number : ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multtiplicaion: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Remainder: "+(a%b));
    }
}

class Relational
{
    public static void main(String[] args)
    {
        System.out.print("Enter two numbers: ");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        System.out.println("a<b : "+(a<b));
        System.out.println("a>b : "+(a>b));
        System.out.println("a<=b : "+(a<=b));
        System.out.println("a>=b : "+(a>=b));
        System.out.println("a==b : "+(a==b));
        System.out.println("a!=b : "+(a!=b));
    }
}

class logical
{
    public static void main(String[] args)
    {
        System.out.println((10>5) && (2>1)); // true
        System.out.println((10>5) && (2<1)); // false
        System.out.println((10<5) && (2<1)); // false
        System.out.println((10>5) || (2>1)); //true
        System.out.println((10>5) || (2<1)); // true
        System.out.println((10<5) || (2<1)); //flase
        System.out.println(!(10<5));//true
                  
    }
}

class prePost
{
    public static void main(String[] args)
    {
        int a=10;
        System.out.println(a);
        System.out.println("Post increment :"+(a++));
        System.out.println("Pre increment :"+(++a));
        System.out.println("Post decrement :"+(a--));
        System.out.println("Pre decrement :"+(--a));
    }
}

class Assignment
{
    public static void main(String[] args)
    {
        int a;
        a=10;
        System.out.println(a);

        a+=10;
        System.out.println(a);

    }
}

class Ternary
{
    public static void main(String[] args)
    {
        int a=10, b=20,c=30,max;
        max= ((a>b)? (a>c ? a :c) : (b>c ? b : c));
        System.out.println(max);
    }
}

class Bitwise
{
    public static void main(String[] args)
    {
        int a=5,b=7;
        System.out.println("AND : "+(a&b));
        System.out.println("OR : "+(a|b));
        System.out.println("XOR : "+(a^b));
        System.out.println("NOT : "+(~a));
    }
}