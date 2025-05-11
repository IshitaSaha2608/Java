class Test
{
    static int a=10;  // static variable
    void fun()
    {
        int b=10;  // local variable
        System.out.println(a+" "+b);
        ++a; ++b;
    }
    public static void main(String[] args)
    {
        Test ref= new Test();
        ref.fun();
        ref.fun();
    }
}