class AvlTree{
    Node root;
    class Node{
        Node left,right;
        int key;
        int height;
        Node(int val){
            key=val;
            height=0;
            left=right=null;
        }
    }
    AvlTree(){
        root=null;
    }
    AvlTree(int val){
        root=new Node(val);
    }
    public Node insert(Node node,int val){
        if(node==null)
            return new Node(val);
        if(val<node.key)
            node.left=insert(node.left, val);
        else if (val>node.key) 
            node.right=insert(node.right, val);
        else 
            return node;
        node.height=1+max(getheight(node.left),getheight(node.right));
        int balfact=getbalance(node.left,node.right);
        //LL Case...
        if( balfact>1 && val<node.left.key)
            return rightrotate(node);
        //RR Case...
        if( balfact<-1 && val>node.right.key)
            return leftrotate(node);
        //LR Case...
        if( balfact>1 && val>node.left.key){
            node.left=rightrotate(node);
            return leftrotate(node);
        }
        //RL Case...
        if( balfact<-1 && val<node.right.key ){
            node.right=leftrotate(node);
            return rightrotate(node);
        }
        return node;
    }
    public Node rightrotate(Node z){
        Node y=z.left;
        Node t2=y.right;
        y.right=z;
        z.left=t2;
        z.height = 1 + max(getheight(z.left),getheight(z.right));
        y.height = 1 + max(getheight(y.left),getheight(y.right));
        return y;
    }
    public Node leftrotate(Node z){
        Node y=z.right;
        Node t2=y.left;
        y.left=z;
        z.right=t2;
        z.height = 1+ max(getheight(z.left),getheight(z.right));
        y.height = 1+ max(getheight(y.left),getheight(y.right));
        return y;
    }
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public int getheight(Node node){
        if(node==null)
            return -1;
        return node.height;
    }
    public int getbalance(Node left,Node right){
        return getheight(left)-getheight(right);
    }
    public int max(int a,int b){
        return a<b?a:b;
    }
    
    public static void main(String args[]){
        AvlTree tree=new AvlTree(33);
        tree.insert(tree.root,9);
        tree.insert(tree.root,53);
        tree.insert(tree.root,8);        
        tree.insert(tree.root,21);
        tree.insert(tree.root,61);
        tree.insert(tree.root,11);
        tree.inorder(tree.root);
    }
}
