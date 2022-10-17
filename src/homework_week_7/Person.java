package homework_week_7;
//Person
//write a class with a name person
//the class needs three fields(instance variable)with the names firstName, lastName of type String and age of type int

public class Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName= " + person.getFullName());
    }
    public String firstName;
    public String LastName;
    public int age;

/*    public String getFullName() {
        return firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public int getAge() {
        return age;
    }*/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.LastName = lastName;
    }
    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }
    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }
    public String getFullName() {
        if (firstName.isEmpty()) {
            return LastName;
        }
        if (LastName.isEmpty()) {
            return firstName;
        }
        if (firstName.isEmpty() && LastName.isEmpty()) {
            return " ";
        } else {
            return firstName + " " + LastName;
        }
    }
}
