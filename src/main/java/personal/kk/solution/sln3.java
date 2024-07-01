package personal.kk.solution;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 两数之和绝对值最小：给定一个从小到大的有序整数序列（存在正整数和负整数）数组nums ，请你在该数组中找出两个数，其和的绝对值(|nums[x]+nums[y]|)为最小值，并返回这个绝对值。
 * 每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * @date 2024-6-26 09:38:46
 */
public class sln3 {
    @Test
    public static void main(String[] args) {
        //读取整数数组
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        //初始化左右指针
        int left = 0,right = nums.length -1 ;

        //初始化最小绝对值和对应的指针位置
        int min = Integer.MAX_VALUE;
        int minLeft = left;
        int minRight = right;

        //遍历数组，直到左指针大于或等于右指针
        while(left < right){
            //计算两个指针指向的元素之和
            int sum = nums[left] + nums[right];
            //计算绝对值
            int absSum = Math.abs(sum);
            if(absSum < min){
                min = absSum;
                minLeft = left;
                minRight = right;
            }
            //根据两数之和，移动指针
            if(sum < 0){
                left++;
            }
            else{
                right--;
            }
            //输出最小绝对值和对应的两个元素

        }
        System.out.println(nums[minLeft] + " " + nums[minRight] + " " + min);
    }
}
