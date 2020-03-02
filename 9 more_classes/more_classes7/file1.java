package more_classes7;

public class file1
{
    private String name = "Hello"; //only seen in this class

    public String getName() //getters always return something, usually never 
    {
        return this.name; //this keyword refers to the var in the clas, i will explain this later
    }

    public void setName(String word) //setters dont return anything, but take  parameters
    {
        this.name = word; //setting private to entered parameter
    }
}