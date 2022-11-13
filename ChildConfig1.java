public class ChildConfig1 extends ParentConfig {

    private final Long marks;

    public ChildConfig1(String name, String age, Long marks) {
        super(name, age);
        this.marks = marks;
    }

    public Long getMarks()
    {
        return this.marks;
    }

}
