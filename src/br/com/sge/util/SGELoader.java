package br.com.sge.util;

import br.com.sge.view.Customers;
import br.com.sge.view.SaleList;
import br.com.sge.view.Login;
import br.com.sge.view.Principal;
import br.com.sge.view.ProductSelection;
import br.com.sge.view.SGE;
import br.com.sge.view.Sales;
import br.com.sge.view.SplashScreen;
import br.com.sge.view.Users;
import java.text.ParseException;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joseluiz
 */
public class SGELoader {

    public static void main(String[] args) {
        try {
            UIManager.put("Synthetica.window.decoration", Boolean.FALSE);
            UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
        } catch (ParseException | UnsupportedLookAndFeelException erro) {
        }
        java.awt.EventQueue.invokeLater(() -> {
//            ProductSelection dialog = new ProductSelection(new javax.swing.JFrame(), true);
//            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                @Override
//                public void windowClosing(java.awt.event.WindowEvent e) {
//                    System.exit(0);
//                }
//            });
//            dialog.setVisible(true);

            /* JFRAMES*/
            //    new Login().setVisible(true);
            //     new Fornecedor().setVisible(true);
//      new SGE().setVisible(true);
//         new Customers().setVisible(true);
//         new Principal().setVisible(true);
//            new Users().setVisible(true);
//new Login().setVisible(true);
            //      new SplashScreen().setVisible(true);
            new Sales().setVisible(true);
//      new SaleList().setVisible(true);
        });
    }
}
