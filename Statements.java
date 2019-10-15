import java.sql.*;  
class Statements{  
    public static void main(String args[]) throws Exception{  
        // making connections
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Angel Priya","abcd#1234");  
        PreparedStatement stmt = con.prepareStatement();  
        
        //insert query
        stmt.executeUpdate("insert into emp765 values(?,?,?)");  //  (33,'Tourist',50000)
        //setting values
        stmnt.clearParameters();
        stmnt.setInteger(1, 33);
        stmnt.setString(2, 'Tourist');
        stmnt.setInteger(3, 50000);
        
        //update query
        int result1 = stmt.executeUpdate("update emp765 set name='Vimal',salary=10000 where id=33"); 
        
        //delete query
        int result2 = stmt.executeUpdate("delete from emp765 where id=33");  
        
        System.out.println(result1 + " records affected");  
        
        // select statement
        ResultSet rs = stmt.executeQuery("select * from emp");  // rs is cursor
        while(rs.next()) {
            System.out.println( rs.getInt(1) + "  "+rs.getString(2) + "  " + rs.getString(3));  
        }
        /*
           1. rs.previous ()        :moves back one row.
           2. rs.absolute (int num) : moves to the row with the specified number.
           3. rs.relative (int num) :moves forward or backward (if num is negative) relative to the current position.
                                     Relative (-1) has the same effect as previous.
           4. rs.first()            :moves to the first row, and last 0 moves to the last row.

        */
        
        con.close();  
    }
}
