class BinaryTree{
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
    BinaryTree(int val){
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
    public static void main(String args[]){
        BinaryTree tree=new BinaryTree(5);
        tree.insertleft(tree.root,10);
        tree.insertright(tree.root,15);
        tree.insertleft(tree.root.left,20);
        tree.insertright(tree.root.right,22);
    }
}
