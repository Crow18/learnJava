public class conditions
{
    public static void main(final String args[])
    {

        /*-------------------EXAMPLE--WITH-STRINGS-----------------------------------*/

        String example = "Kautahr";
        
        if(example.equals("Kauthar"))
        {
            System.out.println("correct spelling");
        }
        else if(example.equalsIgnoreCase("Kay")) //can be uppercase or lowercase in check
        {
            System.out.println("Psuedonym");
        }
        else
        {
            System.out.println("incorrect spelling");
        }
        

        /*-------------------EXAMPLE--WITH-INTS------------------------------------*/
        int example2 = 69;

        if(example2 == 100)
        {
            System.out.println("example is being compared in order to do a check.");
        }
        else if(example2 > 50 && example2 < 60)
        {
            System.out.println("both condtions above need to be true to work");
        }
        else if(example2 > 100 || example2 == 69)
        {
            System.out.println("Nice!, one of the above conditions need to be true to work");
        }
        else
        {
            System.out.println("ignore all above statements and do this if none were successful");
        }

        /*------------------------EXAMPLE-WITH-!--------------------------------------------*/

        int example3 = 10;

        if(!(example3 == 9)) //NOTE the ! before the check, ! does the opposite of condition
        {
            System.out.println("checks if example3 is NOT equal to 9");
        }
        else if(example3 != 9)
        {
            System.out.println("not equal to 9");
        }
        else
        {
            System.out.println("end");
        }
    }
}

/*---------------Conditions---------------------------*/

/*
    *) IF statements will execute if condition is met.
       
    *) ELSE IF statements will execute if the condition before
       was not met in the IF and is met in the ELSE IF statement

    *) ELSE statement has no conditions but executes if none
       of the IF and ELSE IF statements were successful

    /*--------OPERATORS--USED---------------------*/

    /*
        *) == is used to check if the number value is the same
        *) .equals() or .equalsIgnoreCase() is used to check if
           strings equal to a word.

        *) &&(AND) checks if both conditions in statement are true to
           work.

        *) ||(OR) checks if any one of the conditions in the statement 
           are true to work

        *) !=(NOT EQUAL) will check if the condion is not the same to work
    */
