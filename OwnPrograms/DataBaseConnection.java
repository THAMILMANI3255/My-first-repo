import java.sql.*;  
class DataBaseConnection
{  
    public static void main(String args[])
    {
        try
        {
            //step1 load the driver class  
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            //step2 create  the connection object  
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");  
            
            //step3 create the statement object  
            Statement stmt=con.createStatement();  
            
            //step4 execute query  
            ResultSet rs=stmt.executeQuery("select * from emp");  
            while(rs.next())
            {
                System.out.println("Employee Id Is : "+rs.getString(1));
                System.out.println("Employee Id Is : "+rs.getString(2));
                System.out.println("Employee Id Is : "+rs.getString(3));
            }
  
            //step5 close the connection object  
            stmt.close();
            con.close();  
        }
        catch(Exception e)
        { 
            System.out.println(e);
        }  
  
    }  
}  