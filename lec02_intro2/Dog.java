public class Dog {

    public int weightInPounds;
    //实例变量 instance variable

    public Dog(int w){
        weightInPounds = w;
    }
    //构造函数

    public void makeNoise(){
    //此处不是静态static
    //静态方法是通用的，适用于class的所有实例，对应的调用就是<class name>.<invocation method>(<parameter>);
    //非静态方法是特定的 specific，只针对一个实例，对应的调用就是
    // <class name> <variable name> = new <class name>(<parameter>);
    // <variable name>.<invocation method>(<parameter>);
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
    //static定义了类属性，非static定义了实例属性
    //Q：maxDog被定义了两次，编译器是如何处理的？
    //A：这称为重载(overloaded，我更喜欢过载这个翻译)了这个方法，编译器会看参数数量来确定调用哪个方法
}
