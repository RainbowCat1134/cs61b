import java.util.ArrayList;
import java.util.List;

public class JavaExercises {
    /*
    JavaExercises.java has 4 different methods for you to complete:

    makeDice: This method takes returns a new array of integers [1, 2, 3, 4, 5, 6].

    takeOrder: This method takes in a String and returns a new array containing the orders of the customer.
    If the customer is Ergun, you should return an array of Strings ["beyti", "pizza", "hamburger", "tea"] in that order.
    If the customer is Erik, you should return an array of Strings ["sushi", "pasta", "avocado", "coffee"].
    In any other case, return an empty String array of size 3.
    NOTE: == behaves strangely with Strings for reasons we’ll see later in the course.
    You should check strings s1 and s2 for equality using s1.equals(s2) in Java.

    findMinMax: This method takes an int[] array and returns the the positive difference between the maximum element
    and minimum element of the given array. You may assume the input array is nonempty.

    hailstone: This method takes an int n as input and returns its hailstone sequence as a list of integers.
    The hailstone sequence is defined by the following procedure: pick a positive integer n as the start.
    If n is even, divide n by 2. If n is odd, multiply n by 3 and add 1. Continue this process until n is 1.
    You should compute this using recursion with the provided helper method hailstoneHelper.
    For this part, you can import List and ArrayList.
    */

    public static int[] makeDice(){
        int[] makeDice = {1, 2, 3, 4, 5, 6};
        return makeDice;
    }

    public static String[] takeOrder(String s){
        if(s.equals("Ergun")){
            return new String[]{"beyti", "pizza", "hamburger", "tea"};
        }
        else if(s.equals("Erik")){
            return new String[]{"sushi", "pasta", "avocado", "coffee"};
        }
        else{
            return new String[3];
        }
    }

    public static int findMinMax(int[] num){
        if(num.length == 1){
            return 0;
        }
        else{
            int max = num[0];
            int min = num[0];
            int difference = 0;
            for(int i = 1;i < num.length;++i){
                if(num[i] > max){
                    max = num[i];
                }
                if(num[i] < min){
                    min = num[i];
                }
            }
            difference = max - min;
            return difference;
        }
    }

    public static List<Integer> hailstone(int n){
        List<Integer> lst = new ArrayList<>();
        hailstoneHelper(n, lst);
        return lst;
    }

    public static void hailstoneHelper(int n, List<Integer> lst){
        lst.add(n);
        if(n == 1){
            return;
        }
        else if(n % 2 ==0){
            hailstoneHelper(n / 2, lst);
        }
        else{
            hailstoneHelper(n * 3 + 1, lst);
        }
    }

    public static void main(String[] args){
        System.out.println(hailstone(403));
    }
}
