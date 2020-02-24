public class variables
{
    public static void main(String[] args)
    {
        String str = "Kay";
        int month = 10;
        float DOB = 10.10f;
        char letter = 'K';
        boolean isAffable  = true;
        double rate = 10.10d;

        System.out.println(str);
        System.out.println(month);
        System.out.println(DOB);
        System.out.println(letter + " " + isAffable + " " + rate);
    }
}


/*-------------------Variables---------------------*/
/*
    *)To declare variables you will need to have:
      (Type) (variable_name) = (value);
      String  MyRandVarname  =  "test";
    
      for floats you will need to add f after value
      so that it can be recognized as a
      float(float DOB = 10.10f;)
      , same goes for double by adding d at the end 
      of value(double rate = 10.10d;)
      the difference between doubles and floats is the
      size of the number it can handle.

      System.out.println() can pretty much display any var
      so we will use it alot. maybe... but its good for
      testing.

      println() can concatenate all var types, we use + to 
      concatenate. e.g.
      System.out.println("It's " + isAffable + " that " + str + "is Affable.");
      which will result in:
      It's true that Kay is Affable.
      println() is like a lazy printf() although we will use it later.
      
*/
