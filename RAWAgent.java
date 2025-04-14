package Collections;

import java.util.ArrayList;
import java.util.List;

public class RAWAgent {
    int rawAgentBatchId;
    String rawAgentName;
    String rawAgentMissionName;


    public int getRawAgentBatchId() {
        return rawAgentBatchId;
    }

    public void setRawAgentBatchId(int rawAgentBatchId) {
        this.rawAgentBatchId = rawAgentBatchId;
    }

    public String getRawAgentMissionName() {
        return rawAgentMissionName;
    }

    public void setRawAgentMissionName(String rawAgentMissionName) {
        this.rawAgentMissionName = rawAgentMissionName;
    }

    public String getRawAgentName() {
        return rawAgentName;
    }

    public void setRawAgentName(String rawAgentName) {
        this.rawAgentName = rawAgentName;
    }

    public RAWAgent(int rawAgentBatchId, String rawAgentMissionName, String rawAgentName) {
        this.rawAgentBatchId = rawAgentBatchId;
        this.rawAgentMissionName = rawAgentMissionName;
        this.rawAgentName = rawAgentName;
    }
    public void printDetails(){
        System.out.println("Raw Agent Batch Id: "+rawAgentBatchId);
        System.out.println("Raw Agent Mission Name: "+rawAgentMissionName);
        System.out.println("Raw Agent Name: "+rawAgentName);
    }
}
