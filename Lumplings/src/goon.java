import java.util.ArrayList;

public class goon {
    private int health;
    private String species;
    private int numGoons = 0;
    private boolean isDead;
    ArrayList<String> list = new ArrayList<String>();




    public goon(int health,boolean isDead){
        list.add("Goblin");
        list.add("Crow-Spider");
        list.add("Skeleton");
        list.add("Troll");
        //Roll species
        numGoons += 1;
        this.health = health;
        this.isDead = isDead;
        this.species = list.get((int)(Math.random()*list.size()-1)+0);

    }
    public int getHealth(){
        return health;
    }
    public String getSpecies(){
        return species;
    }
    public int getNumGoons(){return numGoons;}

    public boolean rollKey(){
    boolean val = false;
    int num = (int)(Math.random()*2)+1;
    if(num ==1){
        val = true;
    }
    else{
        val = false;
    }
    return val;
    }

}
