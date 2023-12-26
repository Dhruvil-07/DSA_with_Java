//binary tree creation and travels
//binary tree creation by user input using links
//inorder , preorder , postorder travels

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BinaryTreeStructure
{
    public static void main(String[] args) {
        

        //scanner class obj
        Scanner sc = new Scanner(System.in);

        //instrucion
        System.out.println("Welcome to binary tree programe....");
        System.out.println("if you want to enter child , enter data");
        System.out.println("if you dont want to enter child , enter -1");
        System.out.println();

        //BinaryTree class obj 
        BinaryTree b = new BinaryTree();

        //create binary tree
        Node root = b.create();

        //print main root nnode of tree
        //System.out.println(root.data);

        //var for user choice and looping 
        int choice;
        boolean check = true;

        while(check)
        {
            System.out.println();
            System.out.println("1. Inorder Travels...");
            System.out.println("2. Preorder travels...");
            System.out.println("3. Post orderr travels...");
            System.out.println("4. Level orderr travels...");
            System.out.println("5. Exit...");
            System.out.println();

            System.out.println("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: System.out.println("Inorder Travels :- ");
                        b.inorder(root);
                        System.out.println();
                        break;

                case 2 : System.out.println("Preorder Travels...");
                         b.preorder(root);
                         System.out.println();
                         break;

                case 3 : System.out.println("Postorder Travels...");
                         b.postorder(root);
                         System.out.println();
                         break;
                    
                case 4 : System.out.println("Levelorder Travels...");
                         b.levelorder(root);
                         System.out.println();
                         break;


                case 5 : check = false;
                         break;

                default : System.out.println("Invalid Choice....");
            }
        }
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



    //level order travels
    void levelorder(Node root)
    {
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty())
        {
            Node currentnode = q.remove();
            
            if(currentnode == null)
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
                System.out.print(currentnode.data + " ");

                if(currentnode.left != null)
                {
                    q.add(currentnode.left);
                }

                if(currentnode.right != null)
                {
                    q.add(currentnode.right);
                }
            }
        }
    }

}
