package election.model;

import election.data.ElectionData;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import java.util.List;

@RestController
public class ElectionController {

    private final ElectionService electionService;

    public ElectionController(ElectionService electionService) {
        this.electionService = electionService;
    }

    @RequestMapping("/")
    public String electionMain() {
        return "Election Data \n" +
                "\n<a href='http://localhost:8080/election/33123/json'>JSON-Anzeige</a><br/>" +
                "\n<a href='http://localhost:8080/election/33123/xml'>XML-Anzeige</a><br/>";
    }

    @RequestMapping(value = "/election/{regionID}/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public ElectionData electionXML(@PathVariable String regionID) {
        return getElectionDataByRegionID(regionID);
    }

    @RequestMapping(value = "/election/{regionID}/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public ElectionData electionJSON(@PathVariable String regionID) {
        return getElectionDataByRegionID(regionID);
    }

    private ElectionData getElectionDataByRegionID(String regionID) {
        List<ElectionData> elections = electionService.getData();
        for (ElectionData election : elections) {
            if (election.getRegionID().equals(regionID)) {
                return election;
            }
        }
        return null;
    }
}
