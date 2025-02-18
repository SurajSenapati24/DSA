package DataStructures.Stack;
import java.util.*;

class Stack{
    static final int MAX=1000;
    int top;
    static Scanner sc=new Scanner(System.in);
    int a[]=new int[MAX];
    Stack(){
        top=-1;
    }
    void isEmpty(){
        if(underflow()){
            System.out.println("Underflow( Stack is Empty )");
        }
        else{
            System.out.println("No the stack is not empty");
        }
    }
    void isFull(){
        if(overflow()){
            System.out.println("Overflow( Stack is full )");
        }
        else{
            System.out.println("The stack is not full");
        }
    }
    boolean overflow(){
        if(top>=(MAX-1)){
            return true;
        }
        return false;
    }
    boolean underflow(){
        if(top<0){
            return true;
        }
        return false;
    }
    void push(){
        int element;
        if(overflow()){
            System.out.println("The stack is full.");
        }
        System.out.println("Enter the element to push into the stack: ");
        element=sc.nextInt();
        a[++top]=element;
        System.out.println(element+ " inserted successfully in the stack.");
    }
    int peek(){
        if(underflow()){
            return -1;
        }
        else{
            return a[top];
        }
    }
    void pop(){
        if(underflow()){
            System.out.println("No element to pop.");
        }
        else{
            int element=a[top--];
            System.out.println(element+" is popped from the stack.");
        }
    }
    void showElements(){
        System.out.println("|             |");
        if(!underflow()){
            for(int i=top;i>=0;i--){
                System.out.println("|      "+a[i]+"      |");
            }
        }
        System.out.println("---------------");
        
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        int ch;
        do{
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Is full\n5.Is empty\n6.Show elements\n7.Exit");
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.isFull();
                    break;
                case 5:
                    s.isEmpty();
                    break;
                case 6:
                    s.showElements();
                case 7: break;
                default:
                    continue;
            }
        }while (ch!=7);
    }
}
