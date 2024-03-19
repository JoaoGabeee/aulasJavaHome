import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
public class GravadorArquivosCsv  {
    public GravadorArquivosCsv() {

        try (FileWriter escritor = new FileWriter("louvores.csv", true)) {

            String compositores = JOptionPane.showInputDialog("Qual o nome do(a) ou dos(as) compositores?");
            escritor.write(compositores);

            String louvores = ";" + JOptionPane.showInputDialog("Qual o nome do hino/louvor");
            escritor.write(louvores + "\n");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        }
    }

}
