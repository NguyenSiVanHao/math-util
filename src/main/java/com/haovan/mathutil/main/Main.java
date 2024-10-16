package com.haovan.mathutil.main;

import static com.haovan.mathutil.core.MathUtility.*;
import com.haovan.mathutil.core.MathUtility;
import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        testFactorialGivenRightArgumentMinus5ThrowsException();
    }

        //v lý thuết ta phải test với data n = 2, 3, ... ,20
        //Test case #3: Tự viết nốt mô tả
    static void testFactorialGivenRightArgument5RunsWell() {
        System.out.println("5! expected = 120"
                + "\nactual:" + getFactorial(5));
    }

        //Test case #4:
        //Description: test factorial with invalid argument, e.g n = -5
        //Steps:
        //              Call getFactorial(-5)
        //Expected result:
        //              an exception is thrown - kì vọng 1 ngoại lệ xh

        //diễn giải thêm: hàm của ta thiết kế rằng nếu đưa n âm -> hàm sẽ chửi
        //vậy neeus ta test n âm, ta sẽ nhận về chửi -> hàm ta chạy đúng như thiết ke
        //thấy ngoại lệ mừng rơi nc mắt

    static void testFactorialGivenRightArgumentMinus5ThrowsException() {
        getFactorial(-5);
    }


        //Test case #2:
        //Description: Check getFactorial() method with valid argument( n = 1 )

        //Steps/Procedures: (Cách test, các bước verify hàm, chức năng)
        //              Call function/ method with n = 1 getFactorial(1)

        //Expected Result: (hy vọng gọi 1! giá trị trả về là may
        //              To have 1 as the result of 1!

        //Status (passed/failed-bug): mình phải run hàm và nhìn giá tri trả
        //                              về mới biết hàm chạy đúng hay sai
        // Passed

        //Chạy test case/ làm các bước ở trên để xác định dc hàm đúng sai
        //=> gọi là test run
    static void testFactorialGivenRightArgument1RunsWell(){
        int n = 1; // data đưa vào
        long expectedValue = 1; //hy vọng 1! = 1
        long actualValue = MathUtility.getFactorial(n);
        //So sánh bằng mắt để kết luaanj kết quá đúng sai
        System.out.println("1! expected:" + expectedValue
        + "\nactual:" + actualValue);
        }

        //Các test case để dưới đây, lát hồi run trong main()
    static void testFactorialGivenRightArgument0RunsWell(){
        //Test case #1:
        //Description: Check getFactorial() function with valid argument (n = 0)
        //Steps:
        //      Call function/method with n = 0 getFactorial(0)
        //Expected result:
        //      Get 1 as the result of 0!
        //Actual result/Status (passed, failed) (waiting for test run)
        //

        //TEST RUN: RUN CÁI TEST CASE
        long expectedResult = 1;
//        long actualResult = MathUtility.getFactorial(0); //n: named-argument
        long actualResult = getFactorial(0);
        System.out.println("expected: " + expectedResult + ", actual: " + actualResult);
    }
}