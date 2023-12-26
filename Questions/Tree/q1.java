//count total node of tree
//count total of all nodes data

class q1
{
    public static void main(String[] args) {
            
        //binary tree class obj
        binarytree b = new binarytree();

        //tress values
        int a[] = new int[]{10,20,30,-1,-1,40,-1,-1,50,60,-1,-1,70,-1,-1};

        //create tree
        Node root = b.create(a);

        //total root of tree and total data
        b.count(root);
        System.out.println("Total root of tree : " + b.counter);
        System.out.println("Total sum of trees nodes : "+ b.sum);
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
    int counter = 0; //for count nodes
    int sum = 0;  //for count nodes data
    void count(Node  root)
    {
        if(root == null)
        {
            return;
        }
        else
        {
            counter++;
            sum += root.data;
            count(root.left);
            count(root.right);
        }
    }

}