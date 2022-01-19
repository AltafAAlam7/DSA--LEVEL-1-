public static void iterativePrePostInTraversal(Node node) {
    // write your code here
    Pair root = new Pair(node,-1);
    Stack<Pair> st = new Stack<>();
    st.push(root);
    String preorder ="";
    String postorder= "";
    String Inorder="";
    while(st.size()>0)
    {
        Pair temp = st.peek();
        
        if(temp.state==-1)
        {
            preorder+=temp.node.data+" ";

            if(temp.node.left!=null)
            {
                Pair lp = new Pair(temp.node.left,-1);
                st.push(lp);
            }
        }
        else if(temp.state==0)
        {
            Inorder+=temp.node.data+" ";
            if(temp.node.right!=null)
            {
                Pair rp = new Pair(temp.node.right,-1);
                st.push(rp);
            }
        }
        else if(temp.state==1)
        {
            postorder+=temp.node.data+" ";
            st.pop();

        }
    temp.state++;
        
    }
    System.out.println(preorder);
    System.out.println(Inorder);
    System.out.println(postorder);
  }