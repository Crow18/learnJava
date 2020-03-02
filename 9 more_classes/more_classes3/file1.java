package more_classes3; //read the stuff below

public class file1
{
    public void Outfile()
    {
        System.out.println("This comes from file1");
    }

    public int num()
    {
        int i = 9;
        return i;
    }
}

/*
    *) PACKAGE, you probably noticed that we have something new in our code
        a package is basically a folder that contains muliple files you wanna
        compile together. thats why the package name is the same as the parent
        directory of these files. we normally use it also to avoid having file
        name conflict in programs. lets say i have 2 files called PrintName.java
        but i can Package them to avoid that clash :)

    *) COMPILE AND RUN, look at the screenshot in the terminal window to see how
        to run and compile
*/
