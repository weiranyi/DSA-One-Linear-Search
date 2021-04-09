package com.github.weiranyi.LinaerSearch;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * @author: https://github.com/weiranyi
 * @description student类
 * @date: 2021/4/9 1:24 下午
 * @Version 1.0
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    //重写equals方法
    @Override
    // 压制hashCode的错
    @SuppressFBWarnings("HE_EQUALS_USE_HASHCODE")
    public boolean equals(Object student) {
        if (student == null) {
            return false;
        }
        // 判断当前类的对象是否就是student类的对象
        if (this == student) {
            // 是同一个对象
            return true;
        }
        // 是否是同一个类
        if (this.getClass() != student.getClass()) {
            return false;
        }
        Student another = (Student) student;
        // 对象的比较变为字符串的对象 .toLowerCase()转小写，可忽略大写
        return this.name.toLowerCase().equals(another.name.toLowerCase());
    }
}
