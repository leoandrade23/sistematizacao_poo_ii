import java.util.Objects;

/**
 * Classe ContactList
 * <p>
 * Implementa a lista encadeada para gerenciar os contatos, com métodos para adicionar, buscar, remover e listar contatos.
 */
public class ContactList {

    protected Node head;

    public ContactList() {
        this.head = null;
    }

    /**
     * Método para adicionar um contato.
     *
     * @param contact Contato a ser adicionado
     */
    public void addContact(Contact contact) {
        var node = new Node(contact);

        if (Objects.isNull(this.head)) {
            this.head = node;

        } else {
            var current = this.head;

            while (Objects.nonNull(current.getNext())) {
                current = current.getNext();
            }

            current.setNext(node);
        }
    }

    /**
     * Método para buscar um contato
     *
     * @param nameOrPhone Nome ou Número do Contato
     * @return Contato encontrado
     */
    public Contact searchContact(String nameOrPhone) {
        var current = this.head;

        while (Objects.nonNull(current)) {
            if (current.getContact().getName().equalsIgnoreCase(nameOrPhone) ||
                    current.getContact().getPhoneNumber().equalsIgnoreCase(nameOrPhone)) {
                return current.getContact();
            }

            current = current.getNext();
        }

        return null;
    }

    /**
     * Método para remover um contato
     *
     * @param nameOrPhone Nome ou Número do Contato
     */
    public void removeContact(String nameOrPhone) {
        if (Objects.isNull(this.head)) return;

        if (this.head.getContact().getName().equalsIgnoreCase(nameOrPhone) ||
                this.head.getContact().getPhoneNumber().equalsIgnoreCase(nameOrPhone)) {

            head = this.head.getNext();
            return;
        }

        var current = this.head;
        while (Objects.nonNull(current.getNext())) {
            if (current.getNext().getContact().getName().equalsIgnoreCase(nameOrPhone) ||
                    current.getNext().getContact().getPhoneNumber().equalsIgnoreCase(nameOrPhone)) {

                current.setNext(current.getNext().getNext());
                return;
            }

            current = current.getNext();
        }
    }

    /**
     * Método para Listar Contatos
     */
    public void listContacts() {
        var current = head;

        while (Objects.nonNull(current)) {
            System.out.println(current.getContact());

            current = current.getNext();
        }
    }

}
