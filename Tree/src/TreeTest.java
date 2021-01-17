import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TreeTest {

    private TreeSearchImpl search;

    @BeforeEach
    void beforeEach() {
        search = new TreeSearchImpl();
    }

    @Test
    @DisplayName("전위순회 검사")
    void preOrderTest() {
        //given
        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(8);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(6);

        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);

        //when
        search.preOrder(root);
        String result = search.getStore().toString();

        //then
        Assertions.assertEquals(result, "[10, 9, 7, 6, 8]");
    }

    @Test
    @DisplayName("중위순회 검사")
    void inOrderTest() {
        //given
        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(8);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(6);

        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);

        //when
        search.inOrder(root);
        String result = search.getStore().toString();

        //then
        Assertions.assertEquals(result, "[7, 9, 6, 10, 8]");
    }

    @Test
    @DisplayName("후위순회 검사")
    void postOrderTest() {
        //given
        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(8);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(6);

        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);

        //when
        search.postOrder(root);
        String result = search.getStore().toString();

        //then
        Assertions.assertEquals(result, "[7, 6, 9, 8, 10]");
    }
}
