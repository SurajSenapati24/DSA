public class IntersectionOfTwoLists {
    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }
    public static Node solution(Node headA, Node headB) {
        if (headA == null || headB == null) return null;
        Node t1 = headA;
        Node t2 = headB;
        while (t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;
            if (t1 == t2) return t1;
            if (t1 == null) t1 = headB;
            if (t2 == null) t2 = headA;
        }
        return t1;
    }
    public static void main(String[] args) {
        // Create list A: 1 -> 2 \
        //                        6 -> 7
        // Create list B:      4 /
        Node intersect = new Node(6);
        intersect.next = new Node(7);
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = intersect;
        Node headB = new Node(4);
        headB.next = intersect;
        Node intersection = solution(headA, headB);
        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection.");
        }
    }
}
