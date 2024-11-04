package ADVANCE_JAVA.COLLECTION_FRAMEWORK.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMerge {

    public static List<Integer> afterMergeList = new ArrayList<>();
    public static int list2IteratorCount = 0;
    public static void main(String[] args) {
        List<Integer> firstList = Arrays.asList(1,3,5);
        List<Integer> secondList = Arrays.asList(2,4,6,8);
        System.out.println(doSandwichMerge(firstList,secondList));
    }

    private static List<Integer> doSandwichMerge(List<Integer> list1, List<Integer> list2){
        for(int i=0;i<list1.size()+list2.size();i++){
            if(i<list1.size()) {
                afterMergeList.add(list1.get(i));
            }
            addFromList2(list2);
        }
        return afterMergeList;
    }
    private static void addFromList2(List<Integer> list2){
        for(int j=0;j<list2.size();j++){
            if(j>=list2IteratorCount) {
                afterMergeList.add(list2.get(list2IteratorCount));
                list2IteratorCount++;
                break;
            }
        }
    }


}
