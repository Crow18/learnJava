public class methods
{
    public static void Name() //this a method
    {
        System.out.println("Kauthar"); //when method called this line will run
    }

    public static void LastName()
    {
        System.out.println("Schoeman");
    }

    public static void loop()
    {
        for(int i = 0; i <= 10; i++)
        {
            if(!(i % 2 != 0)) //if remainder is not 0 when divided by 2, even numbers, is not true.
            {
                continue ; //skip over them
            }
            System.out.print(i); //print value at i (all odd numbers)
        }
    }

    public static void main(String args[])
    {
        Name(); //executes Name();
        LastName(); //executes LastName();
        loop(); //prints odd numbers
    }
}