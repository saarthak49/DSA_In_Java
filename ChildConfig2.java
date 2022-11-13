public class ChildConfig2 extends ParentConfig{

    private final String address;

    public ChildConfig2(final String name, final String age, final String address) {
        super(name, age);
        this.address = address;
    }
}
