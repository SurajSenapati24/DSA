import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueue {
    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2=new LinkedList<>();
    public static void push(int val){
        while(q1.size()!=0){
            q2.offer(q1.poll());
        }
        q1.offer(val);
        while(q2.size()!=0){
            q1.offer(q2.poll());
        }
    }
    public static void pop(){
        if(q1.size()==0){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(q1.poll());
        }
    }
    public static void peek(){
        if(q1.size()==0){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(q1.peek());
        }
    }
    public static void size(){
        System.out.println(q1.size());
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        peek();
        pop();
        size();
    }
}
