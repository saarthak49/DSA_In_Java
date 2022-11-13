public class TestingJavaWithCnstr {
    private static TemporaryClass temporaryClass;

    public TestingJavaWithCnstr(final TemporaryClass myob)
    {
        temporaryClass = myob;
    }

    public static void main(String[] args) {
        temporaryClass.printSomething();
//        System.out.println("hello");
    }
}
