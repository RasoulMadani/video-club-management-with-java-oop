package solution1_with_inheritance;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ChildrenVideo childrenVideo = new ChildrenVideo("amoPorang","art");
        Customer customer = new Customer("hasan");
        Rent rent = new Rent(childrenVideo, LocalDate.now().minusDays(10) );
        Rent rent1 = new Rent(childrenVideo, LocalDate.now().minusDays(10) );


        customer.addToRent(rent);
        customer.addToRent(rent1);

        System.out.println(customer.sumInvoice());
    }
}