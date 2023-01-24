public class Schedule {
    //Stores the estimated start time for each fight
    private String FirstBoutStart;
    private String SecondBoutStart;
    private String ThirdBoutStart;
    private String FourthBoutStart;
    private String MainBoutStart;

    //Getters
    public String getFirstBoutStart(){
        return FirstBoutStart;
    }
    
    public String getSecondBoutStart(){
        return SecondBoutStart;
    }

    public String getThirdBoutStart(){
        return ThirdBoutStart;
    }

    public String getFourthBoutStart(){
        return FourthBoutStart;
    }

    public String getMainBoutStart(){
        return MainBoutStart;
    }

    //Setters
    public void setFirstBoutStart(String newFirstBoutStart){
        FirstBoutStart = newFirstBoutStart;
    }

    public void setSecondBoutStart(String newSecondBoutStart){
        SecondBoutStart = newSecondBoutStart;
    }

    public void setThirdBoutStart(String newThirdBoutStart){
        ThirdBoutStart = newThirdBoutStart;
    }

    public void setFourthBoutStart(String newFourthBoutStart){
        FourthBoutStart = newFourthBoutStart;
    }

    public void setMainBoutStart(String newMainBoutStart){
        MainBoutStart = newMainBoutStart;
    }

}
