package LinkedStacks;



import java.util.Scanner;

public class LinkedStack<T> {
    int count;
    Node<T> top;  //head

    LinkedStack() {
        count = 0;
        top = null;
    }

    //operations
    //size
    int size() {
        return count;
    }

    //isempty
    boolean isEmpty() {
        return count == 0; // top == null;
    }

    //push
    void push(T element) {
        Node<T> tempAddress = new Node<>(element);
        //System.out.println("temp address: " + tempAddress);
        tempAddress.setNext(top);
        top = tempAddress;
        count++;
    }

    //pop
    T pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack!");
            return null;
        }
        T removedElement = top.getElement();
        top = top.getNext();
        count--;
        return removedElement;
    }

    //peek
    T peek() {
        if (isEmpty()) {
            System.out.println("Empty Stack!");
            return null;
        }
        return top.getElement();
    }


    //display linkedstack elements
    void display() {
        //if is empty
        if (isEmpty())
            System.out.println("Stack is empty!");
        else {
            Node<T> currentAddress = top;
            while (currentAddress != null) {
                System.out.println(currentAddress.getElement());
                currentAddress = currentAddress.getNext();
            }
        }
    }

    // search element
    boolean searchElement(T searchdata){
        Node<T> current = top;
        boolean found = false;
        while (current != null) {
            if(searchdata.equals(current.getElement()))
                found = true;
            current = current.getNext();
        }
        return found;
    }
    int Counter (T element){
        Node<T> current=top;
        int number =0;
        while (current!=null){
            if (element.equals(current.getElement()))
                number++;
            current=current.getNext();
        }
        return number;
    }


        //searchElement
        void Search(T data){
            boolean found = false;
            int counter = 0;
            if(isEmpty())
                System.out.println("Stack is empty!");
            else{
                Node<T> currentAddress = top;
                while (currentAddress != null){
                    if(data.equals(currentAddress.getElement())){
                        found = true;
                        counter++;
                    }
                    currentAddress = currentAddress.getNext();
                }
            }
            //display result
            if(found == false)
                System.out.println("not found!");
            else
                System.out.println("found " + counter + " times");
        }

        // removeBetween
    public void removeBetween(LinkedStack<T> link){
        if (!isEmpty()) {
            if (link.size() == 1 || link.size() == 2) {
                link.display();
            }
            else {
                T high = link.pop();
                for (int i = link.size();i>1;i--) {
                    link.pop();
                }
                T low = link.pop();
                  link.push(low);
                  link.push(high);
                  link.display();
            }
        }else
            System.out.println("the LinkedStack is NULL!");
    }
        //main method
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            LinkedStack<String> names = new LinkedStack<>();
            names.push("Ali");
            names.push("Ahmed");
            names.push("Gedi");
            names.push("Hawa");
            names.push("salah");

           // System.out.println("removed element : " + names.pop());
            System.out.println("top: " + names.peek() );
            System.out.println("size: " + names.size() );
            System.out.println("empty: " + names.isEmpty() );
           // names.display();
          //  System.out.println("Enter name to search: ");
            //String data = scanner.next();
            //System.out.println(names.searchElement(data));


           System.out.println("-------------------------------");
           names.display();
            System.out.println("-------------------------------");

            names.removeBetween(names);
            System.out.println("-------------------------------");
       //     names.Counter("Ali");

        }

    }


