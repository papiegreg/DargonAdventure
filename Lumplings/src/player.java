import java.util.ArrayList;

public class player {
    private String name;
    private int attackDmg;
    private int skillLevel;
    private int stage;
    private String currentZone;

    player(String name,int attackDmg,int skillLevel,int stage,String currentZone){
        this.name = name;
        this.attackDmg = attackDmg;
        this.skillLevel = skillLevel;
        this.currentZone = currentZone;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){ name = newName;}
    public int getStage(){return stage;}
    public void setStage(int num){stage = num;}
    public void setZone(String str){
        currentZone = str;
    }
    public void setDmg(int dmg){attackDmg = dmg;}

}
