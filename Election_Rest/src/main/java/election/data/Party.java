package election.data;

import election.data.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

public class Party {



    private String partyId;
    private int votes;
    private List<Vorzug> vorzugsStimmen;

    public Party(String partyId, int votes, List<Vorzug> vorzugsStimmen){
        this.partyId = partyId;
        this.votes = votes;
        this.vorzugsStimmen = vorzugsStimmen;
    }
    public String getPartyId(){
        return partyId;
    }

    public int getVotes(){
        return votes;
    }

    public List<Vorzug> getVorzugsStimmen(){
        return vorzugsStimmen;
    }
}