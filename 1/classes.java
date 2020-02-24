public class classes
{
    public static void main(String[] args)
    {
        System.out.println("Kay");
    }
}

/*--------------Classses------------------*/
/*
    *)Classes are like blueprints in java.
    it will contain methods. Your class name
    should always be the name of your java
    file.

    *)The main method
     (public static void main(String args[]))
     makes your code a program, and enables you
     to run it. The main has to have 
     public static void main(String[] args)
     to work

    *)System.out.println("") allows you to print 
     to the standard output(terminal).
     println is a child of System.out
     Think about it as youre telling the
     System to output a println.

    *)Lets try to compile and run it.
      if youre hopefully using ubuntu linux
      type : sudo apt install -y default-jdk
      that should install the things you need
      ............................................
      when its done then type:
      javac classes.java
      to compile. think of it as java-compile
      it should return a classes.class file
      if it completes correctly.
      .............................................
      run it by typing:
      java classes
      java runs .class files
    */