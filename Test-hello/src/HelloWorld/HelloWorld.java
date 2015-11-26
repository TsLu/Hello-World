package HelloWorld;

import java.util.Scanner;

/**
 * Test for git used for IntelliJ IDEA
 * Created by lutingshu on 2015/11/24.
 * Java test for github
 */
public class HelloWorld {

    /*public  static void  change(A a){
        a = new A();
        a.age = 30;
    }
    //main method
    public static void main(String[] args){

        A test1 = new A();
        test1.age = 10;

        System.out.println("Before change, the age is " +  test1.age);

        change(test1);
        System.out.println("Afther change, the age is " +  test1.age);
    }

    static class  A{
        public int age;
    }*/

    public  static void  change(String src){
        src = "Hello";
    }
    //main method
    public static void main(String[] args){

        String test = "Good!";

        System.out.println("Before change, the message is " +  test);

        change(test);
        System.out.println("Afther change, the message is " +  test);
    }
}
