import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class QueueTest {

    private Queue queue;

    @BeforeEach
    void beforeEach() {
        queue = new QueueImpl(5);
    }

    @Test
    @DisplayName("큐 데이터 삽입 추출 테스트")
    void queuePushPollTest() {
        queue.push(5);
        queue.push(4);
        queue.push(3);
        queue.push(2);
        queue.push(1);
        Integer data = (Integer) queue.poll();
        queue.push(5);
        queue.poll();
        queue.push(4);

        System.out.println(queue.toString());
        Assertions.assertEquals(data, 5);
    }


}
