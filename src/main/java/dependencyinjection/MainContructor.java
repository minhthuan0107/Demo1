package dependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.AccountService;

public class MainContructor {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dependencyinjection/bean-contructor.xml");
        AccountService accountService = applicationContext.getBean("accountServiceContructor", AccountService.class);

        System.out.println("Before money transfer");
        System.out.println("Account 1 balance:"+accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance:"+accountService.getAccount(2).getBalance());

        accountService.transferMoney(1,2,5.0);
        System.out.println("==================");
        System.out.println("After money transfer");
        System.out.println("Acount 1 balance:"+accountService.getAccount(1).getBalance());
        System.out.println("Acount 2 balance:"+accountService.getAccount(2).getBalance());
    }

}
