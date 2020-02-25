import javax.lang.model.util.ElementScanner6;

public class conditions
{
    public static void main(final String args[])
    {
        final String example = "Kautahr";

        if(example.equals("Kauthar"))
        {
            System.out.println("correct spelling");
        }
        else if(example.equals("Kay"))
        {
            System.out.println("Psuedonym");
        }
        else
        {
            System.out.println("incorrect spelling");
        }
    }
}