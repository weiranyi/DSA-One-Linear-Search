package com.github.weiranyi.LinaerSearch;

/**
 * @author: https://github.com/weiranyi
 * @description - 内容：线性查找算法
 * - 输入：数组和目标元素
 * - 输出：目标元素和索引；若不存在返回-1
 * @date: 2021/4/9 1:12 下午
 * @Version 1.0
 */


public class LinearSearch {
    //将对象私有化，不让外界生成对象
    private LinearSearch() {
    }

    /**
     * - 使用static关键字的原因是因为，将这段代码变成工具类代码，
     * 不需要创建对象，使该方法可以直接被使用。
     * - 使用泛型的原因是因为，提高代码的复用。但是泛型只能接受类
     * 对象，基本数据类型要用装箱数据类型
     *
     * @param data
     * @param target
     * @param <E>
     * @return 找得到就返回元素对应的索引数值，如果没有找到对应的元素就返回-1
     */
    public static <E> int search(E[] data, E target) {
        /**
         * 循环不变量：【data[0...i)中没有找到目标】
         *     data[i]是目标，data[0...i-1]中没有找到目标/data[0...i)中没有找到目标
         *     data[i]不是目标，data[0...i]中没有找到目标；
         *     循环体：【维持循环不变量】，"证明"：算法的正确性
         * 函数：定义清楚函数的功能，函数的输入/输出是什么
         */
        for (int i = 0; i < data.length; i++) {
            // equals是Java世界的第一大约定
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
