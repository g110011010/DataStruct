package Exercise.Chapter10;
/**
 * 算法导论上面的问题*/
import Stack.StackIBArray;

public class q10_1_1 {
    public static void main(String[] args) {
        StackIBArray s=new StackIBArray(6);
        s.Push(4);
        s.Push(1);
        s.Push(3);
        System.out.println(s.Pop());
        s.Push(8);
        System.out.println(s.Pop());
    }
}
