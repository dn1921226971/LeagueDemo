package com.dn.league.dao;

import java.sql.*;
import java.util.*;

import com.dn.league.leaguebean.LeagueBean;

public class SqlBean {
    Connection conn;

    ResultSet rs;

    PreparedStatement ps = null;

    String url = "jdbc:mysql://localhost:3306/league";

    String user = "root";

    String password = "root";

    public SqlBean() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public int add(String sql, LeagueBean lBean) {
        int count = 0;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, lBean.getYear());
            ps.setString(2, lBean.getSeason());
            ps.setString(3, lBean.getTitle());
            count = ps.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return count;
    }

    public int delete(String sql, int id) {
        int count = 0;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            count = ps.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return count;
    }

    public int update(String sql, LeagueBean lBean ,int id) {
        int count = 0;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, lBean.getYear());
            ps.setString(2, lBean.getSeason());
            ps.setString(3, lBean.getTitle());
            ps.setInt(4, id);
            count = ps.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        return count;
    }

    public LeagueBean query_1(String sql, int id) {
        LeagueBean lBean = new LeagueBean();
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                lBean.setId(rs.getInt("lid"));
                lBean.setYear(rs.getInt("lyear"));
                lBean.setSeason(rs.getString("season"));
                lBean.setTitle(rs.getString("title"));
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                ps.close();
                conn.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return lBean;
    }

    public List<LeagueBean> query(String sql) {
        List<LeagueBean> list = new ArrayList();

        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                LeagueBean lBean = new LeagueBean();
                lBean.setId(rs.getInt("lid"));
                lBean.setYear(rs.getInt("lyear"));
                lBean.setSeason(rs.getString("season"));
                lBean.setTitle(rs.getString("title"));

                list.add(lBean);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return list;

    }
}
