class operators
{
    public static void main(String op[])
    {
        System.out.println();

        //Additional operators
        System.out.println("Additional Operators");

        System.out.println();

        int a = 12;
        int b = 6;
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("a+b = "+c);
        System.out.println("a-b = "+d);
        System.out.println("a*b = "+e);
        System.out.println("a/b = "+f);
        System.out.println("a%b = "+g);


        a = a+2; // we can ue the different way like below given
        System.out.println(a+"= a+2");

        //adding it like 2 times change the value of 2 to any value to make the changes like 2times, 3times, ....., ntimes

        a += 2; // insted of using the + sign we can use any sign used above it will work as well 
        System.out.println(a);

        //for single time increment of the valuie we can usse these commands also

        a++; //post - increment
        System.out.println("a++ = "+a);

        ++a; //pri - increment
        System.out.println("++a = "+a);

        //for single time decrement of the valuie we can usse these commands also
        a--;
        System.out.println("a-- = "+a);

        int h = a++; //fetch the value first and then increment
        System.out.println("a++ = "+h);

        int i = ++a; // increment the value and then fetch the value
        System.out.println("++a = "+i);

        System.out.println();

        //Relational operators
        // < , > , == , != , <= , >=

        System.out.println("Relational Operators");

        System.out.println();
        // we can do with the any type of values not only the integers
        int j = 6;
        int k = 5;
        System.out.println("j = "+j);
        System.out.println("k = "+k);
        boolean l = j<k;
        boolean m = j>k;
        System.out.println("j<k = "+l);
        System.out.println("j>k = "+m);
        System.out.println();

        //Logical operators
        // AND - && , OR - || , NOT - !

        // for AND
        //  a  b  x(a&&b)
        //  F  F  F
        //  F  T  F
        //  T  F  F
        //  T  T  T

        // for OR
        //  a  b  x(a||b)
        //  F  F  T
        //  F  T  T
        //  T  F  T
        //  T  T  F

        // for NOT
        // a      x(!a)
        // T      F
        // F      T

        System.out.println("Logical operators");
        System.out.println();

        int n = 7;
        int o = 5;
        int p = 5;
        int q = 9;
        boolean r = n>o && p>q;
        System.out.println(r);
        
        System.out.println();
    }
}
