class ternary_operator{
    public static void main(String to[]){
        int a = 4;
        int result = 0;
        int x;

        System.out.println(" This is without ternary operator");

        System.out.println();

        if(a%2==0)
            result = 10;
        else
            result = 20;

        System.out.println(result);

        System.out.println();
        System.out.println(" This is with ternary operator");
        System.out.println();

        // the ternary operator is represented as like this (condition)=?(true):(flase); we used it below check it out

        x = a%2==0?(90):(80);
        System.out.println(x);

    }
}