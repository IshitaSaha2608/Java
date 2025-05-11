//  Implicit Type Casting
class Test
{
    public static void main(String[] args)
    {
        int a =10;  // 4 bytes
        double b=a; // 8 bytes
        System.out.println(b);
    }
}

//  Explicit Type Casting
class A
{
    public static void main(String[] args)
    {
        double a =10.5;
        int b = (int)a;
        System.out.println(a+"\n"+b);
    }
}
