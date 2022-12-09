import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());

        customerManager.Save(new Customer(11111,"Hüseyin","Kınay",new SimpleDateFormat("7/11/1985"),"123456789"));


    }
}
