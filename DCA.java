package DCA;
/*
 * This class determines the deepest common ancestor of two given nodes in a 
 * BST. The deepest common ancestor is defined between two nodes a and b as the
 * deepest node in the tree that has both a and b as descendants. A node may be a
 * descendant of itself.
 *
 * The running time complexity of this program is O(h) given in the name of the 
 * problem we are determining the 'deepest' common ancestor, which is determined
 * by the height. Nonetheless in the worst case we would need to percolate to the
 * bottomost sub-tree of the BST to find the DCA.
 */
/*
 * @author Paola Jiron
 */

/* Class to define a Node */
class Node
{

    int val;
    Node left;
    Node right;

    // constructor with int value passed ( a node of int type )
    Node(int x)
    {
        val = x;
    }
}

public class DCA
{

    public Node DCA(Node root, Node a, Node b)
    {

        // if the BST is null, return null
        if (root == null)
        {
            return null;
        }
        // if the values a and b are greater than the root,
        // DCA is in right sub-tree
        if (root.val < a.val && root.val < b.val)
        {
            return DCA(root.right, a, b);
        }
        // otherwise, the values a and b are smaller than the root,
        // then DCA is in left sub-tree
        if (root.val > a.val && root.val > b.val)
        {
            return DCA(root.left, a, b);

        }
        return root; // alas return DCA
    }
}
