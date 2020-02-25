public class operators
{
    public static void main(String[] args)
    {
        int num = 5, temp; //declared 2 int with num = 5 and temp = null
        String name = "Kay", last = "Kauthar"; //declare 2 strings 

        temp = num + 2;
        System.out.println(temp); // temp = 7
        temp -= 3;
        System.out.println(temp); // temp = 4
        System.out.println(num % temp); // prints 1 <- % gets remainder
        System.out.println((num += 15) / temp); //prints 5, num = 5+15 then div by 4
        System.out.println(num + num); //prints 40
        System.out.println(name+last);// KayKauthar
        System.out.println(num + " " + num); //prints 20 20 <- treated like string
        System.out.println(temp+name);// 4Kay 
    }
}