package demoex.ui;

import demoex.entities.AgentEntity;
import demoex.manager.AgentEntityManager;
import demoex.util.BaseForm;
import demoex.util.CustomTableModel;

import javax.swing.*;
import java.sql.SQLException;

public class AgentTableForm extends BaseForm {
    private JPanel mainPanel;
    private JTable table;

    private CustomTableModel<AgentEntity> model;

    public AgentTableForm(){
        super(1200,800);
        setContentPane(mainPanel);

        initTable();

        setVisible(true);
    }

    private void initTable(){
        table.getTableHeader().setReorderingAllowed(false);

        try {
            model = new CustomTableModel<>(
                    AgentEntity.class,
                    new String[] {"ID", "Title", "AgentType", "Address", "Phone", "Email", "Priority"},
                    AgentEntityManager.selectAll()
            );
            table.setModel(model);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
