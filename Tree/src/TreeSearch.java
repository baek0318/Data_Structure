import java.util.ArrayList;

/**
 * Tree를 탐색할때에 필요한 메서드들을 작성한 인터페이스 입니다
 */
public interface TreeSearch {

    /**
     * 전위 순회를 할때 사용되는 메서드
     * @param node 최상위 root 노드이다
     */
    public void preOrder(TreeNode node);

    /**
     * 중위 순회를 할때 사용되는 메서드
     * @param node 최상위 root 노드
     */
    public void inOrder(TreeNode node);

    /**
     * 후위 순회를 할때 사용되는 메서드
     * @param node 최상위 root 노드
     */
    public void postOrder(TreeNode node);


}
