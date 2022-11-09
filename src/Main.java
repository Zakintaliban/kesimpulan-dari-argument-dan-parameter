public class Main {
 
    // variabel a dan b adalah parameter
    public static int multiply(int a, int b)
    {
        return a * b;
    }
 
    public static void main(String[] args)
    {
        int x = 2;
        int y = 5;
 
        // variabel x dan y adalah variabel argument
        int product = multiply(x, y);
 
        System.out.println("PRODUCT IS:" + product);
    }
}