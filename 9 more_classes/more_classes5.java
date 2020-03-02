public class more_classes5
{
    int x;
    int y;

    public more_classes5() //constructor, has same name as class
    {
        x = 9; //assign value to x 
    }

    public more_classes5(int i) //constructors can take parameters
    {
        x = i;
    }

    public more_classes5(int i, int j)
    {
        x = i;
        y = x + j;
    }

    public static void main(String[] args)
    {
        more_classes5 obj = new more_classes5();
        more_classes5 obj2 = new more_classes5(19, 12);
        more_classes5 obj3 = new more_classes5(10);

        System.out.println(obj.x + "\n"); //prints 9

        System.out.println(obj2.x + " " + obj2.y + "\n"); //prints 19 31

        System.out.println(obj3.x); //prints 10
    }
}
}