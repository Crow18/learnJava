import java.util.*; //for arraylist and collection fuctions like sort(), * gets anything i needs
import java.util.ArrayList;
import java.util.Collections;

public class arrays2
{  
    public static void main(String args[])
    {  
        List<String> sentence = new ArrayList<String>();  
        sentence.add("Kay");  
        sentence.add("is");
        sentence.add("really");  
        sentence.add("a");  
        sentence.add("serendipitous");
        sentence.add("find");  
        
        //looping, you can use loops to traverse(go through) the list
        // you can use WHILE, DO WHILE, FOR or FOR-EACH loops. FOR-EACH below.
        
        for(String s : sentence)
        {  
            System.out.print(s + " ");
        }
        System.out.println(" ");


        sentence.add(0, "Kauthar"); //adds Kauthar as first element

        for(String s : sentence)
        {  
            System.out.print(s + " ");
        }
        System.out.println("\n");

        System.out.println("2nd element : " + sentence.get(1)); //gets the the index 1 of sentence[]
        System.out.println("\n");

        //lets remove elements
       
        sentence.remove(1); //removes Kay from list
        sentence.remove("really"); //removes really from list
        sentence.set(4, "Catch"); //replaces 5th element to Catch
        System.out.println(sentence);

        System.out.println("\n");

        
       
        //loop with an iterator

        ListIterator<String> count = sentence.listIterator(); //declare iterator of type with a name and apply it to list NOTE spelling
        
        System.out.println("moving forward in list"); 
       
        while(count.hasNext()) //while count has a value after then...
        {
            System.out.println("index:" + count.nextIndex() + " element:" + count.next());
        }



        System.out.println("\nmoving backards in list"); 

        while(count.hasPrevious()) //while count has a value after then...
        {
            System.out.println("index:" + count.previousIndex() + " element:" + count.previous());
        }


        System.out.println("\n");

        //now lets sort it out alphabetically using collections
        Collections.sort(sentence);
        System.out.println(sentence); //will print in alphabetical order, allCaps will print first

        System.out.println("\n");

        

        //now lets clear the list
        
        System.out.println("\n");


        sentence.clear(); //clears list
        System.out.println(sentence); //prints sentence list as empty
    }  
}

/*----------------ARRAY-LISTS---------------------------*/

/*
    *) ARRAYLISTS are cool becuase you can modify them
       and easily maintain them. they will come in handy
       alot. theres more to it but I will put that in later
*/