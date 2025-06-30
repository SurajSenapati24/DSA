class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class DeleteNodeInALL {
    public static void deleteNode(ListNode node){
        node.val=node.next.val;
        node.next=node.next.next;
    }
    public static void print(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode one=new ListNode(2);
        head.next=one;
        ListNode two=new ListNode(3);
        one.next=two;
        ListNode three=new ListNode(4);
        two.next=three;
        ListNode four=new ListNode(5);
        three.next=four;
        print(head);
        deleteNode(three);
        print(head);
    }
}
