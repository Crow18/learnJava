public class methods2
{
    public static String Name() //making a method having type String
    {
        String name = "Kauthar"; //create a string 
        return name; //return string, notice that I return the same type as the method
    }

    public static String LastName()
    {
        String lastname = "Schoeman";
        return lastname;
    }

    public static int Number()
    {
        int num = 10;
        return num;
    }

    public static double Rate()
    {
        double hot = 9.5d;
        return hot;
    }

    public static char letter()
    {
        char start = 'K'; //notice that char has single quotes
        return start;
    }

    public static void main(String args[]) //main method... makes a program
    {
        System.out.printf("%s %s %c %d %.2f \n", Name(), LastName(), letter(), Number(), Rate()); //call the values that each method returns accordingly
    }
}

/*--------------------------METHODS----------------------------------*/

/*
    *) Methods are just blocks of code you execute. 
        methods always have a return type that matches its own data type.
        e.g.:

        public static int test()
        ------ -----  type name().
                      
        think of it like declaring a variable. ignore public static for now

        you call methods in main method to execute them... we will go deeper
        into this topic a little later
*/