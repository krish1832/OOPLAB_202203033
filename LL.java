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
        public  void addfirst(int data){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
        }
//        adding node at last
        public void addLast(int data) {
            Node currNode = head;
            Node newNode = new Node(data);
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;}

//        adding element at given Index
        public void addAtIndex(int indx,int data){
            Node currNode=head;
            Node newNode=new Node(data);
            if(indx==1){
                addfirst(data);
                return;
            }
            int i=1;
            while(i<indx-1&&currNode!=null){
                currNode=currNode.next;
                i++;
            }
            newNode.next=currNode.next;
            currNode.next=newNode;

        }
        // to get size of ll
        public int getsize(){
            return size;
        }

        // print list
        public void print(){
            Node currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data+"-->");
                currNode=currNode.next;
            }
            System.out.println("null");
        }
//delete first Node
        public void deleteFirst(){
            if(head == null){
                System.out.println("The list is empty");
                return;
            }
            size--;
            head = head.next;
        }
        //delete Last Node of ll
        public void deleteLast(){
            if(head == null){
                System.out.println("The list is empty");
                return;
            }
            size--;
            if(head.next == null){
                head = null;
                return;
            }
            Node secondLast = head;
            Node lastNode = head.next;
            while(lastNode.next != null){
                lastNode = lastNode.next;
                secondLast = secondLast.next;

            }
            secondLast.next = null;
        }

        public void deletatindex(int indx){
            if(indx==1) {
                deleteFirst();
                return ;
            }
            Node curr=head;
            int i=1;
            while(i<indx-1 && curr!=null){
               curr=curr.next;
               i++;
            }
            if(curr==null) return;
            Node prev=curr.next;
            if(prev==null) {
                deleteLast();
                return;
            }
            if(prev.next==null){
               curr.next=null;
               return;
            }
            else {
                Node next=prev.next;
                curr.next=next;
                size--;
            }

        }

        }
        public static void main(String[]args){
        ll list=new ll();
        list.addfirst(30);
        list.addfirst(20);
        list.addfirst(10);
        list.print();
        System.out.println("adding 0 at 3rd position");
         list.addAtIndex(3,0);
         list.print();
            System.out.print("Size Is:");
            System.out.println(list.getsize());
            System.out.println("Deleting 3rd node");
            list.deletatindex(3);
            list.print();
            System.out.println("Size is :"+list.getsize());
    }

}