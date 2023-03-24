package Unit10.Examples;

public class RecursionCallStack {
    public static void main(String[] args) {
        System.out.println(tryMe(25,13));
    }
    public static int tryMe(int x, int y){
        if (x % y == 0){
            return y;
        }
        else{
            return tryMe(y, x % y);
        }
    }
}
