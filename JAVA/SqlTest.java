import java.sql.*;
public class SqlTest
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.pointbase.jdbc.jdbcUniversalDriver");
            String url="jdbc:pointbase://localhost/cs595";
            String dbUser="PBPUBLIC";
            String dbPassword="PBPUBLIC";

            Connection con = DriverManager.getConnection(url,dbUser,dbPassword);
            
        }

    }
}