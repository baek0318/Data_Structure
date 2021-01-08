import java.util.logging.Logger;

public class QueueImpl implements Queue<Integer>{

    private Integer[] store;
    private Integer front;
    private Integer back;
    private Integer size;
    private Logger logger = Logger.getGlobal();

    public QueueImpl(int length) {
        this.store = new Integer[length];
        this.front = 0;
        this.back = 0;
        this.size = 0;
    }

    @Override
    public Boolean isFull() {
        return store.length == size;
    }

    @Override
    public Boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(Integer data) {
        if(!isFull()) {
            store[back++] = data;
            back = back%store.length;
            size++;
        }
        else {
            logger.warning("queue full");
        }
    }

    @Override
    public Integer poll() {
        if(!isEmpty()) {
            Integer data = store[front++];
            front = front%store.length;
            size--;
            return data;
        }
        else {
            logger.warning("queue empty");
            return null;
        }
    }

    @Override
    public Integer peek() {
        if(!isEmpty())
            return store[front];
        else
            return null;
    }
}
