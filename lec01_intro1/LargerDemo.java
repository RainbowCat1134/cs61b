public class LargerDemo {
    public static int larger(int x, int y){
        if(x > y){
            return x;
        }
        else{
            return y;
        }
    }

    public static void main(String[] args){
        int x,y;
        System.out.println(larger(5,20));

    }
}
