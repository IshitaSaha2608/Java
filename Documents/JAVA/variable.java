class Test
{
    static int b=20; // static variable
    int c=30;  // instance variable
    public static void main(String[] args)
    {
        int a=10;  // local variable
        Test ref = new Test();
        System.out.println(a);
        System.out.println(b);
        System.out.println(ref.c);
    }
}