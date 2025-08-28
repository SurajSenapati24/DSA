import java.util.*;

class QueueI {
    static Scanner sc = new Scanner(System.in);
    int currsize = 0;
    static final int MAX = 5;
    int start, end;
    int q[] = new int[MAX];

    public QueueI() {
        start = -1;
        end = -1;
    }

    public boolean isEmpty() {
        return currsize == 0;
    }

    public boolean isFull() {
        return currsize == MAX;
    }

    public void offer() {
        int val;
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        System.out.println("Enter the value: ");
        val = sc.nextInt();

        if (isEmpty()) {
            start = 0; // reset start when inserting first element
            end = 0;
        } else {
            end = (end + 1) % MAX;
        }
        q[end] = val;
        currsize++;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front element: " + q[start]);
        }
    }

    public void poll() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Polled: " + q[start]);
            start = (start + 1) % MAX;
            currsize--;
            if (isEmpty()) { // reset pointers when queue becomes empty
                start = -1;
                end = -1;
            }
        }
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        QueueI q = new QueueI();
        int ch;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n1.Offer\n2.Poll\n3.Peek\n4.Is full\n5.Is empty\n6.Exit");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    q.offer();
                    break;
                case 2:
                    q.poll();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    System.out.println(q.isFull() ? "Queue is Full" : "Queue is Not Full");
                    break;
                case 5:
                    System.out.println(q.isEmpty() ? "Queue is Empty" : "Queue is Not Empty");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        } while (ch != 6);
    }
}
