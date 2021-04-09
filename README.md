### 内容概要：
- 1、完成了线性查找算法
- 2、使用static是为了将方法变成静态方法方便：类名.方法名 直接调用
- 3、使用泛型是为了提高代码的复用性，让算法适应更多的数据类型
### 主要收获：
- 理解了Java为什么会存在装箱数据类型（包装类），它们的存在使
  得Java的八大基本数据类型能够与泛型匹配
— java的八大数据类型中除了char、int外其他首字母大写就是包装类
    * char -> Character
    * int -> Integer
- 循环不变量：循环开启的条件
- 循环体：维持循环不变量
- 复杂度分析：  随着数据规模n的增大,算法性能的变化趋势;通常看最差情况，算法运行的上界。
  ```
    复杂度：O(n)：
         T = c1 * n + c2;做数据做c1次事情 + 循环前后要做一些事情                 
         T1 = 10000n    对数据做1万次操作                   O(n)
  
         T2 = 2n^2      对数据做双重循环的基础上做两次操作     O(n^2)       
  ```