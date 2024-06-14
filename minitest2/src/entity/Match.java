package entity;

public class Match {
    private String matchId;
    private int weightLevel;
    private String redAthlete;
    private String blueAthlete;

    public Match() {
    }

    public Match(String matchId, int weightLevel, String redAthlete, String blueAthlete) {
        this.matchId = matchId;
        this.weightLevel = weightLevel;
        this.redAthlete = redAthlete;
        this.blueAthlete = blueAthlete;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public int getWeightLevel() {
        return weightLevel;
    }

    public void setWeightLevel(int weightLevel) {
        this.weightLevel = weightLevel;
    }

    public String getRedAthlete() {
        return redAthlete;
    }

    public void setRedAthlete(String redAthlete) {
        this.redAthlete = redAthlete;
    }

    public String getBlueAthlete() {
        return blueAthlete;
    }

    public void setBlueAthlete(String blueAthlete) {
        this.blueAthlete = blueAthlete;
    }

    public void display(){

    }
}
