public class Main {

    public static class deque {
        // Returns the number of elements in the queue
        int size = 5;
        int items[] = new int[size];
        int front, rear;

        private deque() {
            front = -1;
            rear = -1;
        }

        int size(){
            int c = 0;
            for (int i = 0; i < items.length; i ++)
                if (items[i] != 0)
                    c++;
            int i;
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + ", ");
            System.out.println("size(), " + c );
            return c;
        }

        // Tests whether the queue is empty.
        boolean isEmpty() {
            if (front == -1)
                return true;
            else
                return false;
        }

        // Inserts an element at the rear of the queue.
        void addLast(int e) {
            if (front == -1)
                front = 0;
            rear++;
            int f=0;
            items[rear] = e;
            int i;
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + ", ");
            System.out.println("addLast" + "(" + e + ")," + " ~, " + e );
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

        void addFirst(int e){
            if (front == -1)
                front = 0;
            for (int i = rear; i >= 0; i--) {
                items[i+1] = items[i];
            }
            items[front] = e;
            rear++;
            int i;
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + ", ");
            System.out.println("addFirst" + "(" + e + ")," + " ~, " + e );
        }

        int removeFirst(){
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
            int i;
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + ", ");
            System.out.println("removeFirst" + "()");
            return element;
        }

        int removeLast(){
            int element;
            if (front == -1) {
                return -1;
            }
            element = items[rear];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                rear--;
            }
            int i;
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + ", ");
            System.out.println("removeLast" + "()");
            return element;
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
        deque q = new deque();
        q.addLast(5);
        q.addLast(3);
        q.addFirst(6);
        q.addLast(7);
        q.addFirst(9);
        q.dequeue();
        q.removeFirst();
        q.removeLast();
        q.tableDisplay();
    }
}