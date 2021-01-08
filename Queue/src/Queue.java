public interface Queue<T> {

    /**
     * 가득찼는지 확인하는 메서드
     * @return 가득찼다면 ? true : false
     */
    Boolean isFull();

    /**
     * 비었는지 확인하는 메서드
     * @return 비었다면 ? true : false
     */
    Boolean isEmpty();

    /**
     * Queue에 데이터를 삽입하는 메서드
     * @param data 삽입할 데이터
     */
    void push(T data); //

    /**
     * Queue에 데이터를 빼내는 메서드
     * @return 제일 먼저 들어온 데이터 제거(O)
     */
    T poll();

    /**
     * Queue의 제일 먼저 빠져야할 데이터를 확인하는 메서드
     * @return 제일 먼저 들어온 데이터 제거(X)
     */
    T peek();
}
