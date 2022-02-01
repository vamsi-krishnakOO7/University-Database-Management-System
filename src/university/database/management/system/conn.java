package university.database.management.system;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn()
    {  
        try
        {  
            Class.forName("java.sql.DriverManager");  
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/udms","root","");    
            s =c.createStatement();  
            
           
        }
        catch(Exception e)
        { 
            System.out.println(e);
        }  
    }  
}  