/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ifpr.crudta;

import ifpr.crudta.main.JanelaPrincipal;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMoonlightIJTheme;

/**
 *
 * @author IFPR
 */
public class CrudTA {

    public static void main(String[] args) {
        FlatMoonlightIJTheme.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }
}
