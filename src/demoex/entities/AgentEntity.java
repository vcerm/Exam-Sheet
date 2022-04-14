package demoex.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AgentEntity {
    private int ID;
    private String Title;
    private String AgentType;
    private String Address;
    private String Phone;
    private String Email;
    private double Priority;
}
