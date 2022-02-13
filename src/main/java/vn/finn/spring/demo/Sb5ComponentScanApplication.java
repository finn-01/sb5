package vn.finn.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import vn.finn.spring.demo.other.OtherGirl;
import vn.finn.spring.demo.other2.OtherGirl2;

//@ComponentScan
//@ComponentScan("vn.finn.spring.demo.other")

//@ComponentScan Multiple
@ComponentScan({"vn.finn.spring.demo.other", "vn.finn.spring.demo.other2"})

//scanBasePackages
//@SpringBootApplication(scanBasePackages  = "vn.finn.spring.demo.other")
//

@SpringBootApplication
public class Sb5ComponentScanApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Sb5ComponentScanApplication.class, args);

        try{
            Girl girl = context.getBean(Girl.class);
            System.out.println("Bean: " + girl.toString());
        }catch (Exception e){
            System.out.println("No bean Girl");
        }

        try{
            OtherGirl otherGirl = context.getBean(OtherGirl.class);
            if(otherGirl != null){
                System.out.println("Bean: " + otherGirl.toString());
            }
        }catch (Exception e){
            System.out.println("Bean Girl not found");
        }

        try{
            OtherGirl2 otherGirl2 = context.getBean(OtherGirl2.class);
            if(otherGirl2 != null){
                System.out.println("Bean: " + otherGirl2.toString());
            }
        }catch (Exception e){
            System.out.println("Bean Girl not found");
        }
    }

}
