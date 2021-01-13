import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Test;

public class TreeTest {

    @Test
    void test() {
        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(8);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(6);

        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);

        TreeSearch.preOrder(root);
    }
}
