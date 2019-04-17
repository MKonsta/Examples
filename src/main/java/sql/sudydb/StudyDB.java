package sql.sudydb;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudyDB {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    private static final String url ="jdbc:postgresql://localhost:5432/studydb";
    private static final String username = "postgres";
    private static final String password = "kozemir";


    public boolean createAndFillTable() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            String sql = "create table if not exists developers (id serial primary key, name varchar(30), speciality varchar(30), experience int, salary int);";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();


            sql = "select count (*) from developers;";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (!resultSet.next() || resultSet.getInt(1) != 8) {
                System.out.println(resultSet.getInt(1));
                sql = "delete from developers;";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.execute();

                List <Developer> devs = new ArrayList<Developer>();

                devs.add(new Developer("Matushenko Konstantin", "Java", 2, 1850));
                devs.add(new Developer("Petr Romanenko", "Java", 3, 3500));
                devs.add(new Developer("Andrey Komarov", "C++", 3, 2500));
                devs.add(new Developer("Konstantin Brovko", "C#", 2, 2000));
                devs.add(new Developer("Ludmila Kovaleva", "UI/UX", 2, 1800));
                devs.add(new Developer("Irina Sisieva", "C++", 4, 3200));
                devs.add(new Developer("Ivan Ivanov", "C#", 1, 900));
                devs.add(new Developer("Olga Sotnikova", "UI/UX", 2, 1800));

                sql = "insert into developers (name, speciality, experience, salary) values (?, ?, ?, ?);";

                for (Developer developer : devs) {
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, developer.getName());
                    preparedStatement.setString(2, developer.getSpeciality());
                    preparedStatement.setInt(3, developer.getExperience());
                    preparedStatement.setInt(4, developer.getSalary());
                    preparedStatement.execute();
                }
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null && preparedStatement != null) {
                try {
                    connection.close();
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


        return true;
    }

    public static void main(String[] args) {
        StudyDB studyDB = new StudyDB();
        studyDB.createAndFillTable();
    }
}
