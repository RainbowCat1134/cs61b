public class Dog {

    public int weightInPounds;
    //实例变量 instance variable

    public Dog(int w){
        weightInPounds = w;
    }
    //构造函数

    public void makeNoise(){
    // 非静态方法依赖于类的实例，需要通过对象来调用。
    // 静态方法与类本身相关，可以直接通过类名调用，而不依赖于实例。
        if(weightInPounds < 10){
            System.out.println("yipyipyip");
        }
        else if(weightInPounds < 30){
            System.out.println("bark!");
        }
        else{
            System.out.println("arooooooo!");
        }
    }

    //在同一个class中可以同时存在静态和非静态的方法
    public static Dog maxDog(Dog d1, Dog d2){
        if(d1.weightInPounds > d2.weightInPounds){
            return d1;
        }else{
            return d2;
        }
    }

    //也可以写成非静态的
    public Dog maxDog(Dog d2){
        if(weightInPounds > d2.weightInPounds){
            return this;
        }
        else{
            return d2;
        }
    }
    // 静态方法和变量属于类，非静态方法和变量属于实例。
    // Q：maxDog被定义了两次，编译器是如何处理的？
    // A：这是方法重载（Overloading），根据方法的参数数量和类型，编译器会选择适当的版本来调用。
}
