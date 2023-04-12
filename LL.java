import java.util.Random;
public class Main {

    static class ll {
        Node head;
        int size;

        ll() {
            this.size = 0;
        }

        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
                size++;
            }
        }

        public void deleteFirst() {
            if (head == null) {
                System.out.println("The list is empty");
                return;
            }
            size--;
            head = head.next;
        }

        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }

        public int getSize() {
            return size;
        }

        public int getElement(int indx) {
            int i = 1;
            Node curr = head;
            while (i < indx) {
                curr = curr.next;
                i++;
            }
            return curr.data;
        }

        public void deleteLast() {
            if (head == null) {
                System.out.println("The list is empty");
                return;
            }
            size--;
            if (head.next == null) {
                head = null;
                return;
            }
            Node secondLast = head;
            Node lastNode = head.next;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
                secondLast = secondLast.next;

            }
            secondLast.next = null;
        }

        public void deleteatindex(int indx) {
            if (indx == 1) {
                head = head.next;
                return;
            }
            Node curr = head;
            int i = 1;
            while (i < indx - 1) {
                curr = curr.next;
                i++;
            }
            curr.next = curr.next.next;
            size--;
        }




    public void print() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

}
    public static void main(String[] args) {
        ll list=new ll();
        for(int i=0;i<10;i++){
            Random random = new Random();
            int randomNumber = random.nextInt(50) + 1;
            list.addLast(randomNumber);
        }
        list.print();
        for(int i=0;i<list.getSize();i++){
            if(list.getElement(i)>25) {
                list.deleteatindex(i);
            }
        }
        list.print();

    }
}
