/*
 * 百钱买百鸡
 * 5文钱可以买一只公鸡，3文钱可以买1只母鸡，1文钱可以买3只雏鸡
 * 现在用100文钱买100只鸡，那么公鸡、母鸡、雏鸡各有多少只？
 */

package chapter04;

public class exercise8 {
    public static void main(String[] args) {
        //利用for循环，遍历每种鸡数可能的组合
        //1.如果钱不用花完
        for (int i = 0; i <= 20; i++) {//假设全买公鸡，最多能买20只
            for (int j = 0; j <= 33; j++) {//假设全买母鸡，最多能买33只
                for (int k = 3; k <= 99; k+=3) {//假设全买雏鸡，最多能买99只
                    if (5 * i + 3 * j + (1 / 3) * k <= 100 && i + j + k == 100) {
                        System.out.println("公鸡：" + i + "只 " + "母鸡："
                                + j + "只 " + "雏鸡：" + k + "只");
                    }
                }
            }
        }
        System.out.println("===================");
        //2.如果钱花完
        for (int i = 0; i <= 20; i++) {//假设全买公鸡，最多能买20只
            for (int j = 0; j <= 33; j++) {//假设全买母鸡，最多能买33只
                for (int k = 3; k <= 99; k+=3) {//假设全买雏鸡，最多能买99只
                    if ((5 * i + 3 * j + (k / 3)) == 100 && (i + j + k) == 100) {//如果钱花完
                        System.out.println("公鸡：" + i + "只 " + "母鸡："
                                + j + "只 " + "雏鸡：" + k + "只");
                    }
                }
            }
        }
    }
}