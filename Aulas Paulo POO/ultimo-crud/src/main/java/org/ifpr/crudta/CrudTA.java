package org.ifpr.crudta;

import com.formdev.flatlaf.IntelliJTheme;
import java.awt.EventQueue;
import org.ifpr.crudta.main.JanelaPrincipalJFrame;

/**
 *
 * @author IFPR
 */
public class CrudTA {

    public static void main(String[] args) {
        IntelliJTheme.setup(CrudTA.class.getClassLoader().getResourceAsStream("themes/frappe.theme.json"));

        EventQueue.invokeLater(() -> new JanelaPrincipalJFrame().setVisible(true));
    }
}
