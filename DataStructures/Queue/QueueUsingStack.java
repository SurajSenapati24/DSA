import java.util.*;
import java.util.Stack;
public class QueueUsingStack {
    static Stack<Integer> s1=new Stack();
    static Stack<Integer> s2=new Stack();
    public static void offer(int val){
        while(s1.size()!=0){
            s2.push(s1.pop());
        }
        s1.push(val);
        while(s2.size()!=0){
            s1.push(s2.pop());
        }
    }
    public static void pop(){
        if(s1.size()==0){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(s1.pop());
        }
    }
    public static void peek(){
        if(s1.size()==0){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(s1.peek());
        }
    }
    public static void size(){
        System.out.println(s1.size());
    }
    
    public static void main(String[] args) {
        offer(1);
        offer(2);
        offer(3);
        size();
        peek();
        pop();
        pop();
        size();
    }
}
