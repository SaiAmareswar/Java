class operators
{
    public static void main(String op[])
    {

        //Additional operators

        int a = 12;
        int b = 6;
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);


        a = a+2; // we can ue the different way like below given
        System.out.println(a);

        //adding it like 2 times change the value of 2 to any value to make the changes like 2times, 3times, ....., ntimes

        a += 2; // insted of using the + sign we can use any sign used above it will work as well 
        System.out.println(a);

        //for single time increment of the valuie we can usse these commands also

        a++; //post - increment
        System.out.println(a);

        ++a; //pri - increment
        System.out.println(a);

        //for single time decrement of the valuie we can usse these commands also
        a--;
        System.out.println(a);

        int h = a++; //fetch the value first and then increment
        System.out.println(h);

        int i = ++a; // increment the value and then fetch the value
        System.out.println(i);

        //Relational operators

        // int
    }
}