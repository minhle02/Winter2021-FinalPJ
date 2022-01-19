package utility;

public class People implements Comparable<People> {
    private int age;
    private String firstName;
    private String lastName;

    public People(int age, String firstName, String lastName) {
        if (age<0 || age>65)
            throw new IllegalArgumentException();
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(People other) {
        if (this.age == other.age) {
            if (this.lastName.equals(other.lastName))
                return firstName.compareTo(other.firstName);
            else
                return this.lastName.compareTo(other.lastName);
        }
        else
            return -(this.age - other.age);
    }

    public String toString() {
        return "" + age + "\t" + lastName + ",\t" + firstName;
    }
}
