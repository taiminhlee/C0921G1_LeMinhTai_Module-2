package ss10_dsa_danh_sanh.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylinked_theo_thu_vien_java;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private E data;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
    }

    public int size() {
        return numNodes;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public boolean contains(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        if (temp.data.equals(element)) {
            return true;
        }
        return false;
    }

    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if ( temp.getData().equals(element)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
    public void addLast(E element){
        Node temp =head;
        while (temp.next !=null){
            temp=temp.next;
        }
        temp.next=new Node(element);
        numNodes++;
    }
    public void addfirst(E element){
        Node temp=head;
        head=new Node(element);
        head.next=temp;
        numNodes++;
    }
    public void add(int index, E data){
        Node temp=head;
        Node holder;
        for (int i = 0; i <index-1&& temp.next !=null ; i++){
            temp=temp.next;
        }
        holder =temp.next;
        temp.next=new Node(data);
        temp.next.next=holder;
        numNodes++;
    }
    public E remove(int index){
        if (index<0||index>numNodes){
            throw new IndexOutOfBoundsException();
        }
        Node temp=head;
        E data;
        if (index==0){
            data =temp.data;
            head=head.next;
        }else {
            for (int i = 0; i <index-1 && temp.next !=null ; i++) {
                temp=temp.next;

            }
            data =temp.next.data;
            temp.next=temp.next.next;
        }
        numNodes--;
        return (E)data;
    }
    public boolean remove(E element){
        if (head.data.equals(element)){
            remove(0);
            return true;
        }else {
            Node temp =head;
            while (temp.next != null){
                if (temp.next.data.equals(element)){
                    temp.next=temp.next.next;
                    numNodes--;
                    return true;
                }
                temp=temp.next;
            }
            return false;
        }
    }
    public  MyLinkedList<E> clone(){
        if (numNodes==0){
            throw new IndexOutOfBoundsException();
        }
        MyLinkedList<E> temp=new MyLinkedList<E>();
        Node tempNode =head;
        temp.addfirst((E) tempNode.data);
        tempNode =tempNode.next;
        while (tempNode !=null){
            temp.addLast((E) tempNode.data);
            tempNode =tempNode.next;
        }
        return temp;
    }

    }
