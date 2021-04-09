package com.github.weiranyi;

import com.github.weiranyi.LinaerSearch.ArrayGenerator;
import com.github.weiranyi.LinaerSearch.LinearSearch;
import com.github.weiranyi.LinaerSearch.Student;
import org.junit.jupiter.api.Test;

public class SmokeTest {
    @Test
    public void test() {
        /**
         * 1、测试：通过数组测试
         */
        // 设置问题规模
        int[] dataSize = {1000, 1000_000};
        for (int n:dataSize) {
            // 测试LinearSearch中的线性查找算法
            Integer[] data = ArrayGenerator.generateOrderedArray(n);
            long startTime = System.nanoTime();
            // 通过循环进行多次查找会让性能稳定
            for (int k = 0; k < 100; k++) {
                LinearSearch.search(data,n);
            }
            long endTime = System.nanoTime();
            double time = (endTime - startTime) / 1000000000.0;
            System.out.println("对于"+n+"个数据"+"，运行100次，耗时："+time + "s" +";");
        }
        /**
         * 2、测试：通过自定义类测试
         */
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
