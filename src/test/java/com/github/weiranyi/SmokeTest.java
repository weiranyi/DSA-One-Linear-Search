package com.github.weiranyi;

import com.github.weiranyi.LinaerSearch.LinearSearch;
import com.github.weiranyi.LinaerSearch.Student;
import org.junit.jupiter.api.Test;

public class SmokeTest {
    @Test
    public void test() {
        // 测试LinearSearch中的线性查找算法
        Integer[] data = {15, 19, 32, 8191};
        int result1 = LinearSearch.search(data, 19);
        System.out.println(result1);
        int result2 = LinearSearch.search(data, 9);
        System.out.println(result2);

        // 学生类的测试用例
        Student[] students = {
                new Student("亦蔚然1"),
                new Student("亦蔚然2"),
                new Student("亦蔚然3")
        };
        Student yiweiranOne = new Student("亦蔚然1");
        int result3 = LinearSearch.search(students, yiweiranOne);
        System.out.println(result3);
    }
}
