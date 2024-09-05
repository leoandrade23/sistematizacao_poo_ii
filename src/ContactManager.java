import java.util.Objects;
import java.util.Scanner;

/**
 * Classe Service para gerenciar os Contatos
 */
public class ContactManager {

    protected ContactList contactList;

    public ContactManager() {
        this.contactList = new ContactList();
    }

    /**
     * Método de entrada ‘main’;
     * @param args args
     */
    public static void main(String[] args) {
        var contactManager = new ContactManager();
        contactManager.run();
    }

    /**
     * Método para executar o ContactManager
     */
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("==== Contact List ======");
            System.out.println("| 1. Adicionar contato |");
            System.out.println("| 2. Buscar contato    |");
            System.out.println("| 3. Remover contato   |");
            System.out.println("| 4. Listar contatos   |");
            System.out.println("| 5. Sair              |");
            System.out.println("========================");
            System.out.print("Digite a sua opção: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    searchContact(scanner);
                    break;
                case 3:
                    removeContact(scanner);
                    break;
                case 4:
                    listContacts();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    /**
     * Método para adicionar um contato
     *
     * @param scanner Entrada do usuário
     */
    protected void addContact(Scanner scanner) {
        System.out.print("Digite o nome do contato: ");
        String name = scanner.next();

        System.out.print("Digite o número de telefone do contato: ");
        String phoneNumber = scanner.next();

        System.out.print("Digite o e-mail do contato: ");
        String email = scanner.next();

        Contact contact = new Contact(name, phoneNumber, email);
        contactList.addContact(contact);

        System.out.println("Contato adicionado com sucesso!");
    }

    /**
     * Método para buscar um contato por nome ou número de telefone
     *
     * @param scanner Entrada do usuário
     */
    protected void searchContact(Scanner scanner) {
        System.out.print("Digite o nome ou número de telefone do contato: ");
        String nameOrPhone = scanner.next();

        Contact contact = contactList.searchContact(nameOrPhone);

        if (Objects.nonNull(contact)) {
            System.out.println("Contato recuperado: ");
            System.out.println("Nome: " + contact.getName());
            System.out.println("Número Telefone: " + contact.getPhoneNumber());
            System.out.println("E-mail: " + contact.getEmail());
        } else {
            System.out.println("Contato não encontrado");
        }
    }

    /**
     * Método para remover um contato por nome ou número de telefone
     *
     * @param scanner Entrada do usuário
     */
    protected void removeContact(Scanner scanner) {
        System.out.print("Digite o nome ou número de telefone do contato: ");
        String nameOrPhone = scanner.next();

        contactList.removeContact(nameOrPhone);
        System.out.println("Contato removido com sucesso!");
    }

    /**
     * Método para listar os contatos
     */
    protected void listContacts() {
        contactList.listContacts();
    }
}