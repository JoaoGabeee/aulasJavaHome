import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class LeitorArquivosCsv {
    public LeitorArquivosCsv() {

        String linha;

        ArrayList<String> lista = new ArrayList<>();

        String[] opcoesDeContinuar = {"Ok", "Voltar", "Mostrar em lista"};

        int numeroLinha = 0;

        try (BufferedReader leitorCsv = new BufferedReader(new FileReader("louvores.csv"))) {

            while ((linha = leitorCsv.readLine()) != null) {
                String[] colunas = linha.split(";");

                if (numeroLinha == 0) {
                    numeroLinha++;
                    continue;
                }

                linha = colunas[0] + " - " + colunas[1];

                lista.add(linha + "\n");

                numeroLinha++;
            }

            for (int i = 0; i < lista.size(); i++) {

                var opcaoDeEscolha = JOptionPane.showOptionDialog(null,
                        lista.get(i),
                        Main.programinha,
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        Icone.iconeAssembleia(),
                        opcoesDeContinuar,
                        opcoesDeContinuar[0]);

                switch (opcaoDeEscolha) {

                    case 0 -> {
                    }
                    case 1 -> {
                        if (i == 0) {
                            i = lista.size() - 2;
                            continue;
                        }
                        i -= 2;
                    }
                    case 2 -> {
                        JOptionPane.showOptionDialog(
                                null,
                                lista,
                                Main.programinha,
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                null,
                                Main.opcaoOk,
                                Main.opcaoOk[0]
                        );
                        return;
                    }
                    default -> {
                        return;
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}