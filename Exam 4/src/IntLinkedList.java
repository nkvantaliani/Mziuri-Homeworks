import java.util.NoSuchElementException;

public class IntLinkedList {
    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    public int getFirst(){
        if (isEmpty()){
            throw new NoSuchElementException("list is empty");
        };
        return head.value;
    }

    public int getLast(){
        if (isEmpty()) {
            throw new NoSuchElementException("list is empty");
        }
        return tail.value;
    }

    public int get(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public int set(int index, int value){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        int oldValue = current.value;
        current.value = value;

        return oldValue;

    }

    public void add(int value){
        Node last = new Node(value);
        if(isEmpty()){
            head = last;
            tail = last;
            size++;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = last;
        tail = last;
        size ++;
    }

    public void addFirst(int value){
        Node first = new Node(value);
        if(isEmpty()){
            head = first;
            tail = first;
        }else{
            first.next = head;
            head = first;
        }
        size ++;

    }

    public void addLast(int value){
        Node last = new Node(value);
        if(isEmpty()){
            head = last;
            tail = last;
            size++;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = last;
        tail = last;
        size ++;
    }

    public void add(int index, int value){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        if(index == 0){
            addFirst(value);
            return;
        }
        if(index == size){
            addLast(value);
            return;
        }

        Node newNode = new Node(value);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public int removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException("list is empty");
        }
        int removed = head.value;
        head = head.next;
        size--;
        if(isEmpty()){
            tail = null;
        }
        return removed;
    }

    public int removeLast(){
        if(isEmpty()){
            throw new NoSuchElementException("list is empty");
        }
        if(size==1){
            int removed = head.value;
            head = null;
            tail = null;
            size --;
            return removed;
        }
        Node temp = head;
        while(temp.next != tail) {
            temp = temp.next;
        }
        int removed = tail.value;
        temp.next = null;
        tail = temp;
        size--;
        return removed;
    }

    public int remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        if(index == 0){
            return removeFirst();
        }
        if(index == size - 1){
            return removeLast();
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        int removed = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return removed;
    }


    public boolean removeValue(int value) {
        if (isEmpty()) {
            return false;
        }
        if (head.value == value) {
            removeFirst();
            return true;
        }
        Node temp = head;
        while (temp.next != null && temp.next.value != value) {
            temp = temp.next;
        }
        if (temp.next == null) {
            return false;
        }
        if (temp.next == tail) {
            tail = temp;
        }
        temp.next = temp.next.next;
        size--;
        return true;
    }

    public int indexOf(int value){
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if(temp.value == value){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }


    public boolean contains(int value){
        return indexOf(value) != -1;
    }

    public int[] toArray(){
        int[] arr = new int[size];
        Node temp = head;
        for (int i = 0; i < size; i++) {
            arr[i] = temp.value;
            temp = temp.next;
        }
        return arr;
    }


    public String toString(){
        String res = "[";
        Node temp = head;
        while(temp != null){
            res = res + temp.value;
            if(temp.next != null){
                res = res + "->";
            }
            temp = temp.next;
        }
        res = res +"]";
        return res;
    }

    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node temp = head;
        head = tail;
        tail = temp;
    }

    public int count(int value) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

}
