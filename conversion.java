class conversion
{
    public static void main(String cov[])
    {
        // type conversion and casting
        
        // casting

        byte b = 127;
        int a = 256; 
        byte c = (byte)a; // while converting it to the byte then the way of conversion is (value%256) the remainder is the output we get
        float d = 69.69f;
        int e = (int) d;

        System.out.println(c);
        System.out.println(e);

        //conversion

        byte i = 100;
        int j = i;
        System.out.println(j);

        // type promotion
        byte f = 10;
        byte g = 30;
        int h = f*g; //byte has max of 127 but it exceeds abd that can be stored in the int it means promotion for the byte to integer
        System.out.println(h);

    }
}