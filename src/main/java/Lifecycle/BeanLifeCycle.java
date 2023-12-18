package Lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class BeanLifeCycle {
    public void  init(){
        System.out.println("Init method is called");
    }
    public  void  destroy(){
        System.out.println("destroy method is called");
    }
}
