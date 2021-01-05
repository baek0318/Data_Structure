import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.lang.model.type.NullType;
import java.util.Optional;

public class StackTest {

    private Stack stack;
    @BeforeEach
    void beforeEach() {
        stack = new StackImpl(5);
    }

    @Test
    void stackPushTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assertions.assertEquals(stack.toString(), "F| 1 2 3|B");
    }

    @Test
    void stackPopTest() {
        stack.push(1);
        stack.push(2);

        int data = (Integer) stack.pop();

        Assertions.assertEquals(data, 2);
    }

    @Test
    void stackPeekTest() {
        stack.push(1);
        stack.push(2);

        int data = (Integer) stack.peek();
        int anotherData = (Integer) stack.peek();

        Assertions.assertEquals(data, 2);
        Assertions.assertEquals(anotherData, data);
    }

    @Test
    void emptyStackPop() {
        Integer data = (Integer) stack.pop();

        Assertions.assertNull(data);
    }

}
