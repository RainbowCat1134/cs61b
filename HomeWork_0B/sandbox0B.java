import java.util.*;

public class sandbox0B {

    public static class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point() {
            this(0, 0);
        }

        public double distanceTo(Point other) {
            return Math.sqrt(
                    Math.pow(this.x - other.y, 2) +
                            Math.pow(this.y - other.y, 2)
            );
        }

        public void translate(int dx, int dy) {
            this.x += dx;
            this.y += dy;
        }
    }

    public static void main(String[] args){
        //Java中有两种类型，基本类型primitive type和引用类型reference type
        //基本类型是小写的，引用类型首字母是大写的
        //Java中有null，如果访问值为null实例成员，则会出现nullpointerexception

        //Java中的数组是固定大小的，没有.append()和.remove()

        int[] zeroedArray = new int[3];
        int[] array = {4,7,10};
        array[0] = 5;
        System.out.println(array[0]);
        System.out.println(Arrays.toString(array));

        int[] array1 = {1,2,3};
        for(int i : array1){
            System.out.println(i);
        }

        //List是可重置大小的
        List<String> lst = new ArrayList<>();
        lst.add("zero");
        lst.add("one");
        lst.set(0,"zed");
        System.out.println(lst.get(0));
        System.out.println(lst.size());
        if(lst.contains("one")){
            System.out.println("one in lst");
        }
        for(String elem : lst){
            System.out.println(elem);
        }

        //有两种set，Treeset和Hashset
        //Treeset有序，Hashset更快但无序
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.remove(2);
        System.out.println(set.size());
        if(set.contains(1)){
            System.out.println("1 in set");
        }
        for(int elem:set){
            System.out.println(elem);
        }

        //有两种set，TreeMap和HashMap
        //TreeMap有序，HashMap更快但无序

        Map<String,String> map = new HashMap<>();
        //Map<<key type>,<value type>>
        map.put("hello","hi");
        map.put("hello","goodbye");
        //"goodbye"将覆盖"hi"
        System.out.println(map.get("hello"));
        System.out.println(map.size());
        if(map.containsKey("hello")){
            System.out.println("\"hello\" in map");
        }
        for(String key : map.keySet()){
            System.out.println(key);
        }

        Point p1 = new Point(5, 9);
        Point p2 = new Point(-3, 3);
        System.out.println("Point 1: (" + p1.x
                + ", " + p1.y + ")");
        System.out.println("Distance: "
                + p1.distanceTo(p2));
        p1.translate(2, 2);
        System.out.println("Point 1: (" + p1.x
                + ", " + p1.y + ")");


    }
}
