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

    public static void main(String[] args) {
        Bst b = new Bst();
        b.add(7);
        b.add(88);
        b.add(12);
        b.add(5);
        b.add(69);

    }
}