package Stacks;

public class Pair<T,U> {
    // feilds
    T first;
    U second;

    // constructors

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }


    // methods

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }


    public void Pair() {
        System.out.println("Pair{" +
                "first=" + first +
                ", second=" + second +
                '}'
        );
    };

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        Pair <Integer,String>pair=new Pair(1,"One");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair.toString());


    }
}