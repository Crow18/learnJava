public class more_classes7
{
    //explaining this keyword in this example

    String name = "C language";

    public void Test()
    {
        String name = "Java";

        System.out.println(this.name); //refers to global name, prints C language
        System.out.println(name); //refers to local name, prints Java
    }
    public static void main(String[] args)
    {
        more_classes7 thisTest = new more_classes7();

        thisTest.Test();
    }
}