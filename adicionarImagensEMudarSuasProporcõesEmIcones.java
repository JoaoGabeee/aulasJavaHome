import javax.swing.ImageIcon;
import java.awt.Image;

public class Main {

    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("caminho da imagem");
        Image imagem = icon.getImage();
        imagem = imagem.getScaledInstance(50, 50, Image.SCALE_FAST);
        icon.setImage(imagem);
    }
}
