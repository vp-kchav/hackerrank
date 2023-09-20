package intuit.servicescheduler;

public class Solution {


    public static void main(String[] args) {

        Customer a = new Customer("a","1234", CustomerType.REGULAR);
        Customer c = new Customer("c","5678", CustomerType.VIP);
        Customer d = new Customer("d","1123", CustomerType.VIP);
        Customer e = new Customer("e","91283", CustomerType.VIP);
        Customer b = new Customer("b","8272", CustomerType.REGULAR);


        ScheduleService scheduler = new ScheduleService();

        System.out.println("----------- PART 1 ------------- ");
        scheduler.checkInCustomer(a);
        scheduler.checkInCustomer(c);
        scheduler.checkInCustomer(d);
        scheduler.checkInCustomer(b); // What would be the wait time for customer B check in?? Ans: 20 minutes
        scheduler.checkInCustomer(e);

        System.out.println("----------- PART 2 ------------- ");
//         System.out.println(scheduler.getNextCustomer().toString());
//         System.out.println(scheduler.getNextCustomer().toString());
//         System.out.println(scheduler.getNextCustomer().toString());
//         System.out.println(scheduler.getNextCustomer().toString());
//         System.out.println(scheduler.getNextCustomer().toString());

        System.out.println("----------- PART 3 ------------- ");
//        scheduler.checkInCustomer(a);
//        scheduler.checkInCustomer(c);
//        scheduler.checkInCustomer(d);
//        scheduler.checkInCustomer(b); // What would be the wait time for customer B check in?? Ans: 20 minutes
//        scheduler.checkInCustomer(e);
        System.out.println(scheduler.getNextCustomerWithRate().toString());
        System.out.println(scheduler.getNextCustomerWithRate().toString());
        System.out.println(scheduler.getNextCustomerWithRate().toString());
        System.out.println(scheduler.getNextCustomerWithRate().toString());
        System.out.println(scheduler.getNextCustomerWithRate().toString());

    }
}
