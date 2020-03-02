public class more_classes5
{
    //we will focus on modifiers in this one :D

    /*-----------Final---------*/
    final String name = "Kauthar"; //readonly, can not be changed when accessed

    final void name()
    {
        more_classes5 finalTestMethod = new more_classes5(); //needs a new instance to access final

        String word = finalTestMethod.name; //Kauthar
        System.out.println("final method has readonly value of " + word);
    }
   /*---------------------------------------------------------------------------*/

    /*---------Static------------*/
    static String test = "open"; //aaah the hoe of all modifiers, can be used anywhere in class, 
                                //often used for a common property

    static void wrap()
    {
        System.out.println("I acan be used anywhere in class and dont need a new instance");
    }
    /*---------------------------------------------------------------------------*/

    /*--------Protected-----------*/
    protected String tset = "only Class and Package"; //only classes in the same package or subclasses have access

    protected void hold()
    {
        String axe = "weapon";
        System.out.println(axe);
    }
    
    public static void main(String[] args)
    {
        more_classes5 Test = new more_classes5();

        System.out.println(Test.name); // prints readonly Kauthar
        Test.name(); //will use method thats vars can not be changed
        //Test.name = "Melanie"; is an illegal action as name is a final and can't be changed
        System.out.println("\n");
        /*------------------------------------------------------------------------------------------*/

        System.out.println(test); //no new instance of class needed
        wrap(); //same here
        System.out.println("\n");
        /*-------------------------------------------------------------------------------------------*/

        System.out.println(Test.tset); //has access because of same class
        Test.hold(); // ditto/same
    }
}

/*
    *) Thats all for now, ill try and do the others later but for now these are the main ones to look at
*/
