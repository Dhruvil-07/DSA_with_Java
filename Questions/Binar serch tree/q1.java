//question for binary serach tree

//1. print only those node , which are coming in entered range value


class q1
{
    public static void main(String[] args) 
    {
        //values for bst 
        int a[] = {8,5,10,6,11,3,4,1,14};

        //BST class obj;
        BST b = new BST();

        //main root node of bst 
        Node root = null;

        //create bst
        for(int i = 0 ; i<a.length ; i++)
        {
            root = b.create(root, a[i]);
        } 

        System.out.println();
        b.inorder(root);

        System.out.println();
        
        //Range for fisrt question
        int x = 6 , y = 10;
        b.print_range_nodes(root, x, y);


    }
}

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


class BST
{
    //creation of binary serch tree
    Node create(Node root , int data)
    {
        if(root == null)
        {
            root = new Node(data);
            return root;
        }
        else if(root.data > data)
        {
            root.left = create(root.left, data);
        }
        else
        {
            root.right = create(root.right, data);
        }
        return root;
    }


    //inorder
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


    //first question solution
    void print_range_nodes(Node root , int x , int y)
    {
        if(root == null)
        {
            return;
        }
        else
        {
            print_range_nodes(root.left , x , y);

            if(root.data >= x && root.data <= y)
            {
                System.out.print(root.data + " ");
            }

            print_range_nodes(root.right, x, y);
        }
    }
}

