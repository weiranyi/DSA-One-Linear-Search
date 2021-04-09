package com.github.weiranyi.LinaerSearch;

/**
 * @author: https://github.com/weiranyi
 * @description 数组生成器
 * @date: 2021/4/9 5:24 下午
 * @Version 1.0
 */
public class ArrayGenerator {
    private ArrayGenerator() {
    }

    public static Integer[] generateOrderedArray(int n) {
        // 开辟用户制定的数组个数
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
}

