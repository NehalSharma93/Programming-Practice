/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
/*
    Create a stack. wheneve you encounter child element, push next to the stack. 
    If your curr becomes null but stack is not empty, thn link curr with stack pop. 
    In each iteration do curr = curr.next;

*/
class MultilevelFlattenLinkedList {
    public Node flatten(Node head){

        if(head == null)
            return head;

        Stack<Node> stack = new Stack<Node>();

        Node curr = head;

        while(curr != null){
            if(curr.child != null){
                if(curr.next != null)
                    stack.push(curr.next);

                curr.next = curr.child;

                curr.child.prev = curr;

                curr.child = null;
            }
            else if(curr.next == null && !stack.isEmpty()){

                Node n = stack.pop();

                curr.next = n;

                n.prev = curr;

            }

            curr = curr.next;

        }
        return head;
    }
}