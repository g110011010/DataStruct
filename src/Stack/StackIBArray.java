package Stack;
/**
 * 利用数组实现栈
 * 后期考虑加入泛型*/
public class StackIBArray {

    private static final int defaultSize=10;
    protected int stackSize;
    protected int[] stack;
    private int point=-1;
    public StackIBArray(int size){
        this.stackSize=size;
        stack=new int[stackSize];
    }
    public StackIBArray(){
        this(defaultSize);
    }
    public void Push(int i){
        this.stack[++point]=i;
    }
    public int Pop(){
        return this.stack[point--];
    }
    public boolean isEmpty(){
        return point<0;
    }

    public static void main(String[] args) {
        StackIBArray s=new StackIBArray();
        s.Push(2);
        s.Push(3);
        System.out.println(s.Pop());
        System.out.println(s.isEmpty());
        System.out.println(s.Pop());
        System.out.println(s.isEmpty());
    }

}
