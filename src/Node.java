/**
 * Classe Node
 *
 * Representa um nó na lista encadeada, contendo um Contact e uma referência para o próximo nó.
 */
public class Node {

    protected Contact contact;
    protected Node next;

    public Node(Contact contact) {
        this.contact = contact;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
