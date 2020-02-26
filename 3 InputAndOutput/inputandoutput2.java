import java.util.Scanner;

public class inputandoutput2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in); //create a scanner to scan input when used

        //so in this example I will focus on printf() , your favourite :)
        //Remember to use a comma for floats and doubles when inputting values
        //E.G. :  5,3 instead of 5.3 otherwise it wont work

        System.out.println("insert a string"); //prompt message
        String sentence = scan.nextLine(); //scan for a string

        System.out.println("insert a int"); //prompt message
        int num = scan.nextInt(); //scan for an int
        scan.nextLine();
        
        System.out.println("insert a double"); //prompt message
        Double dub = scan.nextDouble(); //scan for a double
        scan.nextLine();

        System.out.println("insert a float"); //prompt message
        float flo = scan.nextFloat(); //scan for a float
        scan.nextLine();

        System.out.println("insert a char"); //prompt message
        char ch = scan.next().charAt(0); //scan for a char
        
        scan.close();

        System.out.printf("your string was: %s \n", sentence); //%s in printf is for printing strings
        System.out.printf("your int was: %d \n", num); //%d in printf is for printing ints
        System.out.printf("your double was: %f \n", dub); //%f in printf is for printing doubles
        System.out.printf("your flo was: %f \n", flo); //%f in printf is for printing floats
        System.out.printf("your char was: %c \n", ch); //%c in printf is for printing chars
    }
}

/*----------------------PRINTF-------------------*/
 /*
    *) printf is used for fromating your output
        so that you always get the result but can change 
        the values in them
        However... its not the only way to format outpput
        in the next example i will demonstrate and explain
        more about printf and other formatters
*/