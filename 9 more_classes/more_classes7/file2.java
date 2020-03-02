package more_classes7;

public class file2
{
    public static void main(String[] args)
    {
        file1 encapsulation = new file1(); //create object to access file1 classes

        System.out.println(encapsulation.getName()); //get private variable
        //System.out.println(encapsulation.name); wont work because name is private

        encapsulation.setName("Goodnight"); //change private string value
        //encapsulation.name = "Goodnight"; wont work because name is private

        System.out.println(encapsulation.getName()); //print changed values
    }
}


/*---------------------ENCAPSULATION-------------------------*/
/*
    *) you cant access privates from another class, so you use its
        public methods to manipulate the private vars, thats why
        its good to have getters and setters.
 */
