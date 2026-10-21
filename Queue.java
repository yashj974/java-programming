class QueueDemo {

    int queue[] = new int[5];
    int front = 0;
    int rear = -1;

    void enqueue(int value) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
        } else {
            queue[++rear] = value;
            System.out.println(value + " inserted into queue");
        }
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front] + " deleted from queue");
            front++;
        }
    }

    void peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements:");

            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueDemo q = new QueueDemo();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
        q.peek();

        q.dequeue();

        q.display();
    }
}