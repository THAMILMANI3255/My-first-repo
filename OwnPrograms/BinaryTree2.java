class BinaryTree2{
    Node root;
    class Node{
        Node left,right;
        int data;
        Node(int val){
            data=val;
            left=null;
            right=null;
        }       
    }
    BinaryTree2(int val){
        root=new Node(val);
    }
    public void insertright(Node r,int val){
        Node newnode=new Node(val);
        r.right=newnode;
    }
    public void insertleft(Node l,int val){
        Node newnode=new Node(val);
        l.left=newnode;
    }
    public static void preorder(Node root){
        if(root!=null){
            System.out.print(" "+root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(" "+root.data);
        }
    }

    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(" "+root.data);
            inorder(root.right);
        }
    }
    
    public static void main(String args[]){
        BinaryTree2 tree=new BinaryTree2(10);
        tree.insertleft(tree.root,5);
        tree.insertright(tree.root,15);
        tree.insertleft(tree.root.left,3);
        tree.insertright(tree.root.left,8);
        tree.insertleft(tree.root.right,12);
        System.out.println("The PreOrder Traversal is : ");
        BinaryTree2.preorder(tree.root);
        System.out.println();
        System.out.println("The InOrder Traversal is : ");
        BinaryTree2.inorder(tree.root);
        System.out.println();
        System.out.println("The PostOrder Traversal is : ");
        BinaryTree2.postorder(tree.root);
    }
}
