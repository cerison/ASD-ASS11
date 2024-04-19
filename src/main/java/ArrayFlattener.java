import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {
    public static int[] flattenArray(int[][] nestedArray) {
        if(nestedArray == null){
            return null;
        }
        List<Integer> tempList = new ArrayList<Integer>();

        for (int[] subArray : nestedArray) {
            for (int value : subArray) {
                tempList.add(value);
            }
        }
        int[] flatArray = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            flatArray[i] = tempList.get(i);
        }

        return flatArray;
    }
}
