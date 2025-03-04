package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        try {
            Connection connection  =  null;


            // 1. JDBC 드라이버 등록 : mysql db 접근 하기 위한 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded ok! " + connection);

            // 2. Mysql DB에 연결객체를 얻어와서 연결하기
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mypra5?serverTimezone = Asia/Seoul","mypra5","mypra5");
            System.out.println("Connention " + connection);

            if(connection != null){
                try{
                    connection.close();
                    System.out.println("conection closed");
                }catch (SQLException e){e.printStackTrace();}

            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
        }


    }



}
