package HelloWorld;

import java.util.Scanner;

/**
 * Test for git used for IntelliJ IDEA
 * Created by lutingshu on 2015/11/24.
 * Java test for github
 */
public class HelloWorld {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("请输入圆的半径");
        double r = input.nextDouble();

        double ear = Math.PI * r * r;
        System.out.println("半径为："+r+"的圆的面积为："+ear);

    }
}
