package Queue;
/**使用循环数组实现队列*/
public class QueueIBCircleQUeue {
    private static final int QUEUE_SIZE=10;
    private int head;
    private int tail;
    private int[] queue;
    public QueueIBCircleQUeue(){
        this(QUEUE_SIZE);
    }
    public QueueIBCircleQUeue(int size){
//        初始化队列
        queue=new int[size];
        head=tail=0;
    }
    public void enqueue(int i){
        this.queue[tail++]=i;
    }
    public int dequeue(){
        return this.queue[head++];
    }

    public static void main(String[] args) {
        QueueIBCircleQUeue qUeue=new QueueIBCircleQUeue(20);
        qUeue.enqueue(1);
        qUeue.enqueue(2);
        qUeue.enqueue(3);
        System.out.println(qUeue.dequeue());
        System.out.println(qUeue.dequeue());
        System.out.println(qUeue.dequeue());
    }
}
