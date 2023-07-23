class BinaryTree3{
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

    BinaryTree3(int val){
        root=new Node(val);
    }
    
    public void insertleft(Node l,int val){
        Node newnode=new Node(val);
        l.left=newnode;
    }

    public void insertright(Node r,int val){ 
        Node newnode=new Node(val);
        r.right=newnode;
    }

    public static void preorder(Node root){     //Root - Left - Right...
        if(root!=null){
            System.out.print(" "+root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void inorder(Node root){       //Left - Root - Right...
        if(root!=null){
            inorder(root.left);
            System.out.print(" "+root.data);
            inorder(root.right);
        }
    }

    public static void postorder(Node root){         //Left - Right - Root...
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(" "+root.data);
        }
    }
    public static void main(String args[]){
        BinaryTree3 tree=new BinaryTree3(49);
        tree.insertleft(tree.root,24);
        tree.insertright(tree.root,47);
        tree.insertleft(tree.root.left,05);
        tree.insertright(tree.root.left,11);
        tree.insertleft(tree.root.right,03);
        tree.insertright(tree.root.right,02);
        System.out.println("The Inorder Traversal Is : ");
        BinaryTree3.inorder(tree.root);
        System.out.println();

        System.out.println("The preorder Traversal Is : ");
        BinaryTree3.preorder(tree.root);
        System.out.println();
        
        System.out.println("The PostOrder Traversal Is : ");
        BinaryTree3.postorder(tree.root);
        System.out.println();
    }
}
