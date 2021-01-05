import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackImpl implements Stack<Integer>{

    private int[] store;
    private int pointer;

    public StackImpl(int size) {
        this.store = new int[size];
        this.pointer = 0;
    }

    @Override
    public Boolean isFull() {
        return pointer == store.length - 1;
    }

    @Override
    public Boolean isEmpty() {
        return pointer == 0;
    }

    @Override
    public void push(Integer data){
        if(isFull())
            System.out.println("already stack is full");
        else
            store[pointer++] = data;
    }

    @Override
    public Integer pop() {
        if(isEmpty()){
            System.out.println("stack is empty");
            return null;
        }
        else {
            int result = store[pointer-1];
            pointer--;
            return result;
        }
    }

    @Override
    public Integer peek() {
        if(isEmpty()) {
            System.out.println("stack is empty");
            return null;
        }
        else
            return store[pointer-1];
    }

    @Override
    public String toString() {
        String str = "F|";
        for(int i = 0; i < pointer; i++){
            str += (" "+store[i]);
        }
        str+="|B";
        return str;
    }

}
