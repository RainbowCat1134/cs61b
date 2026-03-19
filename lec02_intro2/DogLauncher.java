public class DogLauncher {

    public static void main(String[] args){
        // Dog 类是非静态类，因此需要实例化才能使用其成员（方法和属性）。如果类是静态的，
        // 那么可以直接通过类名调用静态方法，无需实例化类。
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
        Dog heavier = Dog.maxDog(chester, Yusuf); // 调用静态方法 maxDog，比较 chester 和 Yusuf 的体重并返回较重的 Dog 对象
        heavier.makeNoise();
        System.out.println("------------");
        Dog larger = chester.maxDog(Yusuf); // 调用实例方法 maxDog，通过 chester 对象来比较 chester 和 Yusuf 的体重，返回较重的 Dog 对象
        larger.makeNoise();
    }
    
}
