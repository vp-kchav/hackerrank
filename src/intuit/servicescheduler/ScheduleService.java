package intuit.servicescheduler;

import java.util.LinkedList;

public class ScheduleService {
    LinkedList<Customer> vipCustomers;
    LinkedList<Customer> regularCustomers;
    int numberVIPServed = 0;


    public ScheduleService() {
        this.vipCustomers = new LinkedList<>();
        this.regularCustomers = new LinkedList<>();
    }

    public void checkInCustomer(Customer customer) {

        switch (customer.getCustomerType()) {
            case VIP:
                vipCustomers.add(customer);
                break;
            case REGULAR:
                regularCustomers.add(customer);
                break;
            default:
                System.out.println("No customer type found");
        }
    }

    public Customer getNextCustomer() {
        Customer customerNext;
        if (!vipCustomers.isEmpty()) {
            customerNext = vipCustomers.remove();
        } else {
            customerNext = regularCustomers.remove();
        }
        return customerNext;
    }

    public Customer getNextCustomerWithRate() {
        Customer customerNext;
        if (regularCustomers.isEmpty() || (!vipCustomers.isEmpty() && numberVIPServed < 2 )) {
            customerNext = vipCustomers.remove();
            numberVIPServed++;
        } else {
            customerNext = regularCustomers.remove();
            numberVIPServed = 0;
        }
        return customerNext;
    }
}
