public class Fighter{
    private String Name; 
    private String Nickname; 
    private String Surname;
    private double Weight;
    private double Height;
    private int Age;
    private double Reach;
    private String FightRecord;

    //Getters
    public String getName(){
        return Name;
    }

    public String getNickname(){
        return Nickname;
    }

    public String getSurname(){
        return Surname;
    }

    public double getWeight(){
        return Weight;
    }

    public double getHeight(){
        return Height;
    }

    public int getAge(){
        return Age;
    }

    public double getReach(){
        return Reach;
    }

    public String getFightRecord(){
        return FightRecord;
    }

    //Setters
    public void setName(String newName){
        Name = newName;
    }

    public void setNickname(String newNickname){
        Nickname = newNickname;
    }

    public void setSurname(String newSurname){
        Surname = newSurname;
    }

    public void setWeight(double newWeight){
        Weight = newWeight;
    }

    public void setHeight(double newHeight){
        Height = newHeight;
    }

    public void setAge(int newAge){
        Age = newAge;
    }

    public void setReach(double newReach){
        Reach = newReach;
    }

    public void setFightRecord(String newFightRecord){
        FightRecord = newFightRecord;
    }

}