package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class ArrayStack <T>{
    // variables
    private static final int DEFAULT_CAPACITY= 2;
    private int top;
    private T[] stack; // array name

    // constructors
    public ArrayStack(int size){
        top = 0;
        stack = (T[])new Object[size];
    }

    ArrayStack(){
        this(DEFAULT_CAPACITY);
    }

    // methods -- operations
    // size
    int size(){
        return top;
    }

    // isEmpty -- boolean
    boolean isEmpty(){
        return top==0;
//        if(top==0)
//            return true;
//        return false;
    }

    // push
    void  Push(T element){
      if (size()==stack.length)
           expandCapacity();

        stack[top] = element;
        top++;
     //   return element;
    }



    // expandCapacity
    private void expandCapacity(){
        stack = Arrays.copyOf( stack,stack.length*2);
    }

    // peek
    T Peek (){
        if (isEmpty()){
            System.out.println("The Stck is Empty!");
            return null;
        }
        return stack[top-1];
    }
    T Pop() throws EmptyCollectionException{
        if (isEmpty())//if (top==0)
            return null; // throw new EmptyCollectionException("Stack");
        top= top-1;
        T result =stack[top];
        stack[top]=null;
        return result;
    }
    //tostring


    @Override
    public String toString() {
        return "ArrayStack{" +
                "top=" + top +
                ", stack=" + Arrays.toString(stack) +
                '}';
    }
    void showInfo(){
        for (int i = 0; i <top;i++){
            System.out.println(stack[i]);
        }
    }
    // isFull()
    public boolean isFull(){
        if (size()==stack.length)
            return true;
        return false;

    }

    // getCapacity()
   public int getCapacity(){
        return stack.length;
   }

   // display()
   public  void display() {
       for (int i = top-1; i >= 0; i--) {
           System.out.println(stack[i]);
       }


   }

   // Empty()
    public void Empty(){
        for (int i =top-1; i >= 0; i--){
            stack[i]=null;
            top--;
           // System.out.println(stack[i]);
        }

    }
    // IsSame
    private void isSame(ArrayStack names, ArrayStack names2) {
        if ( names.getCapacity()==names2.getCapacity()){
            if (names.size()==names2.size()){
                for (int i= names.getCapacity();i>names.top;i++)
                     if(names.equals(names2)){

                    System.out.println("True");
                    System.out.println("Same in : Length ,Size  and Equal");
                         break;
                }else {
                         // System.out.println("False");
                         System.out.println("Same in : Length ,Size  and not-Equal");
                         break;
                     }
            }
            else {
                //System.out.println("False");
                System.out.println("Same in : Length and not-Size , not-Equal");
            }
        }
        else {
          //  System.out.println("False");
            System.out.println("Not-Same in : Length ,Size  and not-Equal");
        }
    }

    // adding twe ArraysStack
//    private void Full(ArrayStack first, ArrayStack second) {
//        if (first.size() == second.size()) {
//            ArrayStack full = new ArrayStack(first.size() + second.size());
//                for (int i = 0; i < full.size(); i++) {
//                    full = first[i] + second[i];
//                System.out.println(full);
//
//
//            }
//        }else
//            System.out.println("the twe ArraysStack is not SAME");
//
//
//    }


    public static ArrayStack CalulateTotal(ArrayStack midterm ,ArrayStack finalExam){
        ArrayStack total = new ArrayStack<>();
        ArrayStack sum = new ArrayStack<>();

        if (midterm.getCapacity()==finalExam.getCapacity()){
            int length = midterm.getCapacity();

            for (int i = 1; i < length; i++) {
                int mid= (int) midterm.Pop();
                int finale=(int) finalExam.Pop();
                 total.Push(finale+mid);
            }
            for (int i = 1; i < length; i++)
                sum.Push(total.Pop());
            return sum;
        }else
            return null;
    }




    public static void main(String[] args) {
        ArrayStack<String> names = new ArrayStack<String>(2);
        ArrayStack<String> names2 = new ArrayStack<String>(2);

        ArrayStack<Integer> int1 = new ArrayStack<Integer>(4);
        ArrayStack<Integer> int2 = new ArrayStack<Integer>(4);


        //names.Peek();
        names.Push("osman");
       // names.Push("osman");
        names2.Push("osman");

        names.Push("Farah");
        names.Push("Hawa");
        names.Push("Warsame");
        names.Push("Warsame");



        System.out.println("Removed element: "+names.Pop());
        System.out.println("Size : "+names.size());
        System.out.println("top: "+names.Peek());
        System.out.println("empty: "+names.isEmpty());

        System.out.println(names.toString());
        names.showInfo();
        System.out.println(names.isFull());
        System.out.println(names.getCapacity());
        names.Empty();
        names.Push("osman");

        names.display();



//names.Full(names,names2);

        int1.Push(25);
        int1.Push(40);
        int1.Push(30);

        int2.Push(20);
        int2.Push(30);
        int2.Push(40);






        names.isSame(int2,int1);

//        System.out.println("Midterm   is "+int1);
//        System.out.println("FinalExam is "+int2);
//        System.out.println(ArrayStack.CalulateTotal(int1,int2));

      //  ArrayStack.CalulateTotal(int1,int2);








    }



}
