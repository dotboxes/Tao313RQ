public class Main {

    public static class Queue {
        // Returns the number of elements in the queue.
        int size = 5;
        int items[] = new int[size];
        int front, rear;

        private Queue() {
            front = -1;
            rear = -1;
        }



        // Tests whether the queue is empty.
        boolean isEmpty() {
            if (front == -1)
                return true;
            else
                return false;
        }

        // Inserts an element at the rear of the queue.
        void enqueue(int e) {
            if (front == -1)
                front = 0;
            rear++;
            int f=0;
            items[rear] = e;
            int i;
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + ", ");
            System.out.println("enqueue" + "(" + e + ")," + " ~, " + e );
        }

        // Returns, but does not remove, the first element of the queue (null if empty).
        int first() {
            int element;
            if (front == -1) {
                return -1;
            }
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(front);
            return front;
        }

        Integer dequeue() {
            int element;

            if (isEmpty()) {
                System.out.println("Queue is empty");
                return null;
            } else {
                element = items[front];
                if (front >= rear) {
                    front = -1;
                    rear = -1;
                } else {
                    front++;
                }
                int i;
                for (i = front; i <= rear; i++)
                    System.out.print(items[i] + ", ");
                System.out.println("dequeue" + "()");
                return (element);
            }
        }
        void tableDisplay() {
            int i;
            if (isEmpty()) {
                System.out.println("Empty Queue," + " isEmpty" + "(), " + "()");
            } else {
                for (i = front; i <= rear; i++)
                    System.out.print(items[i] + ", ");

            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(8);
        q.dequeue();
        q.tableDisplay();
    }
}