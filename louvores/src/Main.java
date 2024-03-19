import javax.swing.JOptionPane;

public class Main {

    public static String programinha = "Programinha de João";
    public static String[] opcaoConfirmarSaida = {"Sim", "Não"};
    public static String[] opcaoOk = {"Ok"};

    public static void main(String[] args) {

        pararPrograma:
        while (true) {

            String[] funcoes = {"Ver louvores", "Gravar louvores", "Pesquisar louvores"};
            var opcoesDeFuncoes = JOptionPane.showOptionDialog(
                    null,
                    "Seja bem-vindo\nQual função você deseja realizar?",
                    programinha,
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    Icone.iconeAssembleia(),
                    funcoes,
                    funcoes[0]);

            switch (opcoesDeFuncoes) {

                case 0 -> new LeitorArquivosCsv();
                case 1 -> new GravadorArquivosCsv();
                case 2 -> new PesquisarLouvores();
                default -> {
                        opcoesDeFuncoes = JOptionPane.showOptionDialog(
                                null,
                                "Tem certeza que deseja sair?",
                                "Programinha de João",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                Icone.iconeAssembleia(),
                                opcaoConfirmarSaida,
                                opcaoConfirmarSaida[0]
                        );

                        if (opcoesDeFuncoes == 0) {
                            JOptionPane.showMessageDialog(
                                    null,
                                    "                          Até a próxima!",
                                    programinha,
                                    JOptionPane.PLAIN_MESSAGE);
                            break pararPrograma;
                    }
                }
            }
        }
    }
}
