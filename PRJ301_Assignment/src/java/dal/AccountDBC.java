/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author vinht
 */
public class AccountDBC extends DBContext<Account> {

    @Override
    public ArrayList<Account> list() {
        ArrayList<Account> acts = new ArrayList<>();
        try {
            String SQL = "SELECT [username]\n"
                    + "      ,[password]\n"
                    + "      ,[roleno]\n"
                    + "  FROM [Account]";
            ps = connection.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setUsername(rs.getString("username"));
                a.setPasword(rs.getString("password"));
                a.setRole(rs.getInt("roleno"));
                acts.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return acts;
    }

    public String getRoleNo(String username, String password) {
        String roleno;
        try {
            String sql = "SELECT roleno \n"
                    + "FROM Account\n"
                    + "WHERE username = ? AND password = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                roleno = rs.getString(1);
                return roleno;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccountDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    @Override
    public Account get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
