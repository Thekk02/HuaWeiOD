package personal.kk.solution;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kk
 * @description 密钥格式化：给定一个非空字符串 S，其被 N 个’-‘分隔成 N+1 的子串，给定正整数K，要求除第一个子串外，其余的串每 K
 * 个用’-‘分隔，并将小写字母转换为大写。
 * @date 2024-6-26 09:25:59
 */

public class sln1 {
    @Test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        ArrayList<String> arr = new ArrayList<String>();
        String temp = "";
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '-'){
                arr.add(temp);
                temp = "";
            }else{
                temp += s.charAt(i);
            }
        }
        arr.add(temp);
        ArrayList<String> ans = new ArrayList<String>();
        ans.add(arr.get(0));

        String tmp = "";
        for(int i = 0;i < arr.size() -1 ; i++){
            tmp += arr.get(i+1);
        }
        for(int i = 0;i < tmp.length();i++){
            String v = String.valueOf(tmp.charAt(i)).toUpperCase();
            if(i % k == 0){
                v = "-" + v;
            }
            ans.add(v);
        }
        for(int i = 0;i < ans.size();i++){
            System.out.print(ans.get(i));
        }
        System.out.println();
    }
}
