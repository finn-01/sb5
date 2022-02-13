# sb5



> Written with [StackEdit](https://stackedit.io/).

# Component Scan
Tìm hiểu cách **Spring Boot** tìm kiếm *Bean* trong project: 
Cấu trúc
![enter image description here](https://github.com/finn-01/img-project/blob/main/s5-1.png?raw=true)

*Girl.java*

    package vn.finn.spring.demo;  
    import org.springframework.stereotype.Component;
    @Component  
    public class Girl {  
    @Override  
     public String toString() {  
        return "Girl.java";  
         }  
         } 
 *OtherGirl.java*
 ```package vn.finn.spring.demo.other;  
  
import org.springframework.stereotype.Component;  
  
@Component  
public class OtherGirl {  
    @Override  
  public String toString() {  
        return "OtherGirl.java";  
  }  
}```
