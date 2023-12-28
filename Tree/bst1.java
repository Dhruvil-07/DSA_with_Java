class bst1 
{
    public static void main(String[] args) 
    {
        //object of binary sertch tree class
        binaryserchtree bst = new binaryserchtree();

        //values for binary serch tree
        int values[] = {10,12,8,6,15,7,11};

        //root node of  tree
        Node root = null;

        //pass values one by one and create binary serch tree
        ///every time store main root node value in root
        for(int i = 0 ; i<values.length ; i++)
        {
            root = bst.create(root, values[i]);
        }


        //inorder travel
        //here if we will get our result in assecnding order , means that our bst 
        //create successfully
         bst.inorder(root);

         System.out.println();

         //inorder travel
        //here if we will get our result in decending order , means that our bst 
        //create successfully
        bst.converse_inorder(root);


    }
}

//structureof node class
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


class binaryserchtree
{
    //default constructre
    binaryserchtree()
    {}


    //binary serch tree creation method
    Node create(Node root , int val)
    {
        if(root == null)
        {
          root = new Node(val);
          return root;
        }


        if(root.data > val)
        {
            root.left = create(root.left, val);
        }
        else
        {
            root.right = create(root.right, val);
        }

        return root;
    }



    //inorder travels 
    //in this travel you get assecnding order of your data
    void inorder(Node root)
    {
        if(root == null)
        {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }



     //inorder travels 
    //in this travel you get assecnding order of your data
    void converse_inorder(Node root)
    {
        if(root == null)
        {
            return;
        }

        converse_inorder(root.right);
        System.out.print(root.data + " ");
        converse_inorder(root.left);
    }

}
