import java.util.ArrayList;
import java.util.Arrays;

public class RunningSum {
    public static int[] runningSum(int[] nums){
        int temp = 0;
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp = temp + nums[i];
            output[i] = temp;
        }
        return output;
    }

//    public static void main(String[] args){
//        int[] input = new int[]{1,2,3,4,5};
//        System.out.print(Arrays.toString(runningSum(input)));
//
//    }
}
