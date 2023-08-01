package Test91;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
        customers = new Customer[10];
    }
    public void addCustomer(String f,String l){
        Customer customer = new Customer(f,l);
        customers[numberOfCustomer] = customer;
        ++numberOfCustomer;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomer(int index) {
        if(index<0 || index>=numberOfCustomer){
            System.out.println("目标索引不存在");
            return null;
        }else{
            return customers[index];
        }

    }
}
