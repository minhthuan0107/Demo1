package Lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BeansLifeCycleAnnotation {

        @PostConstruct
        public void  init(){
            System.out.println("Init method is called");
        }
        @PreDestroy
        public  void  destroy(){
            System.out.println("destroy method is called");
        }
    }

