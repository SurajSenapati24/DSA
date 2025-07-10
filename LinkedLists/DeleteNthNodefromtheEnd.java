public class DeleteNthNodefromtheEnd {
    public static Node optimal(Node head,int n){
        if(head==null || head.next==null) return null;
        Node fast=head;
        Node slow=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        Node del=slow.next;
        slow.next=slow.next.next;
        return head;
        //O(N)
    }
    public static void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node arraytoLL(int arr[]){
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        Node head=arraytoLL(arr);
        traverse(head);
        traverse(optimal(head,3));
    }
}
