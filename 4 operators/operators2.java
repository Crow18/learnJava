public class operators2
{
    public static void main(String[] args)
    {
        int i = 10, j = 15, k = 3;
        
        //addition
        System.out.println(i + j); //prints 25
        System.out.println(i = i + j); //prints 25, NOTE: declaring i as the sum of i and j, i = 25
        System.out.println(i += j); //prints 40, same as saying i = i + j, i(sum of i and j) + j, i = 40
        System.out.println("\n");

        
        //subtraction
        System.out.println(i - j); //prints 25 NOTE: we turned i into 40 before, so 40 - 15
        System.out.println(i = i - j); //prints 25,declaring i as the difference of i and j, i is now 15
        System.out.println(i -= j); //prints 10, i is now 10, i = 10
        System.out.println("\n");

        
        //multiplication
        System.out.println(i * k); //prints 30
        System.out.println(i = i * k); //prints 30,declaring i as the product of i and k, i = 30
        System.out.println(i *= k); //i is now 90
        System.out.println("\n");

        
        //division
        System.out.println(j / k); //prints 5
        System.out.println(j = j / k); //prints 5,declaring i as the quotient of j and k, j = 5
        System.out.println(j /= k); // 5 / 3 = 1.67, since its int and not float or double, j = 1
        System.out.println("\n");


        i = 10; //resetting i to 10 from 90

        //division getting remainder
        System.out.println(i % k); //prints 1, 3 can go into 10 about 3 times and we are left with 1
        System.out.println(i = i % k); //prints 1,declaring i as the remainder of i and k
        System.out.println(i %= k); //prints 1, even though 3 cant go into 1 
    }
}