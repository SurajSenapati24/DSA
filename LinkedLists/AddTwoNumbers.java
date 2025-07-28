public class AddTwoNumbers {
    public static Node solution(Node num1, Node num2){
        Node dummy=new Node(-1);
        Node curr=dummy;
        int carry=0;
        while(num1!=null || num2!=null || carry==1){
            int sum=0;
            if(num1!=null){
                sum+=num1.data;
                num1=num1.next;
            }
            if(num2!=null){
                sum+=num2.data;
                num2=num2.next;
            }
            sum+=carry;
            carry=sum/10;
            Node newNode=new Node(sum%10);
            curr.next=newNode;
            curr=curr.next;
        }
        return dummy.next;
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
        int num1[]={1,2,3};
        int num2[]={2,3,4};
        Node n1=ArraytoLL(num1);
        Node n2=ArraytoLL(num2);
        Node n3=solution(n1, n2);
        traverse(n3);
    }
}
