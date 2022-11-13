public class TestRemoteDebugging {
    public static void main(String[] args) {
        System.out.println("Will pause the debugger here");
        System.out.println("Hey there how are you");
        //going into infinite loop so that application is running
        int i = 1;
        while(true)
        {
            System.out.println("in infinite loop " + i);
            i++;
        }
    }
}


// was able to remote debug this
// the terminal stops spewing out messages
// only when you step over the next sout gets printed
// note if it shows connection refused errors, then try closing intellij and running fresh
// or maybe changing the port can also fix the issues.