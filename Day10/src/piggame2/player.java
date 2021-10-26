package piggame2;

public class player {
    private String name;
    private int playScore;
    private double totalRolls;
    private double totalTurns;

    //metoden for playeren.
    public player(String name, int playScore,
                  double totalRolls, double totalTurns) {
        this.name = name;
        this.playScore = playScore;
        this.totalRolls = totalRolls;
        this.totalTurns = totalTurns;
    }


public void setName(String name){
        this.name = name;
}
public String getName(){
    return name;
}

    // set til playscoren.
    public void setPlayScore ( int playScore){
        this.playScore = playScore;
    }
    // get til playscoren
    public int getPlayScore () {
        return playScore;
    }
    public void setTotalRolls(double totalRolls){
        this.totalRolls = totalRolls;
    }
    public double getTotalRolls(){
        return totalRolls;
    }
    public void setTotalTurns (double totalTurns){
        this.totalTurns = totalTurns;
    }
    public double getTotalTurns(){
        return totalTurns;
    }
}


