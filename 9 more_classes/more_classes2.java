public class more_classes2
{
    ///we will explore th difference between public and static

    static void easyCall() //static methods can be called without creating objects
    {
        System.out.println("call as is");
    }

    public void newCall() //public methods can only be called by creating objects
    {
        System.out.println("call with new");
    }

    public static void main(String[] args)
    {
        more_classes2 test = new more_classes2(); //created object called test out of newCall

        easyCall();
        test.newCall();
    }
}