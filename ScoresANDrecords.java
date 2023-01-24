public class ScoresANDrecords {
    private String title;

    //scores
    private String FighterName;
    private String Scores;
    
    //records
    private String FighterWinLoseRecord;
    private String FighterSpecialRecords;

    //Getters
    public String gettitle(){
        return title;
    }

    public String getFighterName(){
        return FighterName;
    }

    public String getScores(){
        return Scores;
    }

    public String getFighterWinLoseRecord(){
        return FighterWinLoseRecord;
    }

    public String getFighterSpecialRecords(){
        return FighterSpecialRecords;
    }

    //Setters
    public void settitle(String newtitle){
        title = newtitle;
    }

    public void setFighterName(String newFighterName){
        FighterName = newFighterName;
    }

    public void setScores(String newScores){
        Scores = newScores;
    }

    public void setFighterWinLoseRecord(String newFighterWinLoseRecord){
        FighterWinLoseRecord = newFighterWinLoseRecord;
    }

    public void setFighterSpecialRecords(String newFighterSpecialRecords){
        FighterSpecialRecords = newFighterSpecialRecords;
    }

}