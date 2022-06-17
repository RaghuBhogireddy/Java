package io.codr;

import java.sql.*;

public class Main {

    public static final String DB_NAME = "sample.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:G:\\GitHub\\Java\\Database\\resources\\" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {


        try (Connection connection = DriverManager.getConnection(CONNECTION_STRING);
             Statement statement = connection.createStatement()) {
            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE  IF NOT EXISTS " +
                    TABLE_CONTACTS + "( " + COLUMN_NAME + " TEXT, "
                    + COLUMN_PHONE + " INTEGER, "
                    + COLUMN_EMAIL + " TEXT)");
            insertContacts(statement,"rajesh" , 535315,"rajesh@gmail.com" );
            insertContacts(statement,"raju" , 314513,"raju@gmail.com" );
            insertContacts(statement,"ramesh" , 314534,"ramesh@gmail.com" );
            insertContacts(statement,"ramu" , 1345134,"ramu@gmail.com" );
            insertContacts(statement,"rajath" , 1345134,"rajath@gmail.com" );


            /*statement.execute("SELECT * FROM  contacts");
            ResultSet resultSet = statement.getResultSet();*/

            // we can get ResultsSet out of  statement by using executeQuery method
            ResultSet resultSet = statement.executeQuery("SELECT * FROM  contacts");
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getString(COLUMN_NAME) + "|" +
                                resultSet.getInt(COLUMN_PHONE) + "|" +
                                resultSet.getString(COLUMN_EMAIL) + "|");
            }
            resultSet.close();

            //statement.execute("UPDATE contacts SET phone=1233333334 WHERE name='raghu'");

            // statement.execute("DELETE FROM contacts  WHERE name='ramu'");


        } catch (SQLException e) {
            System.out.println("Something went wrong : " + e.getMessage());
        }
    }

    public static void insertContacts(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" +
                COLUMN_NAME + "," +
                COLUMN_PHONE + "," +
                COLUMN_EMAIL + ")" +
                "VALUES(' "+ name + "'," + phone + ",'" + email +"')");

    }
}
