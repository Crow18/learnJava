public class inputandoutput3
{
    public static void main(String[] args)
    {
        //more on printf in this example ;)

        String test = "ignored string", real = "displayed string"; //strings that will be used later;
        int num = 101002; //int that we will use later


        //Selecting an idex
        System.out.printf("the selected string is %2$s \n", test, real); //notice 2$ in the %s. I'm selecting the 2nd argument instead of the first

        //giving a width
        System.out.printf("|%10d| \n", num); //notice the 10 in %d. Im allocating 10 spaces to print, unless the argument is larger than 10 spaces

        //specifying max characters
        System.out.printf("|%.8s| \n", real); //notice the .8 in % and s, I'm giving an absolute maximum for characters

        //specifying width and max characters
        System.out.printf("|%15.8s| \n", real); //notice the 15.8 in % and s, I'm giving 15 as width and .8 for absolute maximum for characters

        //justifying to the left
        System.out.printf("|%-10d| \n", num);//notice the -10 in %d. Im allocating 10 spaces to print and "-" to state position

        //padding with zeros
        System.out.printf("|%010d| \n", num);//notice the 0 before 10 in %d, I'm stating for whatever spaces available to be 0's

        //adding signs: +/-
        System.out.printf("|%+10d| \n", num); //if number is positive it will add a "+" infront of it
        //lets make our num negative
        num *= -1; // times -1 to make negative
        System.out.printf("|%+10d| \n", num); //if number is negative it will add a "-" infront of it
        num *= -1; //times -num by -1 to make positive

        //seperating with commas
        System.out.printf("|%,d| \n", num+200000000); //notice the "," in % and d will seperate every 3rd number with comma or space -> 200,101,002 or 200 101 002
                                                     //you can manipulate the result directly in the output, i only added 200 mil to the output

        //String Format, all of the above conversions can be done in String.Format aswell
        System.out.println(String.format("|%15.8s| \n", real)); //will do the same as printf("%15.8s", real);

        //string format is useful for when you need to store the conversion in a variable e.g.
        test = String.format("%.5s", real); //test is now the conversion of real
        System.out.println(test); //test is printed
    }
}