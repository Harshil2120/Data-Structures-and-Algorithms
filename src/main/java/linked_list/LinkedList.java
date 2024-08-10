package linked_list;

class Node{
	int value;
	Node next;
	
	Node(int value){
		this.value=value;
		this.next=null;
	}
}


public class LinkedList {
	Node head;
	int size;
	
	LinkedList(){
		head=null;
		size=0;
	}
	
	public void add(int data) {
	    Node newnode=new Node(data);
	    
	    if(head==null) {
	    	head=newnode;
	    }else {
	    	Node currentnode=head;
	    	while(currentnode.next!=null) {
	    		currentnode=currentnode.next;
	    	}
	    	currentnode.next=newnode;
	    }
	    size++;
	}
	
	public void addFirst(int value) {
		Node newnode=new Node(value);
	}
	
	public void printList() {
		Node currentnode=head;
		while(currentnode!=null) {
			System.out.print(currentnode.value+" ");
			currentnode=currentnode.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		  LinkedList list = new LinkedList();
	        list.add(10);
	        list.add(20);
	        list.add(30);


	        list.printList();

	}
}
