public class arrays1
{
    public static void main(String[] args)
    {
        int numbers[] = {1, 20, 4, 6, 9, 12, 10, 10 , 2};

        System.out.println(numbers[0]); //prints 1
        System.out.println(numbers[numbers.length -1]); //prints 2
        System.out.println(numbers[4]);// prints 9

        //looping through arrays
        System.out.println(" ");

        for(int i : numbers) //advanced for loop, will loop through every element in numbers[]
        {
            System.out.printf("%d ", i);
        }
        
        System.out.println(" ");

        //you can have a multidimensional array too

        String words[][] = {{"I", "You", "Me"}, {"Like", "Sweet", "Much", "Think"}};

        System.out.println(words[0][0]); //prints I
        System.out.println(words[1][0]); //prints Like
        
        System.out.println(words[1][2]);//prints Much

        System.out.println(" ");
        
         
        System.out.println(words[0].length); //length of array 0
        System.out.println(words[1].length + "\n"); //length of array 1

        System.out.println(words[0][1].length()); //length of you in array 0
        System.out.println(words[1][1].length()); //length of sweet in array 1
        
    }
}

/*-----------------ARRAYS------------------------------------*/

 /*
    *) ARRAYS have a set index. The index starts at 0 e.g.
       {1, 2, 3, 4, 5, 6, 7, 8, 9}
       ---------------------------
       [0][1][2][3][4][5][6][7][8]
       if you use .length it gives you the amount of elements
       in the array. the above array will have a length of 9.
       to select an element you have to specify using [] e.g.
       arraynum[3] will be 4.
*/