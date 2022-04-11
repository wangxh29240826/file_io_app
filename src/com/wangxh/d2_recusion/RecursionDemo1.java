package com.wangxh.d2_recusion;


/**
 * 递归算法的三要素大体可以总结为
 * 1.递归的方式:f(n) = f(n-1) * n
 * 递归的终结点:f(n) =  1
 * 递归的方向必须走向终结点
 */
public class RecursionDemo1 {

    public static void main(String[] args) {
/**
 *猴子吃桃问题
 * 公式（合理的） ：
 * f(x) - f(x)/2 -1  = f(x+1)
 * 2f(x) - f(x) -2 = f(x+1)
 * f(x) = 2f(x+1) + 2
 *终结点 f(10) = 1
 *
 */

        System.out.println(f(1));


    }
    public static int f(int n){
        if(n ==10){
            return 1;
        }else{
         return 2*f(n+1)+2;
        }
    }
}
