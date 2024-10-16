package com.haovan.mathutil.core.test.test;

import static com.haovan.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {
    //Test Case #3 : Check getFactorial() with n = -5...  to see the Exception
    // Tôi muốn thấy có ngoại lệ xuất hiện trong tình huống n âm hoặc n > 20
    // ngoại lệ có xh như dự kiến hay ko .... nếu có thì phải là màu xanh !!!!
    //NGHE KĨ :CÓ NGOẠI LỆ , NHƯNG LÀ MÀU XANH , V NGOẠI LỆ XH NHƯ DỰ KIẾN
    @Test
    void testFactorialGivenWrongArgumentThrowsException() {
        //  getFactorial(-5);
        assertThrows(IllegalArgumentException.class,() -> {getFactorial(-5);});
        assertThrows(IllegalArgumentException.class,() -> {getFactorial(    22);});
    }
    //Test Case #2 : Check getFactorial() with n = 5 to see result of 120

    @Test
    void testFatorialGivenRightArgument5RunWell() {
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
    }






    // Cấu trúc test case: ID, Description, Steps/Procedures, Expected Result,
    //  Actual Result, Status : Passed, Failed
    //  Test Date, Bug # (Bug id) Bugzilla (Bug DB) Jira
    //  Test case #1: Check getFatorial() with n = 0 to see result of 1
    //
    @Test
    void testFatorialGivenRightArgument0RunWell() {
        long expectedValue = 1;
        long actualValue = getFactorial(0);
        // so sanh
        // truyền thống ta sout() in kết quả và nhìn = mắt để đoán đúng sai
        //hiện đại: xài thềm tool, thư viện, unit testing frameword JUnit
        //giúp đôi mắt ta nhìn kết quả đúng sai qua 2 màu xanh và đỏ
        //não và mắt ko cần nhìn, đoán và kết luận như truyền thống
        //mà nay thấy đỏ => tạch, xanh => ổn
        assertEquals(expectedValue, actualValue);
        //              giống màu xanh, lệch nhau màu đỏ hàm chạy ko ra kq như mong đợi
    }
}

        // Quy tắc xanh đỏ của UNIT TEST TOOL/FRAMEWORK
        // Nếu tt cả các TEST CASE PASSED ( EXPECTED == ACTUAL ) => màu xanh
        // Chỉ cần 1 trong những test case failed ( EXPECTED != ACTUAL ) => màu đỏ
        // Lý do: hàm đã đúng thì phải đúng ết với các test case dadđưa ra
        // Mắt chỉ nhìn 2 tín hiệu - xanh, đỏ, theo style gộp kết quả
        // Xanh: đúng hết, Đỏ: 1 thằng nào chết -> bo hàm, fix lại

        // Kĩ thuật viết code chính (hàm trong api, core...)
        // Mà đi kèm Code Test hàm lun, dùng 2 trạng thi xanh đỏ, cứ liên tục code
//XONG CHẠY XANH ĐỎ , SỮA ,CHẠY LẠI XANH ĐỎ , TỐI ƯU CHỈNH CODE , CHẠY LẠI XANH
//ĐỎ ,XANH ĐỎ LIÊN TỤC TRONG QUÁ TRÌNH VIẾT CODE ĐC GỌI LÀ TDD
//TEST DRIVEN DEVELOPMENT  - VIẾT CODE SONG HÀNH CÙNG CODE TEST