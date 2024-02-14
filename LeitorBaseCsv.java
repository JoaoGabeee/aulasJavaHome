import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class LeitorBaseCsv {

    public static void main(String[] args) {

        String[] opcaoSair = {"Ok", "Sair"};
        String[] opcaoConfirmar = {"Sim", "Não"};
        String linha = "";


        try (BufferedReader leitorCsv = new BufferedReader(new FileReader("data.csv"))) {

            while ((linha = leitorCsv.readLine()) != null) {

                String[] colunas = linha.split(";");

                linha = colunas[0] + " - " + colunas[1] + " - " + colunas[2] + " - " + colunas[3] + " - " + colunas[4];
                var opcao = JOptionPane.showOptionDialog(
                        null,
                        linha,
                        null,
                        0,
                        1,
                        null,
                        opcaoSair,
                        opcaoSair[0]);

                if (opcao != 0) {
                    opcao = JOptionPane.showOptionDialog(
                            null,
                            "Tem cereteza q deseja sair?",
                            null,
                            0,
                            1,
                            null,
                            opcaoConfirmar,
                            opcaoConfirmar[0]
                    );
                    if (opcao == 0) {
                        JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso programa!");
                        break;
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro de leitura: " + e.getMessage());
        }

    }
}
