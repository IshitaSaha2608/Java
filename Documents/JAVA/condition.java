import java.util.Scanner;
class Simple
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age>=18)
            System.out.println("OK");
        System.out.println("Thanking you!!");
    }
}

class IfElse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a = sc.nextInt();
        if(a>=0)
            System.out.print("Positive number");
        else 
            System.out.print("Negative number");
    }
}

class elseIf
{
    public static void main(String[] args)
    {
        int marks;
        Scanner sc = new Scanner(System.in);
        marks= sc.nextInt();
        if(marks>80)
            System.out.println("Topper");
        else if(marks<80 && marks>=60)
            System.out.println("First");
        else
            System.out.println("Second");
    }
}

class Nested
{
    public static void main(String[] args)
    {
        int a=10, b=20, c=30;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(c);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
        }
    }
}

class Switch
{
    public static void main(String[] args)
    {
        int a=10,b=20,ch;
        Scanner s= new Scanner(System.in);
        ch = s.nextInt();
        switch(ch)
        {
            case 1: System.out.println("Addition "+(a+b));
                        break;
            case 2: System.out.println("Subtraction "+(a-b));
                        break;
            case 3: System.out.println("Multiplication "+(a*b));
                        break;
            case 4: System.out.println("Division "+(a/b));
                        break;
            default : System.out.println("Invalide (-_-)");
        }
    }
}