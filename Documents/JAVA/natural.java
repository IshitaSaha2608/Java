//  Natural Number
import java.util.Scanner;
class Test
{
    public static void main(String[] args)
    {
        for(int i=1; i<=10; i++)
        System.out.println(i +"  ");
    }
}


//      While loop
class While
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter value for condition\n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        while(n>=0)
        {
            System.out.println("Learn coding");
            n--;
        }
    }
}

class DoWhile
{
    public static void main(String[] args)
    {
        int n=1;
        do 
        {
            System.out.println(n);
            n++;
        } while (n<0);
    }
}
//  For Each Loop
class ForEach
{
    public static void main(String[] args)
    {
        int a[] ={10,20,30,40,50};
        for(int b : a)
        {
            System.out.println(b);
        }
    }
}