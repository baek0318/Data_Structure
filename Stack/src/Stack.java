public interface Stack<T> {


    /**
     * 현제 데이터가 가득찼는지 확인하는 메서드
     * @return 가득찼으면 true 아니라면 false
     */
    Boolean isFull();

    /**
     * 현제 데이터가 하나도 없는지 확인하는 메서드
     * @return 비었으면 true 아니라면 false
     */
    Boolean isEmpty();

    /**
     * 스택에다가 데이터를 추가하는 메서드
     * @param data 추가하고 싶은 데이터
     */
    void push(T data);

    /**
     * 스택의 최상위 데이터를 추출하는 메서드
     * @return 제일 상단의 데이터
     */
    T pop();

    /**
     * 스택의 최상위 데이터를 추출하지 않고 확인만 하는 메서드
     * @return 제일 상단의 데이터
     */
    T peek();
}
