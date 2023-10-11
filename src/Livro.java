import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Livro {
    Scanner ler = new Scanner(System.in);
    public String livro;
    public String livraria;
    public String titulo;
    public Autor autor;
    public float preco;
    public LocalDate dataLancamento;
    ArrayList<Livro> listaLivro = new ArrayList<>();

/*
    public String CadastrarLivro(String livro){


        Livro novoLivro = new Livro();
        Autor novoAutor = new Autor();

        System.out.print("Titulo: ");
        novoLivro.titulo = ler.nextLine();

        System.out.print("Autor: ");
        novoAutor.nome = ler.nextLine();

        System.out.print("Preco: R$");
        preco = ler.nextFloat();

        System.out.print("Data de Lancamento: (dd/mm/aaaa)");
        dataLancamento = LocalDate.parse(ler.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Period anosLivro = Period.between(novoLivro.dataLancamento, LocalDate.now());

        if(anosLivro.getYears() > 5){
            System.out.println("Livro valido!");
        }else{
            System.out.println("Livro invalido!");
        }

        ler.nextLine();
        System.out.println("Cadastro finalizado!");

        novoLivro.autor = novoAutor;

        listaLivro.add(novoLivro);

        return null;
    }

 */

}
