public class methods3
{
    //we will be focusing on arguments/parameters in this example

    public static String NameCard(String name) //make method that takes a String argument when called
    {
        return name; //whatever String passed into method is returned
    }

    public static int Num(int number)
    {
        number = 10; //this var is declared in methods argument
        return number; //value(10) above overwrites whatever int argument inserted in method
    }

    public static void printDetails(String Name, int num) //expects 2 args, a string and an int when called
    {
        System.out.println(Name + " " + num); //prints whatever inserted as arguments
    }

    public static void execute() //when called will execute whatever code is in its block
    {
        printDetails("Carl", 19); //calls a method that prints inserted arguments, yes methods can call other methods
    }
    public static void main(String args[])
    {
        String test = "Kauthar"; //make test string
        System.out.println(NameCard(test) + " " + Num(250)); //printing a method that returns string, method expects a string as argument
                                                             //put test String in the method arugument, same for Num. prints "Kauthar 10"
        execute(); //prints "Carl 19"
    }
}


/*------------------------------METHODS------------------------------------------------*/

/*
    *)Methods can take arguments of data types. you can manipulate those values in the method
       Remember that methods must have its own data type when declared and return the same type

*/