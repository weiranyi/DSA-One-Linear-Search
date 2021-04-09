package com.github.weiranyi;

import com.github.weiranyi.LinaerSearch.LinearSearch;
import org.junit.jupiter.api.Test;

public class SmokeTest {
    @Test
    public void test() {
        // 测试LinearSearch中的线性查找算法
        Integer[] data = {15, 19, 32, 8191};
        int res = LinearSearch.search(data, 19);
        System.out.println(res);
        int res2 = LinearSearch.search(data, 9);
        System.out.println(res2);
    }
}
