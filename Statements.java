import java.sql.*;  
class Statements{  
    public static void main(String args[]) throws Exception{  
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
        Statement stmt=con.createStatement();  
        //insert query
        stmt.executeUpdate("insert into emp765 values(33,'Irfan',50000)");  
        //update query
        int result1=stmt.executeUpdate("update emp765 set name='Vimal',salary=10000 where id=33");  
        //delete query
        int result2=stmt.executeUpdate("delete from emp765 where id=33");  
        
        System.out.println(result+" records affected");  
        
        con.close();  
    }
}
