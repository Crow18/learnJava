public class conditions2
{
    public static void main(String args[])
    {
        int steps = 5;
        
        switch(steps)
        {
            case 1:
                System.out.println("Talk");
                break;
            case 2:
                System.out.println("Snack");
                break;
            case 3:
                System.out.println("Cigarettes");
                break;
            case 4:
                System.out.println("Walk");
                break;
            case 5:
                System.out.println("Time");
                break;
            case 6:
                System.out.println("Catch");
                break;
            case 7:
                System.out.println("BRE-/-AK");
                break;
            case 8:
                System.out.println("HABITS");
            default:
                System.out.println("EOF");
        }
    }
}

/*---------------------CONDITIONS--------------------------*/

/*
    *) SWITCH CASES are like IF and ELSE statements, you cant
       use operators when checking cases.
    
    *) break out of every case otherwise it will run all of
        the cases before the case you swich case on the one 
        you need.

    *) defualt is like the ELSE statement. if none of the cases
        match then it will execute.
*/