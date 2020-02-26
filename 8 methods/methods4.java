public class methods4
{
    //we will be focusing on overloading methods

    public static void num(int i) //method that takes int when called
    {
        System.out.println(i); //prints i argument
    }

    public static void num(int i, String name) //same name as previous method, takes in differnt params
    {
        System.out.println(name + " " + i); //prints arguments inserted
    }

    //making methods like this is called overloading
    public static void main(String[] args)
    {
        num(5); //prints 5
        num(10, "kauthar"); //prints "Kauthar 10"
        num(19, "Carl"); //Carl 19
        num(19); //19  
    }
}