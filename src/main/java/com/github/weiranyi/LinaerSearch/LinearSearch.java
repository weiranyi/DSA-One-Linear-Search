package com.github.weiranyi.LinaerSearch;

/**
 * 内容：线性查找算法
 * 输入：数组和目标元素
 * 输出：目标元素和索引；若不存在返回-1
 */

public class LinearSearch {
    //将对象私有化，不让外界生成对象
    private LinearSearch() {
    }

    /**
     * - 使用static关键字的原因是因为，将这段代码变成工具类代码，
     *   不需要创建对象，使该方法可以直接被使用。
     * - 使用泛型的原因是因为，提高代码的复用。但是泛型只能接受类
     *   对象，基本数据类型要用装箱数据类型
     * - 包装类：
     *   java的八大数据类型中除了char、int外其他首字母大写就是包装类
     *   char -> Character
     *   int -> Integer
     *
     * @param data
     * @param target
     * @param <E>
     * @return 找得到就返回元素对应的索引数值，如果没有找到对应的元素就返回-1
     */
    public static <E> int search(E[] data, E target) {

        for (int i = 0; i < data.length; i++) {
            // equals是Java世界的第一大约定
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
