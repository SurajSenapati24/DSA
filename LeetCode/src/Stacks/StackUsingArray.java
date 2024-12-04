package Stacks;
import java.util.*;
public class StackUsingArray {
    static Scanner sc=new Scanner(System.in);
    static final int maxsize=5;
    static int s=0;
    static int top=-1;
    static int stack[]=new int[maxsize];
    static void push(){
        if(top==maxsize){
            System.err.println("Stack is Full!!");
            return;
        }
        System.out.println("Enter the value you want to push: ");
        int num=sc.nextInt();
        stack[++top]=num;
        s+=1;
    }
    static void pop(){
        if(top==-1){
            System.out.println("Stack is empty!!");
            return;
        }
        System.out.println("The popped item is: "+stack[top--]);
        s-=1;
    }
    static void display(){
        if(top==-1){
            System.out.println("Stack is empty!!");
        }
        System.out.println("The elements in the Stack: ");
        for(int i=top;i>=0;i--){
            System.out.println("|\t"+stack[i]+"\t|");
        }
        System.out.println("-----------------");
    }
    static void peek(){
        if(top==-1){
            System.out.println("Stack is empty!!");
            return;
        }
        System.out.println("The top of the stack is: "+stack[top]);
    }
    static int size(){
        return s;
    }
    public static void main(String[] args) {
        boolean check=true;
        int choice;
        while (check) {
            System.out.println("\nStack Using Array Implementation: ");
            System.out.println("1.Push\n2.Pop\n3.Display\n4.Peek\n5.Size\n6.Exit\n");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    peek();
                    break;
                case 5:
                    System.out.println("The size of the stack is: "+size());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    check=false;
                    break;
                default:
                    System.out.println("Wrong Choice!!!");
                    break;
            }
        }
    }
}
