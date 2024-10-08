package election.data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class ElectionData {
    private String regionID;
    private String regionName;
    private String regionAddress;
    private String regionPostalCode;
    private String federalState;
    private String timestamp;
    private List<Party> countingData;

    public ElectionData(String regionID, String regionName, String regionAddress, String regionPostalCode, String federalState, List<Party> countingData) {
        this.regionID = regionID;
        this.regionName = regionName;
        this.regionAddress = regionAddress;
        this.regionPostalCode = regionPostalCode;
        this.federalState = federalState;
        this.timestamp =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        this.countingData = countingData;
    }

    public String getRegionID() {
        return regionID;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getRegionAddress() {
        return regionAddress;
    }

    public String getRegionPostalCode() {
        return regionPostalCode;
    }

    public String getFederalState() {
        return federalState;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public List<Party> getCountingData(){
        return countingData;
    }
}







