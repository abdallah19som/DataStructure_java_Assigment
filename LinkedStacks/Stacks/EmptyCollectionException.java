package Stacks;

public class EmptyCollectionException extends  RuntimeException{
    EmptyCollectionException(String collectionName){
        super("the "+ collectionName +" is empty!");
    }
}
