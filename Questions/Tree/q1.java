//count total node of tree
//count total of all nodes data
//count hight of tree
//how many leaf node in tree

import java.util.LinkedList;
import java.util.Queue;

class q1
{
    public static void main(String[] args) {
            
        //binary tree class obj
        binarytree b = new binarytree();

        //tress values
        int a[] = new int[]{10,20,30,-1,-1,40,-1,-1,50,60,-1,-1,70,-1,80,90,-1,-1,-1};

        //create tree
        Node root = b.create(a);

        //total root of tree and total data
        b.count(root);
        System.out.println("Total root of tree : " + b.counter);
        System.out.println("Total sum of trees nodes : "+ b.sum);
        System.out.println("Total sum of trees nodes : " + b.sum(root));

        //total total  level of tree / hight of tree
        b.hight(root);
        System.out.println("hight of tree : " + b.level);

        //hight of tree by second approch
        int tree_hight = b.tree_hight(root);
        System.out.println("tree hight : " + tree_hight);
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


    //second approch to get some of all nodos of tree
    int total = 0;
    int sum(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        else
        {
            total = root.data + sum(root.left) + sum(root.right);
        }
        return total;
    }


    //level count
    int level = 0;
    //calc hight of tree
    void hight(Node root)
    {
        
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty())
        {
            Node currentnode = q.remove();

            if(currentnode == null)
            {
                level++;
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else
            {
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



    //find hight using recursion
    int tree_hight(Node root)
    {
        if(root  == null)
        {
            return 0;
        }

        int left = tree_hight(root.left);
        int right = tree_hight(root.right);
        int myhight = Math.max(left, right) + 1;

        return myhight;
    }
}