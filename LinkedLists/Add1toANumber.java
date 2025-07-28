public class Add1toANumber {
    public static Node solution(Node head){
        int carry=helper(head);
        if(carry==1){
            Node newnode=new Node(carry);
            newnode.next=head;
            return newnode;
        }
        return head;
    }
    public static int helper(Node temp){
        if(temp==null) return 1;
        int carry=helper(temp.next);
        temp.data=temp.data+carry;
        if(temp.data<10) return 0;
        temp.data=0;
        return 1;
    }
    public static void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node ArraytoLL(int arr[]){
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        Node head=ArraytoLL(arr);
        Node newNode=solution(head);
        traverse(newNode);
    }
}
