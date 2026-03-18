public class DogLauncher {

    public static void main(String[] args){
        //因为Dog class不是静态，所以需要实例，反之如果是静态则无需实例也可以
        //后续构造了Dog函数，所以就不需要实例了，这是两种初始化的方式
        Dog smallDog; //声明一个Dog变量
        new Dog(20); //初始化但没有分配给变量，程序结束后将被自动回收
        smallDog = new Dog(5); //初始化并分配给smallDog变量
        Dog hugeDog = new Dog(150);
        smallDog.makeNoise(); //调用makeNoise()方法
        hugeDog.makeNoise();
        //声明变量，实例化，变量赋值
        //例如c语言中: int x; x=20
        System.out.println("------------");
        Dog[] dogs = new Dog[10];
        int x = 0;
        for(int i = 0;i < 10;i++){
            dogs[i] = new Dog(i+x);
            x += 3;
            dogs[i].makeNoise();
        }

        Dog chester = new Dog(17);
        Dog Yusuf = new Dog(150);
        System.out.println("------------");
        Dog heavier = Dog.maxDog(chester, Yusuf);
        heavier.makeNoise();
        System.out.println("------------");
        Dog larger = chester.maxDog(Yusuf);
        larger.makeNoise();
    }
}
