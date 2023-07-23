class BST_Delete{
    Node root;
    class Node{
        Node left,right;
        int key;
        Node(int val){
            key=val;
            left=right=null;
        }
    }

        BST_Delete(){
            root=null;
        }

        BST_Delete(int val){
            root=new Node(val);
        }   

        public void insert(int val){
            insert(root,val);
        }

        public Node insert(Node root,int val){
            if(root==null)
                return new Node(val);
            if(val<root.key)
                root.left=insert(root.left,val);
            else
                root.right=insert(root.right,val);
            return root;
        }

        public Node search(Node root,int val){
            if(root==null||root.key==val)
                return root;
            if(val<root.key)
                return search(root.left,val);
            else
                return search(root.right,val);
           
        }
        
        public Node delete(Node root,int val){
            if(val<root.key)
            root.left=delete(root.left,val);
            else if(val>root.key)
            root.right=delete(root.right,val);
            else{
                if(root.left==null) //The Node Have One Or No Childs...
                    return root.right;
                else if(root.right==null) //The Node Have One Or No Childs...
                    return root.left;
                root.key=min(root.right);  //root.key=55 root.right is define the current right position.Then Copy The Value In Deleted Node
                root.right=delete(root.right,root.key);   //It Is Use To Delete The Current Small value
            }
            return root;
        }
        public int min(Node root){
            int minval=root.key;
             System.out.print("MIn Values : "+minval);
            while(root.left!=null){
                minval=root.left.key;
                root=root.left;
                System.out.print("MIn Values : "+minval);
                System.out.println();

            }
            return minval;
        }
        public void inorder(Node root){
            if(root!=null){
                inorder(root.left);
                System.out.print(" "+root.key);
                inorder(root.right);
            }
        }
    public static void main(String args[]){
        BST_Delete tree=new BST_Delete(50);
        tree.insert(tree.root,40);
        tree.insert(60);
        tree.insert(30);
        tree.insert(45);
        tree.insert(55);
        tree.insert(80);
        
        System.out.println("The Tree Is Inorder Traversal : ");
        tree.inorder(tree.root);
        System.out.println();
        
        if(tree.search(tree.root,45)==null)
            System.out.println("The Node Is Not Found In The Tree");
        else
            System.out.println("The Node Is Found In The Tree");
        
        tree.delete(tree.root,60);

        System.out.println("The Tree Is Inorder Traversal : ");
        tree.inorder(tree.root);
        System.out.println();

    }
}
