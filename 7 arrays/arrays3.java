import java.util.HashMap;

public class arrays3
{
    public static void main(String args[])
    {
        HashMap<String, String> fullname = new HashMap<String, String>();

        fullname.put("Carl", "Liguma");
        fullname.put("Peter", "Pan");
        fullname.put("Kauthar", "Schoeman");
        fullname.put("Bruce", "Wayne");

        System.out.println(fullname + "\n"); //displays the keys and values

        System.out.println(fullname.get("Kauthar") + "\n"); //prints Schoeman

        //lets remove a key from fullname

        fullname.remove("Peter"); //removes Peter Pan
        System.out.println(fullname + "\n");


        //get the size of the hashmap

        System.out.println(fullname.size() + "\n");


        //replace value by key  in hashmap

        fullname.replace("Bruce", "Banner"); //Bruce Wayne turns into Bruce Banner
        System.out.println(fullname + "\n");


        //check if map has key

        System.out.println(fullname.containsKey("Kay") + "\n"); //should return false


        //check if map has value

        System.out.println(fullname.containsValue("Schoeman") + "\n");//should return true


        //loop through hashmap

        for (String i : fullname.keySet()) //keyset is set of keys in fullname hash map
        {
            System.out.println("key: " + i + "\tvalue: " + fullname.get(i));
        }

        
        //lets clear the hash map

        fullname.clear(); //clears hash map
        System.out.println("\n" + fullname + "\n");
    }
}

/*-----------------HASH-MAPS------------------------*/

/* 
    *) hash maps are made  by using :
       HashMap< data type, data type > nameOfMap = new HashMap< data type, data type >();

*/