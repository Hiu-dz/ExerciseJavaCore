package HRManagement;

abstract class Human {
    protected String firstName;
    protected String lastName;

    public Human() {

    }
    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
