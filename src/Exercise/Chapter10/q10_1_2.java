package Exercise.Chapter10;

import Stack.StackIBArray;

/**
 * Explain how to implement two stacks in one array AŒ1 : : n in such a way that
 neither stack overflows unless the total number of elements in both stacks together
 is n. The PUSH and POP operations should run in O.1/ time.
 10.1*/
public class q10_1_2 extends StackIBArray {
    private int point1=stackSize;
    public void push1(int i){
        stack[--point1]=i;
    }
    public int pop1(){
        return stack[point1++];
    }

    public static void main(String[] args) {
        q10_1_2 s=new q10_1_2();
        s.Push(1);
        s.Push(2);
        s.push1(9);
        s.push1(8);
        System.out.println(s.Pop());
        System.out.println(s.Pop());
        System.out.println(s.pop1());
        System.out.println(s.pop1());
    }
}
