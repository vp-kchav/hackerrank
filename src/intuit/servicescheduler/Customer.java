package intuit.servicescheduler;


public class Customer {
    private String firstName;
    private String lastName;
    private String contact;
    private CustomerType customerType;

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", customerType=" + customerType +
                '}';
    }

    public Customer(String firstName, String lastName, CustomerType customerType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerType = customerType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContact() {
        return contact;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
