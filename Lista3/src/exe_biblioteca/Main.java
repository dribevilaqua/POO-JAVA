package exe_biblioteca;

public class Main {

    public static void main(String[] args) {

        // Criando livros com ID

        Book livro1 = new Book(1, "Admirável Mundo Novo", "Aldous Huxley", 1932);

        Book livro2 = new Book(2, "O Guia do Mochileiro das Galáxias", "Douglas Adams", 1979);

        Book livro3 = new Book(3, "1984", "George Orwell", 1949);

        Book livro4 = new Book(4, "A Revolução dos Bichos", "George Orwell", 1945);

        Book livro5 = new Book(5, "O Senhor das Moscas", "William Golding", 1954);

        Book livro6 = new Book(6, "O Príncipe", "Nicolau Maquiavel", 1532);

        // Criando usuário

        LibraryUser user1 = new LibraryUser(1, "Fábio");

        // Adicionando empréstimos (limitado a 5)

        user1.addLoanItem(1, 30, livro1);

        user1.addLoanItem(2, 15, livro2);

        user1.addLoanItem(3, 20, livro3);

        user1.addLoanItem(4, 5, livro4);

        user1.addLoanItem(5, 10, livro5);

        user1.addLoanItem(6, 30, livro6); // este não vai ser adicionado (limite 5)

        // Mostrando informações do usuário

        System.out.println(user1.toString());

        user1.ListBooks();

        // Removendo um livro pelo ID

        user1.removeLoanItem(3); // remove "1984"

        // Mostrando novamente

        System.out.println(user1.toString());

        // Total de dias

        System.out.println("Total de dias emprestados: " + user1.totalBorrowed());

        // Limpando todos os empréstimos

        user1.clearLoan();

        System.out.println((user1.isEmpty() ? "A lista está vazia" : "A lista não está vazia"));

    }

}

