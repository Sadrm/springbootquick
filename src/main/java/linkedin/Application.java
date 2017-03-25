package linkedin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by bd2 on 2017/3/9.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        if(args.length<=0){
            String[] strings = {"{usernmae}","{password}","roger-gu-698a036"};
            SpringApplication.run(Application.class,strings);
        }else{
            SpringApplication.run(Application.class,args);
        }

    }
}
