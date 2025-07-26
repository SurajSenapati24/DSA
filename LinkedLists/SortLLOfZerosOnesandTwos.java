public class SortLLOfZerosOnesandTwos {
    public static Node optimal(Node head){
        Node temp=head;
        Node zerohead=new Node(-1);
        Node zero=zerohead;
        Node onehead=new Node(-1);
        Node one=onehead;
        Node twohead=new Node(-1); 
        Node two=twohead;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=temp;
            }
            else if(temp.data==1){
                one.next=temp;
                one=temp;
            }
            else{
                two.next=temp;
                two=temp;
            }
            temp=temp.next;
        }
        zero.next=(onehead.next!=null)?onehead.next:twohead.next;
        one.next=twohead.next;
        two.next=null;
        return zerohead.next;
    }
    public static Node brute(Node head){
        if(head==null || head.next==null) return head;
        Node temp=head;
        int c0=0;
        int c1=0;
        int c2=0;
        while(temp!=null){
            if(temp.data==0) c0++;
            else if(temp.data==1) c1++;
            else c2++;
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(c0!=0){
                temp.data=0;
                c0--;
            } 
            else if(c1!=0){
                temp.data=1;
                c1--;
            } 
            else{
                temp.data=2;
                c2--;
            }
            temp=temp.next;
        }
        return head;
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
        int arr[]={1,0,2,1,2,1,0};
        Node head=ArraytoLL(arr);
        traverse(head);
        head=optimal(head);
        traverse(head);
   } 
}
