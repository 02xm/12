import java.util.Arrays;
public class 数组训练1 {
    public static void main(String[] args) {
        int arr[]=new int [10];
        Arrays.fill(arr,0,4,60);
        Arrays.fill(arr,4,10,58);
        Arrays.sort(arr);
        int i;
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
