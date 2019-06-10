import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class quicksort {

    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            a[i] = sc.nextInt();
        }
        qs(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void qs(int[] arr,int left,int right){
        int i = left,j = right;
        if(left>right)
            return;
        int key = arr[left];

        while(i!=j){
            while(arr[j]>=key&&i<j){
                j--;
            }
            while(arr[i]<=key&&i<j){
                i++;
            }
            if(i<j){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[left] = arr[i];
        arr[i] = key;
        qs(arr,left,i-1);
        qs(arr,i+1,right);
    }
}
