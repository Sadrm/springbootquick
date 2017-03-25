import java.util.Arrays;
import java.util.List;

/**
 * Created by wangxc on 2017/3/16.
 */
public class Main {
    public static void main(String[] args) {
        List<String> features = Arrays.asList("Lambdas", "Default Method",
                "Stream API", "Date and Time API");
        for (String feature : features) {
            System.out.println(feature);
        }

        features.forEach(n-> System.out.println(n));
        features.forEach(System.out :: println);

    }
}
