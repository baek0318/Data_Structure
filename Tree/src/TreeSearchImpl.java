import java.util.ArrayList;
import java.util.List;

public class TreeSearchImpl implements TreeSearch{

    private final ArrayList<Integer> store = new ArrayList<>();

    public void preOrder(TreeNode node) {
        if(node == null)
            return;

        store.add(node.getData());
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    public void inOrder(TreeNode node) {
        if(node == null)
            return;

        inOrder(node.getLeft());
        store.add(node.getData());
        inOrder(node.getRight());
    }

    public void postOrder(TreeNode node) {
        if(node == null)
            return;

        postOrder(node.getLeft());
        postOrder(node.getRight());
        store.add(node.getData());
    }

    List<Integer> getStore() {
        return store;
    }
}
