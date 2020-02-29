public class more_classes4
{   
    //we will be focusing on static methods, non-static methods, and the final keyword


    int K = 10; //any var made outside a method in a class is a global

    final int a = 2; //final means that the value cant be changed


    public void noStatic()
    {
        System.out.println("non static can only be called with a new object instance");
    }

    static void isStatic()
    {
        System.out.println("static can be called without having to create an object of its class");
    }
 
/*---------------------------------------------------------------------------------------------------------*/

    public void noStaticParam(int i)
    {
        for(int j = 0; j < i; j++)
        {
            System.out.println("noStaticParam printed " + j + " times");
        }
    }

    static void isStaticParam(String i)
    {
        System.out.println(i + " is parameter from isStaticParam");
    }

    public static void main(String[] args)
    {
        more_classes4 temp = new more_classes4(); //create object temp 

        System.out.println(temp.K); //prints 10
        System.out.println(temp.K += 21); //prints 31
        
        System.out.println(temp.a + "\n"); //prints 2
        // temp.a = 9; this wont work because temp.a is a final and can never be changed

        temp.noStatic(); //no static called from temp object 
        isStatic(); //called as is without using object
        System.out.println("\n");

        temp.noStaticParam(3); //this is just to show that you can add parameters to these methods
        isStaticParam("Test");
    }
}