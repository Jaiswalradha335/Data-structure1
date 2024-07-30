// public class Queuey {
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear = -1;
//         Queue(int n) {
//             arr = new int[n];
//             this.size = n;
//         }
//         public static boolean isEmpty() {
//             return rear == -1;
//         }
//         //enqueue
//         public static  void add(int data) {
//             if(rear == size-1) {
//                 System.out.println("full queue");
//                 return;
//             }
//             rear++;
//             arr[rear] = data;
//         }
//         //dequeue 0(n) time
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             int front = arr[0];
//             for(int i=0; i<rear; i++) {
//                 arr[i] = arr[i+1];
//             }
//             rear--;
//             return front;
//         }
//         //peek
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             return arr[0];
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
        
//     }
    
// }
import java.util.*;

public  class Queuey {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }
        public static void add(int data) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2 .isEmpty()) {
                s1.push(s2.pop());
            }
        }
        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return s1.pop();
        }
        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return s1.peek();


        }

    }
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
    }
    
}
