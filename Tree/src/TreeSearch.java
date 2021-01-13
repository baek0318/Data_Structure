/**
 * Tree를 탐색할때에 필요한 메서드들을 작성한 인터페이스 입니다
 */
public interface TreeSearch {
    /**
     * 전위 순회를 할때 사용되는 메서드
     *
     * @param node 최상위 root 노드이다
     */
    static void preOrder(TreeNode node) {
        if(node == null)
            return;

        System.out.println(node.getData());
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    /**
     * 중위 순회를 할때 사용되는 메서드
     * @param node 최상위 root 노드
     */
    static void inOrder(TreeNode node) {
        if(node == null)
            return;

        inOrder(node.getLeft());
        System.out.println(node.getData());
        inOrder(node.getRight());
    }

    /**
     * 후위 순회를 할때 사용되는 메서드
     * @param node 최상위 root 노드
     */
    static void postOrder(TreeNode node) {
        if(node == null)
            return;

        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.println(node.getData());
    }


}
