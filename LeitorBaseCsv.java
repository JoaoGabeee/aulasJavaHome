//biblioteca java.io serve para ler os arquivos(é usado apenas alguns metodos dessa biblioteca)
import java.io.*;

//biblioteca para o arrayList
import java.util.ArrayList;

//biblioteca para listas
import java.util.List;

//biblioteca especifica para arrays
import java.util.Arrays;

//biblioteca para caixas de dialogo
import javax.swing.JOptionPane;

//classe
public class LeitorBaseCsv {

    //metodo de execução
    public static void main(String[] args) {

        //objeto para metodo ler
        new LeitorBaseCsv().ler();
    }

    //metodo private pois tem objeto
    private void ler() {
        //lista de strings //regs é uma lista de strings em formato de ArrayList
        List<List<String>> regs = new ArrayList<>();

        //try é como um if, el vai tentar executar oque esta entre as chaves caso haja uma exeção ele ira executar o catch, q seria o else do if
        //BufferedReador é para criar o objeto br q ira ler os arquivos, o FileRrador serve para mostrar oq será lido, entre as apas deve estar o nome do arquivo
        try (BufferedReader br = new BufferedReader(new FileReader("Data.csv"))) {

            //variavel linha para imprimir na tela
            String linha = "";

            //a instrução br.readLine significa q ele esta lendo uma linha e mandando para a String linha, o != null, quer dizer q se oq ele esta fazrndo, for diferente de nulo, ou seja, conter algo, ele pode executar as proximas linhas do código
            while ((linha = br.readLine()) != null) {

                //aqui temos a criação de um array chamado colunas, o linha.split(";") serve para localizar os ; no aquivo e saber ate onde vai cada coluna digamos assim
                String[] colunas = linha.split(";");

                //aqui o arrayList regs esta recebendo o array colunas
                regs.add(Arrays.asList(colunas));

                //aqui imprime na tela
                JOptionPane.showMessageDialog(null, colunas[0] + " - " + colunas[1] + " - " + colunas[2] + " - " + colunas[3]);
            }
        }
        //catch é para caso o metodo try falhar, ele ira mostrar uma mensagem de erro (e é uma variavel)
        catch (IOException e) {

            //e.getMessage ira mostrar onde foi o erro
            JOptionPane.showMessageDialog(null, "Erro de leitura: " + e.getMessage());
        }
    }
}
