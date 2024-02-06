public class Student {
    private int age;
    private String firstName;
    private String lastName;
    private int year;
    private Address address;

    public Student (String firstName, String lastName, int age, int year, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.age = age;
        this.address = address;
    }
    public String getFirstName () {
        return firstName;
    }
    public String getLastName () {
        return lastName;
    }
    public int getYear () {
        return year;
    }
    public String getAddress () {
        return address.toString();
    }
    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public void setYear (int year) {
        this.year = year;
    }
    public void setAddress (Address address) {
        this.address = address;
    }
    private void addOneAge () {
        age = age+1;
    }
   public int birthday (){
        addOneAge();
        return age;
    }
    public String toString () {
        return firstName + lastName + "," + age + "," + year + "," + address;
    }

}

