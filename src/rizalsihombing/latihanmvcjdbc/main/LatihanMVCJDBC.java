/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rizalsihombing.latihanmvcjdbc.main;

import rizalsihombing.latihanmvcjdbc.database.KingsBarbershopDatabase;
import java.sql.SQLException;
import java.util.List;
import rizalsihombing.latihanmvcjdbc.entity.Pelanggan;
import rizalsihombing.latihanmvcjdbc.error.PelangganException;
import rizalsihombing.latihanmvcjdbc.service.PelangganDao;
import javax.swing.SwingUtilities;
import rizalsihombing.latihanmvcjdbc.view.MainViewPelanggan;
import java.util.logging.Logger;

/**
 *
 * @author RizalSihombing
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
//                    Logger.getLogger(LatihanMVCJDBC.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }
}