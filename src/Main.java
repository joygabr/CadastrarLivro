import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.Period;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<Livro> listaLivro = new ArrayList<>();

        System.out.println("Cadastrar Livros");

        String opcao;

        do{
            System.out.println("Selecione: 1 - Cadastrar / 2 - Listar Livros / 0 - Sair");
            opcao = ler.nextLine();

            switch (opcao){
                case "1":
                    Livro novoLivro = new Livro();
                    Autor novoAutor = new Autor();

                    System.out.print("Titulo: ");
                    novoLivro.titulo = ler.nextLine();

                    System.out.print("Autor: ");
                    novoAutor.nome = ler.nextLine();

                    System.out.print("Local de Nascimento: ");
                    novoAutor.localNasc = ler.nextLine();

                    System.out.print("Preco: R$");
                    novoLivro.preco = ler.nextFloat();

                    System.out.print("Data de Lancamento: (dd/mm/aaaa)");
                    novoLivro.dataLancamento = LocalDate.parse(ler.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    Period anosLivro = Period.between(novoLivro.dataLancamento, LocalDate.now());

                    if(anosLivro.getYears() > 5){
                        System.out.println("Livro valido!");
                    }else{
                        System.out.println("Livro invalido!");
                        break;
                    }

                    ler.nextLine();
                    System.out.println("Cadastro finalizado!");

                    novoLivro.autor = novoAutor;

                    listaLivro.add(novoLivro);

                    break;

                case "2":
                    if(listaLivro.size() > 0){
                        for (Livro cadaLivro : listaLivro) {
                            System.out.println("Titulo: " + cadaLivro.titulo);
                            System.out.println("Autor: " + cadaLivro.autor.nome);
                            System.out.println("Local de Nascimento: " + cadaLivro.autor.localNasc);
                            System.out.println("Preco: R$" + cadaLivro.preco);
                            System.out.println("Data de Lancamento: " + cadaLivro.dataLancamento);
                        }
                    }else{
                        System.out.println("Lista vazia!");
                    }

                    break;

                case "0":
                    System.out.println("opcao 0");
                    break;

                default:
                    System.out.println("Digito invalido!");
                    break;
            }
        }while(!opcao.equals("0"));
    }
}