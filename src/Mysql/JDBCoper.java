package Mysql;
import Students.Students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCoper
{
    private Connection conn=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;

    public Connection getConn() {
        return conn;
    }

    public PreparedStatement getPs() {
        return ps;
    }

    public ResultSet getRs() {
        return rs;
    }

    public JDBCoper() {
        this.conn = JDBCUtil.getConnection();
    }

    public void close()
    {
        JDBCUtil.close(rs,ps,conn);
    }

    public void creatTable() throws SQLException {
        String sql = "create table if not exists Myclass" +
                "(Name varchar(20),Id int,Grade int, Birthday int,Sex char);";
        ps=conn.prepareStatement(sql);
        ps.executeUpdate();
    }

    public void insert(Students stu) throws SQLException {
        String sql="INSERT INTO Myclass(Name,Id,Grade,Birthday,Sex)values (?,?,?,?,?)";
        ps=conn.prepareStatement(sql);
        ps.setObject(1,stu.getName());
        ps.setObject(2,stu.getId());
        ps.setObject(3,stu.getGrade());
        ps.setObject(4,stu.getBirthday());
        ps.setObject(5,stu.getSex());
        ps.executeUpdate();
    }
}
