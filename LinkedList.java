class Node1 
{
    int data;
    Node1 next;

    Node1(int data) 
    {
        this.data = data;
        this.next = null;
    }
}

public class Linkedlist 
{
    Node1 head = null; 
    void ISE(int data) 
    {
       Node1 newNode = new Node1(data); 
       if (head == null)
       {
          head = newNode; 
       } else 
       {
          Node1 temp = head;
          while (temp.next != null) 
          { 
    	     temp = temp.next;
          }
          temp.next = newNode; 
       }
    }

    void DFE() 
    {
        if (head == null) 
        {
            System.out.println("The list is empty");
            return;
        }
        if (head.next == null) 
        {
            head = null; 
            return;
        }
        Node1 temp = head;
        while (temp.next.next != null) 
        { 
            temp = temp.next;
        }
        temp.next = null; 
    }

    void Display() 
    {
        if (head == null) 
        {
            System.out.println("The list is empty");
            return;
        }
        Node1 temp = head;
        while (temp != null)
        { 
            System.out.print("-->" + temp.data);
            temp = temp.next;
        }
        System.out.println("-->NULL");
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist(); 
        list.ISE(10); 
        list.ISE(20);
        list.Display(); 
        list.DFE(); 
        list.Display();
    }
}