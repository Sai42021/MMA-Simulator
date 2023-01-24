public class Bout {
    private String Fighter1;
    private String Fighter2;
    private String WeigtClass;
    private String Announcer;
    private String StartTime;
    private int NoOfRounds;
    private String Title;

    //Getters
    public String getFighter1(){
        return Fighter1;
    }

    public String getFighter2(){
        return Fighter2;
    }

    public String getWeigtClass(){
        return WeigtClass;
    }

    public String getAnnouncer(){
        return Announcer;
    }

    public String getStartTime(){
        return StartTime;
    }

    public int getNoOfRounds(){
        return NoOfRounds;
    }

    public String getTitle(){
        return Title;
    }

    //Setters
    public void setFighter1(String newFighter1){
        Fighter1 = newFighter1;
    }

    public void setFighter2(String newFighter2){
        Fighter2 = newFighter2;
    }

    public void setWeigtClass(String newWeigtClass){
        WeigtClass = newWeigtClass;
    }

    public void setAnnouncer(String newAnnouncer){
        Announcer = newAnnouncer;
    }

    public void setStartTime(String newStartTime){
        StartTime = newStartTime;
    }

    public void setNoOfRounds(int newNoOfRounds){
        NoOfRounds = newNoOfRounds;
    }

    public void setTitle(String newTitle){
        Title = newTitle;
    }
}