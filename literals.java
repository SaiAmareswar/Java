class literals
{
    public static void main(String a[])
    {
        //literals
        int b = 0b101; // binary numbers
        int c = 0x7e;  // hexa decimal numbers
        int d = 10_00_00_000; //can define the numbers in this way to identify the number of integers for our sake
        double e = 12e10; //it is basically 12*10^10
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        char f = 'b';
        System.out.println(f);
        f++; // increment will also happen in the charecters as well it will work like as the integers
        System.out.println(f);
    }
}