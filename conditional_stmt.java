class conditional_stmt{
    public static void main(String cs[])
    {
        // if else condition in java
        System.out.println();
        System.out.println("if else condition in java");
        System.out.println();
        int a = 18;
        //if condition is can br alone but the else condition cant be alone need if for the exsistance of the else.
        if(a>10)//the conditions may be the any thing like boolean (true,false), and any integers and combinations of the operators in it
            System.out.println("hello");
        else
            System.out.println("bye");


        System.out.println();

        // if there are more than one condition in the if statement then we need to keep the conditions output statements in the curley brackets
        if(a>1)
        {
            System.out.println("yes it is greater than 1");
            System.out.println("bye bye");
        }
        else
        System.out.println("not satisfies");

        System.out.println();
        System.out.println();
        System.out.println("if else if condition in java");
        System.out.println();

        int b = 12;
        int c = 11;
        int d = 8;
        if(b>c && b>d)
        System.out.println(b);
        else if(c>b && c>d)
        System.out.println(c);
        else
        System.out.println(d);
    }
}