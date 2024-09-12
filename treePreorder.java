public class treePreorder {
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

        public static void preorderTraversal(node root)
        {
            if(root == null)
            {
                return;
            }
            System.out.println(root.data);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        public static void main(String[] args)
        {
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree tree = new BinaryTree();
            node root = tree.buildTree(nodes);

            preorderTraversal(root);

        }

    }
}

/**
 * Pre-order traversal = 1>Root
 *                       2>Left Subtree
 *                       3>Right Subtree
 * 
 * Time Comlexity of Preorder traversal is O(n)
 */
 