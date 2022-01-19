package utility;

public class Patient implements Comparable<Patient>{
    private int sickLevel;
    private String name;
    private String problems;
    private int timeIndex;

    public Patient(int sickLevel, String name, String problems) {
        if (sickLevel < 0)
            throw new IllegalArgumentException();
        this.sickLevel = sickLevel;
        this.name = name;
        this.problems = problems;
        timeIndex = 0;
    }

    public int getSickLevel() {return this.sickLevel;}
    public String getName() {return this.name;}
    public String getProblems() {return this.problems;}

    public void setSickLevel(int level) {
        if (level<0)
            throw new IllegalArgumentException();
        this.sickLevel = level;
    }
    public void setProblems(String problems) {
        this.problems = problems;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTimeIndex(int index) {
        timeIndex = index;
    }

    public int compareTo(Patient other) {
        if (this.sickLevel == other.sickLevel) {
            return this.timeIndex - other.timeIndex;
        } else {
            return -(this.sickLevel - other.sickLevel);
        }
    }
    public String toString() {
        return "" + sickLevel +"\t"+name+"\tDiagnosis: "+problems;
    }
}
