//binary tree creation and travels
//binary tree creation by user input using links
//inorder , preorder , postorder travels

import java.util.Scanner;

class BinaryTreeStructure
{
    public static void main(String[] args) {
        
        System.out.println("Welcome to binary tree programe....");
        System.out.println("if you want to enter child , enter data");
        System.out.println("if you dont want to enter child , enter -1");

        //BinaryTree class obj 
        BinaryTree b = new BinaryTree();

        //create binary tree
        Node root = b.create();

        //print main root nnode of tree
        System.out.println(root.data);

        //inorer travels
        b.inorder(root);

        System.out.println();

        //preorder travels
        b.preorder(root);

        System.out.println();

        //post order travels
        b.postorder(root);
    }
}

 //tree's node structure
  class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }



///binary tree class
class BinaryTree
{
    
    //Scanner class object
    Scanner sc = new Scanner(System.in);

    //tree creation
    Node create()
    {
        //cerate null node
        Node root = null;
        
        //get input for user
        System.out.println("Enter data : ");
        int data = sc.nextInt();

        //if user enter -1  , go back
        if(data == -1)
        {
            return null;
        }
        else
        {
            //if user enter data then create node 
            root = new Node(data);

            //ask for  left child
            System.out.println("Enter value for left child of : " + root.data);
            root.left = create();

            //ask for right child
            System.out.println("Enter value for right child of root : " + root.data);
            root.right = create();
        }
        return root;
    }



    //inorder travel
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


    //preorder travel
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


    //post order travell
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

}
