public class quadrant {
    public static int quadrant(int x, int y){
        if(x == 0 || y == 0){
            return 0;
        }
        else if(y > 0 && x > 0){
            return 1;
        }
        else if(y > 0 && x < 0){
            return 2;
        }
        else if(y < 0 && x < 0){
            return 3;
        }
        else{
            return 4;
        }
    }

    public static void main(String[] args){
        int x;
        int y;
        x = 0; y = 0;
        System.out.println(quadrant(x,y));
        x = 1; y = 1;
        System.out.println(quadrant(x,y));
        x = -1; y = 1;
        System.out.println(quadrant(x,y));
        x = -1; y = -1;
        System.out.println(quadrant(x,y));
        x = 1;y = -1;
        System.out.println(quadrant(x,y));
    }
}
