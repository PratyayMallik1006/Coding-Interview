import org.w3c.dom.Node;

/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
//T:O(2n)=T:O(n)
//S:O(1)
class ListFlatten {
    public Node flatten(Node head) {
        if(head==null) return head; //null
        
        Node currentNode=head;
        while(currentNode!=null){
            if(currentNode.child==null){
                currentNode=currentNode.next;
            }
            else{
                Node tail=currentNode.child;
                while(tail.next != null){
                    tail=tail.next;
                }
                tail.next=currentNode.next;
                
                if(currentNode.next!=null){
                    currentNode.next.prev=tail;
                }
                
                currentNode.next=currentNode.child;
                currentNode.child.prev=currentNode;
                currentNode.child=null;
            }
        }
        return head;
    }
}