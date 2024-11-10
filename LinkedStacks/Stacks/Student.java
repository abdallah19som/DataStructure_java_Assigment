package Stacks;

public class Student <R>{
    R data;
    int age;

    // main
    public static void main(String[] args) {
        Student<String> stronj = new Student<String>();
        Student<Integer> intonj = new Student<Integer>();
        Student<Boolean> boolobj = new Student<Boolean>();

        stronj.data ="Mohammed";
        stronj.age=90;
        intonj.data = 100;
        boolobj.data=true;
    }
}
