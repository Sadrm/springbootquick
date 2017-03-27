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
            String[] strings = {"z_hao1975@hotmail.com","zh197544","roger-gu-698a036"};
            SpringApplication.run(Application.class,strings);
        }else{
            SpringApplication.run(Application.class,args);
        }

    }
}
