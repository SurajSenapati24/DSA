class Node {
   int val;
   Node next;

   public Node(int var1) {
      this.val = var1;
   }

   public Node(int var1, Node var2) {
      this.val = var1;
      this.next = var2;
   }
}

public class QueueUsingLL {
    static Node start=null;
    static Node end=null;
    static int size=0;
    public static void offer(int val){
        if(start==null && end==null){
            start=new Node(val);
            end=start;
        }
        else{
            Node temp=new Node(val);
            temp.next=start;
            start=temp;
        }
        size++;
    }
    public static void pop(){
        if(start==null && end==null){
            System.out.println("Stack is empty");
        }
        else if(size==1){
            System.out.println("Popped "+start.val);
            start=null;
            end=null;
            size=0;
        }
        else{
            System.out.println("Popped: "+start.val);
            start=start.next;
            size--;
        }    
    }
    public static void peek(){
        if(size==0){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top: "+start.val);
        }
    }
    public static void printLL(){
        if(size==0){
            System.out.println("Stack is Empty");
        }
        else{
            Node temp=start;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
        }
    }
    public static void size(){
        System.out.println(size);
    }
    public static void main(String[] args) {
        offer(1);
        offer(2);
        offer(3);
        printLL();
        peek();
        pop();
        size();
    }
}
