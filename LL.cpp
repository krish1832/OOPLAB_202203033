#include<iostream>
using namespace std;
class Node{
    public:
    int data;
    Node* next;
    Node(int data){
        this->data=data;
        this->next=NULL;
    }
    ~Node(){
		int value = this->data;
		if(this->next != NULL){
			delete next;
			this->next = NULL;
		}
		cout<<"Memory is free"<<endl;
	}

};

void AddFirst(Node* &head,int d){
    Node* newNode=new Node(d);
    newNode->next=head;
    head=newNode;
}


void AddLast(Node* &head,int d)
{
    Node*newNode=new Node(d);
    Node*temp=head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=newNode;
}
void deleteAtindex(Node* &head,int indx)
{
    if(indx==1){
    Node*newhead=head->next;
    head=newhead;
    return;
             }
    int i=1;
    Node* currNode=head;

    while(i<indx-1&&currNode!=NULL){
        currNode=currNode->next;
          i++;
         }
currNode->next=currNode->next->next;
}

void insertatposition(Node* &head,int indx,int data){
    Node* newNode=new Node(data);
    
    if(indx==1){
        Node* temp=head->next;
        head=newNode;
        newNode->next=temp;
         return ;
    }
    int i=1;
    Node*temp=head;
    while(i<indx-1&&temp!=NULL){
        temp=temp->next;
        i++;
    }
    Node* nextNode=temp->next;
    temp->next=newNode;
    newNode->next=nextNode;

}

void print(Node* &head){
    Node* currNode=head;
    while(currNode!=NULL){
        cout<<currNode->data<<"-->";
        currNode=currNode->next;
    }
    cout<<"NULL\n";
}
int main(){
    Node*head=new Node(10);
    AddFirst(head,20);
    AddFirst(head,30);
    print(head);
    cout<<"Adding 0 at last\n";
    AddLast(head,0);
    print(head);
    cout<<"removing 1st node\n";
    deleteAtindex(head,1);
    print(head);
    cout<<"adding node at 2nd position\n";
    insertatposition(head,2,80);
    print(head);
    
    return 0;
    }
