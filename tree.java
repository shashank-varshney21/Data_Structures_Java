public class tree {
    
    // making nodes of the tree

    static class node 
    {
        int data;
        node left;
        node right;

        public node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    } 
     
    // Creating the tree from given nodes[] array

    public static class BinaryTree
    {
        static int idx = -1;
    public static node createTree(int nodes[])
    {
       idx++;
       if(nodes[idx] == -1)
       {
        return null;
       }

       node newNode = new node(nodes[idx]);
       newNode.left = createTree(nodes);
       newNode.right = createTree(nodes);

       return newNode;
    }
    }
    public static void main(String[] args)
    {
       int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       BinaryTree Tree = new BinaryTree();
       node root = Tree.createTree(nodes);

       System.out.println(root.data);
    }
}

/**
 *  Step 1 --> Declare a class/datatype node which contains
 *             a> int Root (data)
 *             b> node left  
 *             c> node right
 * 
 *  step 2 --> In main function, we have the array of nodes.
 *  
 *  step 3 --> Create a static class BinaryTree which contains
 *             a> static int idx with value -1.
 *             b> a method name createTree(int nodes[]) 
 * 
 *  step 4 --> In createTree method, increase the value of idx by 1, check
 *             If(nodes array at idx is null), if yes then return null
 *             else
 *             call node newNode = new node(node[idx])
 *             call createTree(node[idx].left) and return this node to newNode.left
 *             call createTree(node[idx].right) and return this node to node.right
 *             return newNode
 * 
 * 
 */
