public class more_classes
{

    String var = "outside var"; //declared outside any method. this is a global.   

    public static class Kauthar
    {
        String name = "Kauthar";
        String lastName = "Schoeman";
    }

    public static class MyClass
    {
        more_classes test = new more_classes();

        int num = 10;
        String Month = test.var;
        int year = 2020;
    }

    public static void main(String[] args)
    {
        Kauthar test = new Kauthar(); //call class, give it a name, give it properties of new class
        MyClass mc = new MyClass(); 
        MyClass mc2 = new MyClass();

        System.out.println(test.name); //prints Kauthar
        System.out.println(test.lastName); //prints Schoeman

        System.out.println(mc.num); //prints 10
        mc.num = 19; //change the value for num in mc
        System.out.println(mc.num); //prints 19
        System.out.println(mc2.num); //prints 10 NOTE: mc2

        System.out.println(mc.year); //prints 2020
        mc.year += 10; //year in mc is 2030
        System.out.println(mc.year); //2030
        System.out.println(mc2.year); //2020

        mc2.Month = "changed var";  //set month in mc2 to string "changed var"
        System.out.println(mc.Month); //outside var
        System.out.println(mc2.Month); //changed var
    }
}

/*-----------------------MORE_CLASSES---------------------------*/
/*								*/
/*								*/
/*	|----------------KAUTHAR()----------------------|	*/
/*	|						|	*/
/*	| String name = Kauthar				|	*/
/*	|						|	*/
/*	| String lastName = Schoeman			|	*/
/*	|						|	*/
/*	|_______________________________________________|	*/
/*								*/
/*								*/
/*______________________________________________________________*/

/*
	lets say i want to access KAUTHAR(), i can do by doing:
	
	MORE_CLASSES Kay = new MORE_CLASSES;
	
	String temp = Kay.KAUTHAR.name;

	so in this case i made a string equal what is at name thats
	inside KAUTHAR() that is inside MORE_CLASSES.
	Think about it like directories, one thing holds another 
	and so on. with this you can Manage and utilise content
*/
				
