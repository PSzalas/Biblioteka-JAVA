
package Projekt;
import java.sql.*;
        
public class PolaczenieBaza {
    public static Connection getCon()  {     
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/biblioteka?useUnicode=true&characterEncoding=UTF-8","root","admin");   
return con;  
}catch(Exception e){ 
    System.out.println(e);
    return null;
}  
}  
}  
    

