package sesson4;

public class TextCustomer {
    public static void main(String[]args){
        Customer objCustomer= new Customer();
        objCustomer.customerID=100;
        objCustomer.customerName="Jack";
        objCustomer.customerAddress="123 Streat";
        objCustomer.customerAge = 30;
        objCustomer.displayCustomerInformation();
        objCustomer.changeCustomerAddress("123 Fort,Main Street");
//        objCustomer.displayCustomerInformation();
    }
}
