public class variables2
{
    public static void main(String[] args) 
    {
        int testint = 10;
        double testdouble = testint;

        System.out.println(testint);      // Outputs 10
        System.out.println(testdouble);   // Outputs 10.0
        
        double testdouble2 = 9.78;
        int testint2 = (int) testdouble2; // Manual casting: double to int

        System.out.println(testdouble);   // Outputs 9.78
        System.out.println(testint2); //Outputs 9  
    }
}