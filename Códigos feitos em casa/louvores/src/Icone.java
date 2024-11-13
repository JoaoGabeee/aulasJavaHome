import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Icone {

    public static Icon iconeAssembleia(){

        ImageIcon icon = new ImageIcon("assembleia.jpg");
        Image imagem = icon.getImage();
        imagem = imagem.getScaledInstance(55, 55, Image.SCALE_AREA_AVERAGING);
        icon.setImage(imagem);
        return icon;
    }

}
