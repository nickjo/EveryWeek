import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by nick on 17. 1. 15.
 */
public class Ex10947 {
    public static void main(String[] args) {
        Random r = new Random();
        Map<Integer, Integer> map = new HashMap();

        int radNum;
        int count = 0;

        while (count < 6){
            radNum = r.nextInt(64)+1;

            Integer input = map.put(radNum,radNum);
            if(input == null){
                count++;
            }else {
//                System.out.println("input: " + input);
            }
        }

//        map.forEach((k,v) -> System.out.println("Key: " + k + ", Value: " + v));
        map.forEach((k,v) -> System.out.print(v + " "));
    }
}
