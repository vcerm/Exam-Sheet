package demoex.manager;

import demoex.App;
import demoex.entities.AgentEntity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AgentEntityManager {

    public static List<AgentEntity> selectAll() throws SQLException {
        try (Connection c = App.getConnection()){
            String sql = "SELECT * FROM Agent";
            Statement s = c.createStatement();
            ResultSet resultSet = s.executeQuery(sql);
            List<AgentEntity> list = new ArrayList<>();

            while(resultSet.next()){
                list.add(
                        new AgentEntity(
                                resultSet.getInt("ID"),
                                resultSet.getString("Title"),
                                resultSet.getString("AgentType"),
                                resultSet.getString("Address"),
                                resultSet.getString("Phone"),
                                resultSet.getString("Email"),
                                resultSet.getDouble("Priority")
                        )
                );
            }
            return list;
        }
    }
}
