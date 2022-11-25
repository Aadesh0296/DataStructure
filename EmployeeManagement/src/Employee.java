import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
public class Employee {
	
	Node root;
	  
	 void addEmployee()
	 {
	     root=null;
	 }
	         
	 void insertAtStart(int data)
	 {
	     Node n=new Node(data);
	     if(root==null)
	     {
	         root=n;
	     }
	     else
	     {
	         n.next=root;//1
	         root=n;//2
	         
	         System.out.println("Inserted at start:"+root);
	     }
	   }
	 void deleteAtStart()
	 {    
	     if(root==null)
	     {
	         System.out.println("List Empty");
	     }
	     else
	     {
	         Node t=root;//1
	         root=root.next;//2
	         System.out.println("Deleted at start:"+t.data);
	     }
	     }
	 void insertAtEnd(int data)
	 {
	     Node n=new Node(data);
	     if(root==null)
	     {
	         root=n;
	     }
	     else
	     {
	         Node t=root;//1 use t to search right
	         while(t.next!=null)//2
	         {
	             t=t.next;
	         }
	          t.next=n;//3
	          System.out.println("Inserted at end:"+t.data);
	     }
	     
	   }
	 void deleteAtEnd()
	 {
	     if(root==null)
	     {
	         System.out.println("List Empty");
	     }
	     else
	     {
	         Node t,t2;
	         t=t2=root;
	         while(t.next!=null)//2
	         {
	             t2=t;
	             t=t.next;
	         }
	         t2.next=null;//break link
	         System.out.println("Deleted at end:"+t.data);
	     }
	   }
	 void printEmployee()
	 {
	     if(root==null)
	     {
	         System.out.println("List Empty");
	     }
	     else
	     {
	         Node t;
	         t=root;
	         while(t!=null)//2
	         {
	             System.out.println(t.data);
	             t=t.next;
	         }
	         
	     }
	   }
	 void countEmployee()
	 {
	     if(root==null)
	     {
	         System.out.println("List Empty");
	     }
	     else
	     {
	         Node t;
	         int c=0;
	         t=root;
	         while(t!=null)//2
	         {
	             //System.out.println(t.data);
	             t=t.next;
	             c++;
	         }
	          System.out.println("Total nodes in list are:"+c);
	     }
	 }
	  
	 void searchEmployee(int key)
	 {
	     if(root==null)
	     {
	         System.out.println("List Empty");
	     }
	     else
	     {
	         Node t;
	         int c=0;
	         t=root;
	         while(t!=null && t.data!=key)//2
	         {
	             t=t.next;
	             c++;
	         }
	         if(t!=null)//found 
	            System.out.println("Found at "+c+" from root");
	         else
	             System.out.println("Not Found");
	     }
	                
	}
	  void deleteSpecificEmployee(int key)
	 {
	     if(root==null)
	     {
	         System.out.println("List Empty");
	     }
	     else
	     {
	         Node t,t2;
	         t=t2=root;
	         while(t!=null && t.data!=key)//2
	         {
	             t2=t;
	             t=t.next;
	         }
	         if(t==null)//not found 
	            System.out.println("Not found");
	         else//found
	         {
	             if(t==root)//case 1
	             { root=root.next;
	             }
	           
	             else if(t.next==null)//case2 
	             {  t2.next=null;
	             }
	             else//case 3
	             {  t2.next=t.next;
	             }
	             
	             System.out.println("Deleted specific:"+t.data);
	         }
	     }
	 }

	void insertBetweenEmployee(int key,int data)//inserting after the key
	 {
	     if(root==null)
	     {
	         System.out.println("List Empty");
	     }
	     else
	     {
	         Node t;
	         t=root;
	         while(t!=null && t.data!=key)//2
	         {
	             t=t.next;
	         }
	         if(t==null)//not found 
	            System.out.println("Element Not found");
	         else//found
	         {
	              Node n=new Node(data);//created node
	             n.next=t.next;//1
	             t.next=n;//2
	         }
	         System.out.println("Inserted specific employee:"+t.data);
	     }
	   }              

	public static void main(String[] args) {
		
		int ch,e = 0,h = 0;
		Employee obj=new  Employee();
	      @SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
	      obj.addEmployee();
	      do
	      {
	           System.out.println("1.Add at Start\n2.At at End\n3.Add in Between\n4.Delete at Start\n 5.Delete at End\n6.Delete a Specific\n7.Search Employee\n8.Print Employee\n0.exit");
	           ch=in.nextInt();
	           switch(ch)
	           {
	               case 1:
	                           System.out.println("Enter Employee No:");
	                           e=in.nextInt();
	                           obj.insertAtStart(e);
	                           System.out.println("Pushed");
	                           break;
	                   
	                case 2:
	                	System.out.println("Enter Employee No:");
                        e=in.nextInt();
	                           obj.insertAtEnd(e);
	                           break;
	                   
	                 case 3:
	                	 System.out.println("Enter Employee No:");
                         e=in.nextInt();
                         System.out.println("Enter Position:");
                         h=in.nextInt();
                         
	                            obj.insertBetweenEmployee(e, h);
	                            break;  
	                
	                 case 4:
	                             obj.deleteAtStart();
	                              break;
	                              
	                 case 5:
                         obj.deleteAtEnd();
                          break;
                          
	                 case 6:
	                	 
	                	 System.out.println("Enter Employee No:");
                         e=in.nextInt();
                         obj.deleteSpecificEmployee(e);
                          break;
                          
	                 case 7:
	                	 System.out.println("Enter Employee No:");
                         e=in.nextInt();
                         obj.searchEmployee(e);
                          break;
                          
	                 case 8:
                         obj.printEmployee();
                          break;
	                
	                 case 0:
	                        System.out.println("Exiting ");
	                        break;
	                 
	                 default:
	                        System.out.println("Wrong option selected");
	                        break;
	           }
	      }while(ch!=0);
		
	}

}
