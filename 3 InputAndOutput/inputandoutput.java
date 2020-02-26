import java.util.Scanner; //importing a library to use a scanner

public class inputandoutput
{
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in); //create reader as a scanner then equal new one taking input to system

        System.out.println("write a string to print");
        
        String input = reader.nextLine(); //input is a string that equals the line that is scanned
        System.out.println(input); //display what inputs value is
        
        System.out.println("write an int to print");

        int input2 = reader.nextInt(); //second input is an int. Note only scans for ints
        System.out.println(input2); //display what input2s value is

        //you can call as scanner dirctly in a println too
        System.out.println("write a string to print");
        System.out.println(reader.next()); //prints first word entered by user, next() will only scan the first word

        reader.close(); //close the scanner after because it keeps reading and gives memory leaks
    }
}