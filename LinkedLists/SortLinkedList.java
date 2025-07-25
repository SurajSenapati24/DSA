public class SortLinkedList {
    public static Node findMiddle(Node head){
        Node slow=head;
        Node fast=head.next;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node sortLL(Node head){
        if(head==null || head.next==null) return head;
        Node middle=findMiddle(head);
        Node right=middle.next;
        middle.next=null;
        Node left=head;
        left=sortLL(left);
        right=sortLL(right);
        return mergeTwoLists(left, right);
    }
    public static Node mergeTwoLists(Node list1, Node list2){
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(list1!=null && list2!=null){
            if(list1.data < list2.data){
                temp.next=list1;
                list1=list1.next;
            }else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1!=null){
            temp.next=list1;
        }else{
            temp.next=list2;
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
        int arr[]={11,2,3,4,7,1};
        Node head=ArraytoLL(arr);
        traverse(head);
        head=sortLL(head);
        traverse(head);
    }
}
