package more_classes6;

public class file2
{
    public static void main(String[] args)
    {
        file1 encapsulation = new file1(); //create object to access file1 classes

        System.out.println(encapsulation.getName()); //get private variable
        encapsulation.setName("Goodnight"); //change private string value
        System.out.println(encapsulation.getName()); //print changed values

    }
}
