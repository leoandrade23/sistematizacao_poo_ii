# ContactManager

## Descrição
Projeto de sistematização da disciplina Programação Orientada a Objetos II que consiste em uma aplicação Java que gerencia uma lista de contatos por meio de listas encadeadas.

## Funcionalidades
- Adicionar um contato
- Buscar um contato por meio do nome ou número de telefone
- Remover um contato por meio do nome ou número de telefone
- Listar todos os contatos

## Pré-requisitos
- Java 11 ou superior

## Instalação
1. Clonar o seguinte repositório
```bash
   git clone https://github.com/leoandrade23/sistematizacao_poo_ii.git

Iniciar a classe ContactManager através de seu método main, aparecerá um menu com opções para adicionar, buscar, remover ou listar os contatos, bem como a opção para finalizar a operação.
Utilize os números para acionar uma opção

## Estrutura do Projeto

Contact.java: Classe que representa um contato, armazenando nome, número de telefone e e-mail.

Node.java: Classe que representa um nó na lista encadeada, armazenando um contato e a referência para o próximo nó.

ContactList.java: Classe que gerencia a lista encadeada de contatos, oferecendo métodos para adicionar, buscar, remover e listar contatos.

ContactManager.java: Classe principal que implementa a interface de usuário e controla o fluxo do programa.
