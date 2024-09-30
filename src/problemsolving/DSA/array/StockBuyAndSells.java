package problemsolving.DSA.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StockBuyAndSells {
    public static void main(String[] args) {
//        Integer[] arr = {4, 3,2,1};
        int[] arr = {7, 10, 1, 3, 6, 9, 2};
//        Integer[] arr = {7,1,5,3,6,4};
        int sellTime = bestTimeToBuyAndSell(arr);
        System.out.println(sellTime);
    }

    public static int bestTimeToBuyAndSell(int[] prices) {
        List<Integer> list = Arrays.stream(prices).boxed().toList();

        int[] finalResult = new int[2];
        int minValue = Collections.min(list);
        int maxValue = Collections.max(list.subList(list.indexOf(minValue), prices.length));
        if(maxValue>minValue)
            return list.indexOf(maxValue)+1;
        else
            return 0;
    }
}
