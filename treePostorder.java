public class treePostorder {
    public static class node{
        int data;
        node left;
        node right;

        public node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public static class BinaryTree {

            static int idx = -1;
            public static node buildTree(int nodes[])
            {
                idx++;
                if(nodes[idx]==-1)
                {
                  return null;
                }

                node newNode = new node(nodes[idx]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);

                return newNode;

            }
        }

        public static void postorderTraversal(node root)
        {
            if(root == null)
            {
                return;
            }
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
        public static void main(String[] args)
        {
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree tree = new BinaryTree();
            node root = tree.buildTree(nodes);

            postorderTraversal(root);

        }

    }
}

/** PostOrder traversal --> a)Left Subtree
 *                          b)Right Subtree
 *                          c)Root Node
 * 
 * Time Complexity for Postorder Traversal is also --> O(n)
 * 
 * Hint to learn code
 * 
 * in postorder, Root Node is on 3rd line
 * Hence    System.out.print vali line will also on 3rd sequence
 * 
 *          Same trick applies for preorder and inorder traversal
 * 
 */
