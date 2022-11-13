import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
class Address implements Cloneable
{
    private String street;
    private String city;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
//        try {
//            Address clone = (Address) super.clone();
//            // TODO: copy mutable state here, so the clone can't change the internals of the original
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
    }
}

class Student implements Cloneable
{
    private String name;
    private Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
//        try {
//            Student clone = (Student) super.clone();
//            // TODO: copy mutable state here, so the clone can't change the internals of the original
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}


public class LearnClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("104 House 10", "Bengaluru");
        Student student1 = new Student("Ram", address);

        Student student2 = (Student) student1.clone();

        System.out.println(student2);
        student2.setName("Shyam");

        student2.getAddress().setCity("Allahabad");


        System.out.println(student2);


        System.out.println(student1);
    }
}
