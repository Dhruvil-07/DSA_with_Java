//binary tree creation and travels
//binary tree creation by static value using links
//inorder , preorder , postorder travels

import java.util.LinkedList;
import java.util.Queue;

class binarytree2 
{
    public static void main(String[] args) {
        
        //tress values
        int a[] = new int[]{10,20,30,-1,-1,40,-1,-1,50,60,-1,-1,70,-1,-1};

        //binary tree object
        binarytree b = new binarytree();

        //creatio of binar tree
        Node  root = b.create(a);

        //print rooot node
        System.out.println(root.data);

        //inorder tavels 
        System.out.println();
        System.out.println("Inordder travels : ");
        b.inorder(root);
       

        //pre order travels 
        System.out.println();
        System.out.println("Preorder Travels  : ");
        b.preorder(root);

        
        //post order Travels
        System.out.println();
        System.out.println("Post oreder Travels : ");
        b.postorder(root);


        //level order Travels
        System.out.println();
        System.out.println("level oreder Travels : ");
        b.levelorder(root);
    }
}



//Node class structure
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right= null;
    }
}



//binary tree sructure class
class binarytree
{
    
    int index;

    binarytree()
    {
        index = -1;
    }
        
    //tree creation
    Node create(int[] a)
    {
        //increase index for next value
        index++;

        //create null node
        Node root = null;

        if(a[index] == -1)
        {
            return null;
        }
        else
        {
            //create node
            root = new Node(a[index]);

            //create left child
            root.left = create(a);
        
            //create right child
            root.right = create(a);
        }
        return root;
    }


    //inorder travels
    void inorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        else
        {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    //preorder travels
    void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        else
        {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
           
        }
    } 

    //postorder travles
    void postorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        else
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }


    
    //level order travels
    void levelorder(Node root)
    {
        //queue for store node to level order travels
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) 
        {
            Node currentNode = q.remove();
            
            if(currentNode == null)
            {
                System.out.println();
                
                if(!q.isEmpty())
                {
                    q.add(null);
                }
                else
                {
                    break;
                }
            }
            else
            {
                System.out.print(currentNode.data + " ");

                if(currentNode.left != null)
                {
                    q.add(currentNode.left);
                }

                if(currentNode.right != null)
                {
                    q.add(currentNode.right);
                }
              
            }
        }
    }

}
