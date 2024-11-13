import javax.swing.JOptionPane;

public class Main {

    public static String[] listaDeMesas = new String[10];
    public static String situacaoMesas = "";

    public static void main(String[] args) {
        for (int i = 0; i < listaDeMesas.length; i++) {
            listaDeMesas[i] = "Livre";
        }
        while (true) {
            String[] opcoesDeFuncoes = {"Reservar", "Consultar", "Liberar", "Sair"};
            int escolhaUsuario = JOptionPane.showOptionDialog(
                    null,
                    "Olá, seja bem-vindo(a)!",
                    "Qual função você deseja realiza?",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcoesDeFuncoes, opcoesDeFuncoes[0]
            );

            switch (escolhaUsuario) {
                case 0 -> resservaDeMesas();
                case 1 -> consultaDeMesas();
                case 2 -> liberacaoDeMesas();
                default ->
                        JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema :)\nAté a próxima!");
            }
            break;
        }
    }
    public static void resservaDeMesas() {

        situacaoDasMesas();

        int escolhaDeReservaDoUser = Integer.parseInt(JOptionPane.showInputDialog(situacaoMesas + "Qual mesa deseja reservar?"));

        if (listaDeMesas[escolhaDeReservaDoUser].equals("Livre")) {
            listaDeMesas[escolhaDeReservaDoUser] = "Ocupada";
            JOptionPane.showMessageDialog(null, "Mesa reservada com sucesso!");
            situacaoDasMesas();
        } else {
            JOptionPane.showMessageDialog(null, "Essa mesa está ocupada!");
        }
    }

    public static void consultaDeMesas() {
        situacaoDasMesas();
        JOptionPane.showMessageDialog(null, situacaoMesas);
    }

    public static void liberacaoDeMesas() {

        situacaoDasMesas();

        int escolhaDeLiberacaoDoUser = Integer.parseInt(JOptionPane.showInputDialog(situacaoMesas + "Qual mesa deseja liberar?"));

        if (listaDeMesas[escolhaDeLiberacaoDoUser].equals("Ocupada")) {
            listaDeMesas[escolhaDeLiberacaoDoUser] = "Livre";
            JOptionPane.showMessageDialog(null, "Mesa liberada com sucesso");
            situacaoDasMesas();
        } else JOptionPane.showMessageDialog(null, "Essa mesa já está livre!");
    }
    public static void situacaoDasMesas() {
        situacaoMesas = "";
        for (int i = 0; i < listaDeMesas.length; i++) {
            if (listaDeMesas[i].equals("Livre")) {
                situacaoMesas += "Mesa " + i + ": livre\n";
            } else {
                situacaoMesas += "Mesa " + i + ": ocupada\n";
            }
        }
    }
}
