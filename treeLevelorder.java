import java.util.*;

public class treeLevelorder {
    
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

    public static void levelorderTraversal(node root)
    {
        if(root == null)  // Return null if tree doesn't exist
        {
            return;
        }

        Queue<node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty())
        {
            node curr = q.remove();
            if(curr==null)
            {
              System.out.println(); //printing next line whenever null comes in the queue
              if(!q.isEmpty())      //check if q is empty then break the process
              {
                break;
              }  
              else                  //If not empty then add null into the queue
              {
                q.offer(null);
              }
            }
            else
            {
                System.out.println(curr.data + " "); // Print the current node
                
                if(curr.left != null)                // Add current's left node to the queue 
                {
                    q.add(curr.left);
                }
                
                if(curr.right != null)               // Add current's right node to the queue
                {
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       BinaryTree Tree = new BinaryTree();
       node root = Tree.createTree(nodes);

        levelorderTraversal(root);
    }

}
