class Bst{
 Node root = null;

    public void add(int d){
        Node newNode = new Node(d);
        if(root == null){
            root = newNode;
            return;
        }

        Node temp = root;
        while(true){
            if(d>temp.data){
                if(temp.rNode == null){
                    temp.rNode = newNode;
                    return;
                }
                temp = temp.rNode;
            }else{
                if(temp.lNode == null){
                    temp.lNode = newNode;
                    return;
                }
                temp = temp.lNode;
            }
        }
    }

    // inorder bst traversal
    public void inOrder(Node n){
        if(n == null){
            return;
        }
        inOrder(n.lNode);
        System.out.println(n.data);
        inOrder(n.rNode);
    }

    // pre order bst traversal 
    public void preOrder(Node n){
        if(n == null){
            return;
        }
        System.out.println(n.data);
        preOrder(n.lNode);
        preOrder(n.rNode);
    }

    // postorder bst traversal
    public void postOrder(Node n){
        if(n == null){
            return;
        }
        postOrder(n.lNode);
        postOrder(n.rNode);
        System.out.println(n.data);
    }

    public static void main(String[] args) {
        Bst b = new Bst();
        b.add(7);
        b.add(88);
        b.add(12);
        b.add(5);
        b.add(69);
        // b.add(8);
        // b.add(111);
        // b.add(1);
        // b.add(6);
        Node temp = b.root;
        System.out.println("INorder tree traversal ");
        b.inOrder(temp);
        System.out.println("pre order tree traversal ");
        b.preOrder(temp);
        System.out.println("post order bst traversal");
        b.postOrder(temp);
    }
}