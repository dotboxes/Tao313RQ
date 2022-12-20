public class Main {

    public static class list {
        // Returns the number of elements in the queue
        int size = 5;
        int items[] = new int[size];
        int front, rear;

        private list() {
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
            if (front == -1) {
                System.out.println("isEmpty" + "()," + " ~, " + "empty");
                return true;
            }
            else
                return false;
        }
        void enqueue(int e) {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = e;
            int i;
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + ", ");
            System.out.println("enqueue" + "(" + e + ")," + " ~, " + e );
        }
        void add(int ix, int e){
            if (front == -1)
                front = 0;
            for(int x=size;x<=ix;x--)
                items[ix]=e;
            rear++;
            items[ix] = e;
            int i;
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + ", ");
            System.out.println("add"+"("+ ix + "," + e + ")");
            size++;
        }
        int get (int ix) throws IndexOutOfBoundsException{
            int i;
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + ", ");
            System.out.println("get(" + ix + "), " + items[ix]);
            return items[ix];
        }
        int set(int ix,int e) throws IndexOutOfBoundsException{
            int temp = items[ix];
            items[ix]=e;
            int i;
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + ", ");
            System.out.println("set(" + ix + ", " + e + ")");
            return items[ix];
        }
        int remove(int ix) throws IndexOutOfBoundsException{
            int removedItem = items[ix];

            size--;
            int i;
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + ", ");
            System.out.println("remove" + "(" + ix + "), " + removedItem);
            return removedItem;
        }
    }
    public static void main(String[] args) {
        list l = new list();
        l.isEmpty();
        l.add(0,2);
        l.add(1,4);
        l.add(2,1);
        l.get(1);
        l.get(0);
        l.set(1,3);
        l.remove(1);
        l.remove(2);
    }
}