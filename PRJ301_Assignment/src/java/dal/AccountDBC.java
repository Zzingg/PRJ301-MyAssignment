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
import model.Role;


/**
 *
 * @author vinht
 */
public class AccountDBC extends DBContext<Account> {

    @Override
    public ArrayList<Account> list() {
        ArrayList<Account> acts = new ArrayList<>();
        try {
            String SQL = "SELECT [AccountID]\n"
                    + "      ,[Username]\n"
                    + "      ,[Password]\n"
                    + "      ,[RoleID]\n"
                    + "  FROM [Account]";
            ps = connection.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setId(rs.getInt("AccountID"));
                a.setUsername(rs.getString("Username"));
                a.setPasword(rs.getString("Password"));
                Role r = new Role();
                r.setId(rs.getInt("RoleID"));
                r.setName(rs.getString("Name"));
                a.setR(r);
                acts.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return acts;
    }
    
    public String getDisplayName(String username, String password) {
        String displayName;
        try {
            String sql = "SELECT [displayName] FROM [Account] WHERE [username]= ? AND [password] = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                displayName = rs.getString(1);
                return displayName;
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
