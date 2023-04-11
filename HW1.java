
public class Main {

    static class ll{
        Node head;
        int size;
        ll(){
            this.size=0;
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
        //        adding node at first

        //        adding node at last
        public void addLast(int data) {
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;}




    public int search(int data){
        int i=1;
        Node curr=head;
       while(curr.data!=data&&curr!=null){
           curr=curr.next;
           i++;
       }
       if(curr==null) return -1;
       return i;

    }


    }
    public static void main(String[] args) {
     ll list=new ll();
     list.addLast(1);
     list.addLast(5);
     list.addLast(7);
     list.addLast(3);
     list.addLast(8);
     list.addLast(2);
     list.addLast(3);
        System.out.println("Index of 7 is "+list.search(7));

    }
}
