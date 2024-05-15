package solution1_with_inheritance;

import java.util.Arrays;

public class Customer {
    private String name;
    Rent[] rents=new Rent[10];
    int indexRent=0;
    public Customer(String name) {
        this.name = name;
    }
    public void addToRent(Rent rent) {
       rents[indexRent] = rent;
       indexRent++;
    }
    public int sumPenalty (){
        int sumPenalty = 0;
        for (int i = 0; i < indexRent; i++) {
            sumPenalty +=  rents[i].calcPenalty();
        }
        return sumPenalty;
    }
    public int sumInvoice (){
        int sumPenalty = 0;
        for (int i = 0; i < indexRent; i++) {
            sumPenalty +=  rents[i].calcInvoice();
        }
        return sumPenalty;
    }

    @Override
    public String toString() {
        return "enuvideo.Customer{" +
                "name='" + name + '\'' +
                ", rents=" + Arrays.toString(rents) +
                ", indexRent=" + indexRent +
                '}';
    }
}
