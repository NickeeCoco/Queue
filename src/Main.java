public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(5);
        queue.enqueue(3);
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        queue.enqueue(7);
        queue.enqueue(9);
        System.out.println(queue);
        System.out.println(queue.first());
        queue.enqueue(4);
        System.out.println(queue);

    }
}
