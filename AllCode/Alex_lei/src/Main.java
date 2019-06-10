import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Main{
    static  int[] a = new int[10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            a[i] = sc.nextInt();
        }
        quciksort(0,a.length-1);
        System.out.println(Arrays.toString(a));

    }
    public static void quciksort(int left,int right){
        int i=left,j=right;
        if(left>right)
            return;
        int temp = a[left];
        System.out.println("key:"+temp);
        while(i!=j){
            while(a[j]>=temp&&i<j){
                j--;
            }
            while(a[i]<=temp&&i<j){
                i++;
            }
            if(i<j){
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
            System.out.println(Arrays.toString(a));
        }
        a[left] = a[i];
        a[i] = temp;
        System.out.println("i:"+i);
        System.out.println("j:"+j);
        System.out.println(Arrays.toString(a));
        quciksort(left,i-1);
        quciksort(i+1, right);
    }
}