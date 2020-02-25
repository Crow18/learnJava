public class loops
{
    public static void main(String args[])
    {
        int i = 0; //set i to 0
        while(i < 10) //while i is less than 10
        {
            System.out.println(" i = " + i++); //then print i and increment
        }
         //prints 0 to 9

        System.out.println("------------------------");


        for(int j = 0; j <= 9; j++) //for int j equals 0, and is less than 10, increment
        {
            System.out.println(" j = " + j); //print j
        }
        //prints 0 to 9

        System.out.println("------------------------");

        int k = 5;
        do{
            System.out.println("k = " + k + "runs before the condition");
            k++;
        }while(k < 3);
        //prints 5

        System.out.println("------------------------");

        // Now that you know about these loops we can learn about break and continue
        i = 0;
        while(i <= 100)
        {
            if(i == 31) //if i is 31 then...
            {
                break; //stop and break out of the loop
            }
            System.out.print(i + " "); //print value of i
            i++; //increment i by 1
        }

        System.out.print("\n"); //print newline
        System.out.println("------------------------");


        for(int j = 0; j <= 100; j++)
        {
            if(j % 2 == 0) //if j is completely divisible by 2(even number) then...
            {
                continue; //skip and continue over it
            }
            System.out.print(j + " "); //print value of j
        }
        System.out.print("\n"); //print newline
    }
}