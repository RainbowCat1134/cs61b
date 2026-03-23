import java.util.*;

public class IntList {

    public int first;
    public IntList rest;

    public static double average(double a, double b){
        return (a + b) / 2;
    }

    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }

    /* 用递归返回数组大小 */
    public int size(){
        if(rest == null){
            return 1;
        }
        return 1 + rest.size();
    }

    /* 不用递归返回数组大小 */
    public int iterativeSize(){
        int totalSize = 0;
        IntList p = this;
        while(p != null){
            totalSize++;
            p = p.rest;
        }
        return totalSize;
    }

    /* 返回第i项 */
    public int get(int i){
        if(i == 0){
            return first;
        }
        return rest.get(i - 1);
    }

    public static void main(String[] args){

        // Java中有八种基本类型(Primitive Type)：byte, short, int, long, float, double, boolean, char
        // 除这八种基本类型以外称为引用类型(Reference Type)，例如创建了新的Dog, Apple类型

        /*
            类初始化

            当我们初始化对象时，编译器首先为对象的每个实例变量分配内存并赋默认值（通常是0，null）
            然后构造函数为每个变量赋值

            在例如存在Dog class的情况下，通常创建实例变量代码为：
            Dog d1 = new Dog(<参数>)，
            这个实例变量实际上是一个指向分配好内存，完成初始化内存的指针（对任何类型的对象都是8 Byte大小）
            new会返回地址，“=”等号则会将地址赋值给d1

            而声明基本类型变量时，则会直接将值赋值给开辟的内存空间，而非使用指针
        */

        double x = 5.5;
        double y = 10.5;
        double avg = average(x, y);
        System.out.println(avg);

        /*
            average()方法调用流程：
            首先声明两个新的double类型变量，然后将x和y的值赋给a和b，在方法内部进行运算后，再将结果返回
            也就是所谓的传值调用
        */

        /*
            数组的声明和初始化
            首先，数组是对象，所以需要用new关键字实例化(instantiated)
            有了之前的说明，这样就能更清楚地理解为什么可以用指针访问数组成员了

            Q：如果数组存放的是字符串，实际上数组存放的是什么？
            A：由于字符串类型String不是基本类型，所以数组内存放的是字符串的地址

        */

        /*
            IntList L = new IntList();
            L.first = 5;
            L.rest = null;

            L.rest = new IntList();
            L.rest.first = 10;
            L.rest.rest = null;

            L.rest.rest = new IntList();
            L.rest.rest.first = 15;
            L.rest.rest.rest = null;
        */

        //如果这样创建链表极其麻烦，所以构造函数IntList()

        IntList L1 = new IntList(15,null);
        L1 = new IntList(10, L1);
        L1 = new IntList(5, L1);
        // 这段代码实现了反向构建链表，实际上是L->5,rest->10,rest->15,rest=null


    }
}
