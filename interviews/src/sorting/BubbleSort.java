package sorting;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class BubbleSort {

    public static int[] bubSort(int[]arr) {
        for (int i = 0; i < arr.length;i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return arr;
        // T: n^2 S: n
    }


}

class Test {

    public static void main(String[] args) {
        /*int[] arr = new int[]{4, 1, 3, 6, 2, 5};
        List<Integer> res = Arrays.stream(BubbleSort.bubSort(arr)).boxed().collect(Collectors.toList());
        res.forEach(System.out::println);*/
        String a = "Hello";
        String b = "Hello";
        System.out.println(a == b);

    }
}