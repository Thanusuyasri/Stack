import java.util.Scanner;

class Node
{
    int value;
    Node next;
    Node(int value)
    {
        this.value = value;
    }
}
public class Stack {
    Node top;
    int height;
    Stack(int value)
    {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    void top(){
        System.out.println(top.value);
    }

    void print()
    {
        Node temp = top;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    void push(int value)
    {
        Node newNode = new Node(value);
        if(height == 0)
        {
            top = newNode;
        }
        else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    Node pop()
    {
        if(height == 0)
        {
            return null;
        }
        Node temp = top;
        if(height == 1)
        {
            top = null;
        }
        else {
            top = top.next;
            temp.next = null;
        }
        height --;
        return temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements to push to end enter -1:");
        int num = scanner.nextInt();
        Stack stack = new Stack(num);
         num = scanner.nextInt();
        while (num!=-1)
        {
            stack.push(num);
            num = scanner.nextInt();
        }
        int index,value;
        System.out.println("1-Push\n2-Pop\n3-Print\n4-Exit");
        int choice = scanner.nextInt();
        while(choice!=4){
            switch(choice) {
                case 1:
                    System.out.println("Enter a value to push:");
                    value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    System.out.println("The  element is poped out:"+stack.pop().value);
                    break;
                case 3:
                    System.out.println("The element are:");
                    stack.print();
                    break;
                default:
                    System.out.println("Worng choice.");
            }
            System.out.println("1-Push\n2-Pop\n3-Print\n4-Exit");
            choice = scanner.nextInt();
        }

    }
}
