public class Stack<E> {
    private Node<E> head;

    public Stack(){head = null;}

    /**
     * puts item on top of the Stack
     * @param item
     */
    public void push(E item){
        Node<E> newHead = new Node <>(item);
        newHead.setNext(head);
        head = newHead;
    }

    /**
     * removes the top value of Stack and returns its value
     * @return value of the top item in the Stack
     */
    public E pop(){
        if (head == null){
            return null;
        }
        E item = head.getValue();
        head = head.getNext();
        return item;
    }
}
