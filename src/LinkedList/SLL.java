package LinkedList;

public class SLL {
    Node head;

   public void inserAtBeg(int data){

        Node n=new Node(data); n.next=head;head=n;
    }

   public void inserAtEnd(int data) {
         Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
 Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
   public void deleteAtBeg(){

        if(head==null){
            System.out.println("list is empty");
            return;
        }

        head=head.next;
   }

   public void deleteAtEnd(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;

        }
        temp.next=null;
    }

  public   void length(){
        int len=0;

        Node temp=head;
        while(temp!=null){
           len++;
           temp=temp.next;
        }
        System.out.println("length is"+":"+len);
    }

   public void print(){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

  public   void insertAtPos(int pos,int data){
        Node temp=head;
        Node nn=new Node(data);
        if(pos==1){
            nn.next=head;
            head=nn;
            return;
        }
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        nn.next=temp.next;
        temp.next=nn;
    }

  public  void DeleteAtPos(int pos){

        if(pos==1){
          head=head.next;
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

}
