package entity;

public class Athlete {
    private String athleteName;
    private String competitiveUnit;
    private String yearOfBirth;

    public Athlete() {
    }

    public Athlete(String athleteName, String competitiveUnit, String yearOfBirth) {
        this.athleteName = athleteName;
        this.competitiveUnit = competitiveUnit;
        this.yearOfBirth = yearOfBirth;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public String getCompetitiveUnit() {
        return competitiveUnit;
    }

    public void setCompetitiveUnit(String competitiveUnit) {
        this.competitiveUnit = competitiveUnit;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Athlete: " +
                "athleteName: '" + athleteName + '\'' +
                ", competitiveUnit: '" + competitiveUnit + '\'' +
                ", yearOfBirth: '" + yearOfBirth + '\'' +
                '}';
    }
}
