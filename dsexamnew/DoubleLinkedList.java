package dsexamnew;

import java.util.Scanner;

class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
   
public class DoubleLinkedList {

		Node root;    

	   //created a new node   
	    void createList()
	    {
	        root=null;
	    }
	    
	    //insert element at right
	    void insertAtRight(int data)
        
	    {
	        Node n=new Node(data);
	        if(root==null) {
	            root=n;
	        System.out.println(n.data+" Inserted at right position");
	        }
	        else
	        {
	        	Node t=root;
	            while(t.right!=null)
	                t=t.right;
	            t.right=n;
	            n.left=t;
	            System.out.println(n.data+" Inserted at right position");
	        }
	    }
	    
	    void printList()
	    {
	        if(root==null)
	                 System.out.println("List Empty");
	        else
	        {
	            Node t;
	            t=root;
	            while(t!=null)//2
	            {
	                System.out.println(t.data);
	                t=t.right;
	            }
	        }
	      }
	    
	    void printTransverse()
	    {
	        if(root==null)
	                 System.out.println("List Empty");
	        else
	        {
	            Node t;
	            t=root;
	            while(t.right!=null)//stop at last
	            {
	               t=t.right;
	            }
	            while(t!=null)//stop when null 
	            {
	                System.out.println(t.data);
	                t=t.left;
	            }
	        }
	        
	      }
	    
	    void splitList() {
	    	
	    	 if(root==null)
                 System.out.println("List Empty");
        else
        {
        	Node t1, t2, t;
        	int i=1;
        	
        	t1=t2=t=root;
        	
        	while(t!= null) {
        		
        	if(i%2!=0)
            {
               t1=t;
               System.out.println("odd position element"+t1.data);
            }
        	else
            {
                
                t2=t;
                if(t.right!=null) {
                System.out.println("even position element"+t2.data);
                }
            }
        	t=t.right;
        	i++;
        	}
        	while(t1!=null && t2 != null)//2
            {
                System.out.println(t1.data);
                t1=t1.right;
                System.out.println(t2.data);
                t2=t2.right;
            }	 
    	 
        }
	    	 
	            
	    	
	    }
	    
	    
	    
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        /* Creating object of linkedList */
	        var list = new DoubleLinkedList();
	        int ch = 0; 
	        list.createList();
	        System.out.println("\n Doubly Linked List Operations\n");
            System.out.println("1. Insert At Right");
            System.out.println("2. Print Original List");
            System.out.println("3. Print Transverse if list");
            System.out.println("4. Split List");
            System.out.println("5. Exit");
            
	        do {
	           
	        	 System.out.println("Enter your choice");
	             int choice = scan.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.println("Enter element to insert at rigth position");
	                    int e = scan.nextInt();
	                    list.insertAtRight(e);
	                    break;
	                    
	                case 2:
	                    System.out.println("Elements in the list in original order");
	                    list.printList();
	                    break;
	                    
	                case 3:
	                    System.out.println("Elements in the list in traverse order");
	                    list.printTransverse();
	                    break;
	                    
	                case 4:
	                	System.out.println("Splited list");
	                    list.splitList();
	                    break;
	                    
	                    
	                case 5:
	                	System.out.println("Exited!!");
	                	
	                	
	               default:
	                	System.out.println("Wrong option!!");
	                	break;
	                	
	                	
	            }
	            
	        }while (ch != 5);
	        scan.close();
}

}



























































