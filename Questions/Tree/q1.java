//count total node of tree

class q1
{
    public static void main(String[] args) {
            
        //binary tree class obj
        binarytree b = new binarytree();

        //tress values
        int a[] = new int[]{10,20,30,-1,-1,40,-1,-1,50,60,-1,-1,70,-1,-1};

        //create tree
        Node root = b.create(a);

        //total root of tree
        b.count(root);
        System.out.println("Total root of tree : " + b.counter);
    }
}



//node class structure
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


class binarytree
{
    int index;
    binarytree()
    {
        index = -1;
    }
    
    Node create(int[] a)
    {
        index++;
        Node root = null;
        
        if(a[index] == -1)
        {
            return null;
        }
        else
        {
            root = new Node(a[index]);
            root.left = create(a);
            root.right = create(a);
        }

        return root;
    }


    //count node method
    int counter = 0;
    void count(Node  root)
    {
        if(root == null)
        {
            return;
        }
        else
        {
            counter++;
            count(root.left);
            count(root.right);
        }
    }

}