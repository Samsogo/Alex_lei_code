import java.io.BufferedInputStream;
import java.util.*;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedInputStream(System.in));


        /**
         * 最长公共子序列的长度
         */
        /*String s1 = scan.next();
        String s2 = scan.next();
        int[][] dp = new int[100][100];
        int len1 = s1.length();
        int len2 = s2.length();
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(a[i-1]==b[j-1])
                    dp[i][j] = dp[i-1][j-1]+1;
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        System.out.println(dp[len1-1][len2-1]);*/


        /**
         * 二分法
         */
        /*int[] a = new int[]{1,3,4,5,6,8,10,122};
        int x = scan.nextInt();
        int start = 0;
        int end = 7;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(a[mid]==x){
                System.out.println(mid);
                break;
            }
            else if(a[mid]>x){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }*/

        String s = scan.next();
        int k = new Main().StringToInt(s);
        System.out.println(k);
    }
    public int StringToInt(String str){
        int ans =0;
        char[] a = str.toCharArray();
        int len = str.length();
        int sum = 0;
        if(a[0]!='-'){
            for(int i=len-1;i>=0;i--){
                sum+=Math.pow(10,ans)*(a[i]-'0');
                ans++;
            }
            return sum;
        }else{
            for(int i=len-1;i>0;i--){
                sum+=Math.pow(10,ans)*(a[i]-'0');
                ans++;
            }
            return -sum;
        }
    }
}

