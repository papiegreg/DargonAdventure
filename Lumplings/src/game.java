import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;

public class game extends JFrame implements ActionListener {

    int yAlign = 405;


    ArrayList<String> levels;

    JLabel label;
    JLabel villageLabel;
    /*Village buildings */
    JLabel smithLabel;
    JLabel libraryLabel;
    JLabel barLabel;
    //----
    JLabel forestLabel;
    JLabel gateLabel;
    JLabel dragonLabel;
    JLabel winLabel;

    JButton submit;

    JButton startBnt;
    JButton villageBtn;
    JButton forrestBtn;
    JButton gateBnt;
    JButton dragonBtn;

    JTextField text;
    JLabel caption;
    JLabel dmg;//Sword Icon
    JLabel skillLevel;
    JLabel keyLabel;//Key Icon
    JLabel damageLabel;


    String hasKey = "✕";
    String hasSword = "✕";
    boolean obtainedKey = false;
    boolean obtainedSword = false;
    int skillAmount = 0;
    int damage = 0;
    game(){
        levels = new ArrayList<String>();
        levels.add("start");
        levels.add("village");
        levels.add("forest");
        levels.add("dragons gate");
        levels.add("Dragon Cave");
//----
        ImageIcon brain = new ImageIcon("brain.png");
        skillLevel = new JLabel();
        skillLevel.setBounds(430,yAlign + 20,70,20);
        Image brainImg = brain.getImage();
        Image imgBrain = brainImg.getScaledInstance(20,20,Image.SCALE_SMOOTH);
        ImageIcon scaledBrain = new ImageIcon(imgBrain);
        skillLevel.setIcon(scaledBrain);
        skillLevel.setForeground(new Color(255,255,255));
        skillLevel.setText(Integer.toString(skillAmount));

//------
        ImageIcon key = new ImageIcon("key.png"); //Draw sword Icon (if owned or not)
        keyLabel = new JLabel();
        keyLabel.setBounds(430,yAlign,70,20);
        Image keyImg = key.getImage();
        Image imgKey= keyImg.getScaledInstance(20,20,Image.SCALE_SMOOTH);
        ImageIcon scaledKey= new ImageIcon(imgKey);
        keyLabel.setIcon(scaledKey);
        keyLabel.setForeground(new Color(255,255,255));
        keyLabel.setText(hasKey);
//------

        ImageIcon fist = new ImageIcon("fist.png"); //Draw sword Icon (if owned or not)
        damageLabel = new JLabel();
        damageLabel.setBounds(430,yAlign-40,70,20);
        Image fistImg = fist.getImage();
        Image imgFist= fistImg.getScaledInstance(20,20,Image.SCALE_SMOOTH);
        ImageIcon fistScaled= new ImageIcon(imgFist);
        damageLabel.setIcon(fistScaled);
        damageLabel.setForeground(new Color(255,255,255));
        damageLabel.setText(Integer.toString(damage));

//------
        ImageIcon sword = new ImageIcon("swordTwo.png"); //Draw sword Icon (if owned or not)
        dmg = new JLabel();
        dmg.setBounds(430,yAlign-20,70,20);
        Image swordImg = sword.getImage();
        Image imgSword= swordImg.getScaledInstance(20,20,Image.SCALE_SMOOTH);
        ImageIcon scaledSword = new ImageIcon(imgSword);
        dmg.setIcon(scaledSword);
        dmg.setForeground(new Color(255,255,255));
        dmg.setText(hasSword);
//------


        startBnt = new JButton("Spawn");
        startBnt.setBounds(5,yAlign -70,70,30);
        startBnt.setFocusable(false);
        startBnt.setFont(new Font("Arial",Font.BOLD,10));
        startBnt.setBackground(new Color(1,1,1));
        startBnt.setForeground(new Color(255,255,255));
        startBnt.addActionListener(this);


        villageBtn = new JButton("Village");
        villageBtn.setBounds(80,yAlign - 70,70,30);
        villageBtn.setFocusable(false);
        villageBtn.setFont(new Font("Arial",Font.BOLD,10));
        villageBtn.setBackground(new Color(1,1,1));
        villageBtn.setForeground(new Color(255,255,255));
        villageBtn.addActionListener(this);

        forrestBtn = new JButton("Forest");
        forrestBtn.setBounds(155,yAlign -70,70,30);
        forrestBtn.setFocusable(false);
        forrestBtn.setFont(new Font("Arial",Font.BOLD,10));
        forrestBtn.setBackground(new Color(1,1,1));
        forrestBtn.setForeground(new Color(255,255,255));
        forrestBtn.addActionListener(this);

        gateBnt = new JButton("Gate");
        gateBnt.setBounds(230,yAlign -70,70,30);
        gateBnt.setFocusable(false);
        gateBnt.setFont(new Font("Arial",Font.BOLD,10));
        gateBnt.setBackground(new Color(1,1,1));
        gateBnt.setForeground(new Color(255,255,255));
        gateBnt.addActionListener(this);

        dragonBtn = new JButton("Dragon");
        dragonBtn.setBounds(305,yAlign -70,70,30);
        dragonBtn.setFocusable(false);
        dragonBtn.setFont(new Font("Arial",Font.BOLD,10));
        dragonBtn.setBackground(new Color(1,1,1));
        dragonBtn.setForeground(new Color(255,255,255));
        dragonBtn.addActionListener(this);

//------

        submit = new JButton("Go");
        submit.setBounds(5,yAlign,100,50);
        submit.setFocusable(false);
        submit.setBackground(new Color(1,1,1));
        submit.setForeground(new Color(255,255,255));
        submit.addActionListener(this);
//------

        text = new JTextField(); //text field
        text.setBounds(105,yAlign,320,50);
        text.setBackground(new Color(0,0,0));
        text.setForeground(new Color(255,255,255));

//-----
        caption = new JLabel(); //game text here
        caption.setForeground(new Color(255,255,255));
        caption.setText("Welcome to the wild explorer, click Go to start.");
        caption.setBounds(5,330,400,100);

//------
        label = new JLabel(); // background & scaling of image
        ImageIcon background = new ImageIcon("forest.png");
        Image img = background.getImage();
        label.setBounds(0,0,500,330);
        Image imgScale = img.getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledImage = new ImageIcon(imgScale);
        label.setIcon(scaledImage);

        /* Village background*/
        villageLabel = new JLabel();
        ImageIcon villageBG = new ImageIcon("village.png");
        Image vilIMG = villageBG.getImage();
        villageLabel.setBounds(0,0,500,330);
        Image vilScale = vilIMG.getScaledInstance(villageLabel.getWidth(),villageLabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon vilScaled = new ImageIcon(vilScale);
        villageLabel.setIcon(vilScaled);
        /*Village Building backgrounds*/

        //Bar

        barLabel = new JLabel();
        ImageIcon barBG = new ImageIcon("barBG.png");
        Image barIMG = barBG.getImage();
        barLabel.setBounds(0,0,500,330);
        Image barScale = barIMG.getScaledInstance(barLabel.getWidth(),barLabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon barScaled = new ImageIcon(barScale);
        barLabel.setIcon(barScaled);

        //


        //Library
        libraryLabel = new JLabel();
        ImageIcon libraryBG = new ImageIcon("libraryBG.jpg");
        Image libraryIMG = libraryBG.getImage();
        libraryLabel.setBounds(0,0,500,330);
        Image libraryScale = libraryIMG.getScaledInstance(libraryLabel.getWidth(),libraryLabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon libraryScaled = new ImageIcon(libraryScale);
        libraryLabel.setIcon(libraryScaled);


        //Smith
        smithLabel = new JLabel();
        ImageIcon smithBG = new ImageIcon("smithBG.jpg");
        Image smithIMG = smithBG.getImage();
        smithLabel.setBounds(0,0,500,330);
        Image smithScale = smithIMG.getScaledInstance(smithLabel.getWidth(),smithLabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon smithScaled = new ImageIcon(smithScale);
        smithLabel.setIcon(smithScaled);




        /* Forest background*/
        forestLabel = new JLabel();
        ImageIcon forrestBG = new ImageIcon("darkForest.png");
        Image forrestImg = forrestBG.getImage();
        forestLabel.setBounds(0,0,500,330);
        Image forestScale = forrestImg.getScaledInstance(forestLabel.getWidth(),forestLabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon forestScaled = new ImageIcon(forestScale);
        forestLabel.setIcon(forestScaled);

        /* Dragons Gate background*/
        gateLabel = new JLabel();
        ImageIcon gateBG = new ImageIcon("gateTwo.png");
        Image gateImg = gateBG.getImage();
        gateLabel.setBounds(0,0,500,330);
        Image gateScale = gateImg.getScaledInstance(gateLabel.getWidth(),gateLabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon gateScaled = new ImageIcon(gateScale);
        gateLabel.setIcon(gateScaled);

        /* Dragon Fight background*/
        dragonLabel = new JLabel();
        ImageIcon dragonBG = new ImageIcon("dragonBG.png");
        Image dragonImg = dragonBG.getImage();
        dragonLabel.setBounds(0,0,500,330);
        Image dragonScale = dragonImg.getScaledInstance(dragonLabel.getWidth(),dragonLabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon dragonScaled = new ImageIcon(dragonScale);
        dragonLabel.setIcon(dragonScaled);

        /*Win screen*/
        winLabel = new JLabel();
        ImageIcon winBG = new ImageIcon("youWin.jpg");
        Image winImg = winBG.getImage();
        winLabel.setBounds(0,0,500,330);
        Image winScale = winImg.getScaledInstance(winLabel.getWidth(),winLabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon winScaled = new ImageIcon(winScale);
        winLabel.setIcon(winScaled);

//----------------//
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0,0,0));
        this.setVisible(true);
//-------------------------//
        //images
        this.add(label);
        this.add(villageLabel);
        //Village building background//
        this.add(smithLabel);
        this.add(libraryLabel);
        this.add(barLabel);
        //---
        this.add(forestLabel);
        this.add(gateLabel);
        this.add(dragonLabel);
        this.add(winLabel);
//----------//
        //Interactions and components
        this.add(submit);
        this.add(villageBtn);
        this.add(startBnt);
        this.add(forrestBtn);
        this.add(gateBnt);
        this.add(dragonBtn);

        this.add(text);
        this.add(caption);
        this.add(dmg);
        this.add(keyLabel);
        this.add(skillLevel);
        this.add(damageLabel);

        caption.setText("Enter your name explorer and press Go");
    }
    boolean canExplore = false;
    boolean killedBoss = false;
    //Control switches
    boolean gotName = false;
    boolean canWrite = true;
    //boolean inArea = false; <-- garbage
    //level unlock states
    boolean villageLevel = false;
    boolean forestLevel = false;
    boolean gateLevel = false;
    boolean dragonLevel = false;
    //end level unlock states

    player player = new player("",0,0,0,"start");

    spawn spawn = new spawn("spawn");
    village village = new village("Village","houseA");
    forrest forest = new forrest("Forest");

    /*int numGoons = 0;
    public goon makeNewGoon(){
        goon newGoon = new goon(100,false);
        return newGoon;
    }*/

    public boolean askForName(String str){//checks name if valid and to enter name if no name provided
        boolean val = false;
        if(str.equalsIgnoreCase("")){
            caption.setText("Enter a valid name");
        }
        else{
            player.setName(text.getText());
            val = true;
        }
        return val;
    }

//Zone methods
    public void spawnZone(){
        smithLabel.setVisible(false);
        villageLabel.setVisible(false);
        label.setVisible(true);
        forestLabel.setVisible(false);
        barLabel.setVisible(true);
        libraryLabel.setVisible(false);
        gateLabel.setVisible(false);
        dragonLabel.setVisible(false);
        player.setStage(0);
        caption.setText("You have entered "+ spawn.getName() + " " + spawn.explore());
        text.setText("wonder keyword available ");
    }

    public void villageZone(){
        smithLabel.setVisible(false);
        villageLabel.setVisible(true);
        label.setVisible(false);
        forestLabel.setVisible(false);
        barLabel.setVisible(true);
        libraryLabel.setVisible(false);
        gateLabel.setVisible(false);
        dragonLabel.setVisible(false);
        villageLevel = true;
        player.setStage(1);
        caption.setText("You have entered " + levels.get(player.getStage()));
        text.setText(village.explore());
    }
    //Village interactions GUI methods
    public void smithZone(){
        smithLabel.setVisible(true);
        villageLabel.setVisible(false);
        label.setVisible(false);
        forestLabel.setVisible(false);
        barLabel.setVisible(false);
        libraryLabel.setVisible(false);
        gateLabel.setVisible(false);
        dragonLabel.setVisible(false);
        player.setStage(9);
        caption.setText("You entered the smithery, talk?");
        text.setText("type talk to interact");
    }

    public void libraryZone(){
        smithLabel.setVisible(false);
        villageLabel.setVisible(false);
        label.setVisible(false);
        forestLabel.setVisible(false);
        barLabel.setVisible(false);
        libraryLabel.setVisible(true);
        gateLabel.setVisible(false);
        dragonLabel.setVisible(false);
        player.setStage(8);
        caption.setText("You are in the library, maybe read?");
        text.setText("type read to read");
    }
    

    public void barZone(){
        smithLabel.setVisible(false);
        villageLabel.setVisible(false);
        label.setVisible(false);
        forestLabel.setVisible(false);
        barLabel.setVisible(true);
        libraryLabel.setVisible(false);
        gateLabel.setVisible(false);
        dragonLabel.setVisible(false);
        player.setStage(7);
        caption.setText("You entered The Pub, some guy looks at you funny");
        text.setText("type fight to fight");
    }

    //---

    public void forestZone(){
        smithLabel.setVisible(false);
        villageLabel.setVisible(false);
        label.setVisible(false);
        forestLabel.setVisible(true);
        barLabel.setVisible(false);
        libraryLabel.setVisible(false);
        gateLabel.setVisible(false);
        dragonLabel.setVisible(false);
        forestLevel = true;
        player.setStage(2);
        caption.setText("You have entered " + levels.get(player.getStage()));
        text.setText(forest.explore());
    }

    public void gateZone(){
        smithLabel.setVisible(false);
        villageLabel.setVisible(false);
        label.setVisible(false);
        forestLabel.setVisible(false);
        barLabel.setVisible(false);
        libraryLabel.setVisible(false);
        gateLabel.setVisible(true);
        dragonLabel.setVisible(false);
        gateLevel = true;
        player.setStage(3);
        caption.setText("You have entered " + levels.get(player.getStage()));
        text.setText("All of a sudden a huge rock monster attacks!!!");
    }
    public void dragonZone(){
        smithLabel.setVisible(false);
        villageLabel.setVisible(false);
        label.setVisible(false);
        forestLabel.setVisible(false);
        barLabel.setVisible(false);
        libraryLabel.setVisible(false);
        gateLabel.setVisible(false);
        dragonLabel.setVisible(true);
        dragonLevel = true;
        player.setStage(4);
        caption.setText("You have entered " + levels.get(player.getStage()));
        text.setText("SLAY THE DRAGON");

    }
    public void winZone(){
        smithLabel.setVisible(false);
        villageLabel.setVisible(false);
        label.setVisible(false);
        forestLabel.setVisible(false);
        barLabel.setVisible(false);
        libraryLabel.setVisible(false);
        gateLabel.setVisible(false);
        dragonLabel.setVisible(false);
        winLabel.setVisible(true);//here
        startBnt.setVisible(false);
        villageBtn.setVisible(false);
        forrestBtn.setVisible(false);
        gateBnt.setVisible(false);
        dragonBtn.setVisible(false);
        text.setVisible(false);
        submit.setVisible(false);
        damageLabel.setVisible(false);
        dmg.setVisible(false);
        skillLevel.setVisible(false);
        keyLabel.setVisible(false);
        caption.setText("You killed the Dragon, you get cake");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Top zone button handler
        if(e.getSource()==startBnt && gotName){
            spawnZone();
            canExplore = false;

        }

        if(e.getSource()==villageBtn && gotName && villageLevel){
            villageZone();
            canExplore = false;
        }

        if(e.getSource()==forrestBtn && gotName && forestLevel){
            forestZone();
            canExplore = false;
        }
        if(e.getSource()==gateBnt && gotName && gateLevel){
            gateZone();
            canExplore = false;
        }
        if(e.getSource()==dragonBtn && gotName && dragonLevel){
            dragonZone();
            canExplore = false;
        }

        //end Zone button handler
        if(e.getSource()==submit){
            //skillLevel.setText(Integer.toString(skillAmount += 5));
            if(canWrite){gotName = askForName(text.getText());}
           if(!gotName && canWrite){
               gotName = askForName(text.getText());
           }
           if(gotName && canWrite){
               text.setText("");
               caption.setText("Hello! " + player.getName() + ", type in wonder in the console to continue!");
               canWrite = false;
            }
           if(text.getText().equalsIgnoreCase("wonder") && gotName){ //finds whats near by
               caption.setText("There seems to be a " + levels.get(player.getStage()+1)+ " near by!");
               text.setText("type in explore to enter it");
               canExplore = true;
           }

           if(text.getText().equalsIgnoreCase("explore") && gotName && levels.get(player.getStage()+1).equalsIgnoreCase("village") && canExplore){ //enters near by area (village)
                   villageZone();

           }
            /*Add village keywords BELLOW */
           if(text.getText().equalsIgnoreCase("walk") && gotName && villageLevel && levels.get(player.getStage()).equalsIgnoreCase("village")) {
               caption.setText("You see the following buildings: Smith,library,bar");
           }
            //smith interaction//
           if(text.getText().equalsIgnoreCase("smith") && villageLevel && levels.get(player.getStage()).equalsIgnoreCase("village")){
                smithZone();
            }
           if(text.getText().equalsIgnoreCase("talk")&& villageLevel && player.getStage() == 9){
               if(skillAmount >= 50){
                   caption.setText("You have acquired the sword");
                   obtainedSword = true;
                   text.setText("");
                   dmg.setText("✓");
               }
               else{
                   caption.setText("You need more knowledge to handle my weapons");
               }
           }
            //smith interaction//
            //Library interaction//
            if(text.getText().equalsIgnoreCase("library") && villageLevel && levels.get(player.getStage()).equalsIgnoreCase("village")){
                libraryZone();
            }
            if(text.getText().equalsIgnoreCase("read")&& villageLevel && player.getStage() == 8){
                text.setText("");
                skillAmount += (int)(Math.random()*15)+1;
                skillLevel.setText(Integer.toString(skillAmount));
            }


            //Library interaction//
            //Bar interaction//
            if(text.getText().equalsIgnoreCase("bar") && villageLevel && levels.get(player.getStage()).equalsIgnoreCase("village")){
                barZone();
            }
            //Bar interaction
            if(text.getText().equalsIgnoreCase("fight")&& villageLevel&& player.getStage()==7){
                damage += (int)(Math.random()*10)+1;
                caption.setText("You get " + damage + " points");
                damageLabel.setText(Integer.toString(damage));
                text.setText("");
            }

            /*Add village keywords ABOVE */

            if(text.getText().equalsIgnoreCase("explore") && gotName && levels.get(player.getStage()+1).equalsIgnoreCase("forest") && canExplore){ //enters near by area (forest)
                forestZone();
            }
            /*Add forest keywords BELLOW */
            if(text.getText().equalsIgnoreCase("fight") && levels.get(player.getStage()).equalsIgnoreCase("forest")){
                    goon Monster = new goon(45,false);
                    if((Monster.getHealth() - damage > 0)){
                        caption.setText("You were not powerful enough to slay the "+ Monster.getSpecies());
                        text.setText("Go improve your damage stats");
                    }
                    if((Monster.getHealth() - damage <=0)){
                        caption.setText("You slayed a "+ Monster.getSpecies());
                        damageLabel.setText(Integer.toString(damage += 30));

                        if(Monster.rollKey()){
                            obtainedKey = true;
                            keyLabel.setText("✓");
                        }
                    }
                }
            }

            /*Add forest keywords ABOVE */
            if(text.getText().equalsIgnoreCase("explore") && obtainedKey  && levels.get(player.getStage()+1).equalsIgnoreCase("dragons gate")){
                gateZone();
            }
            if(text.getText().equalsIgnoreCase("fight") && levels.get(player.getStage()).equalsIgnoreCase("dragons gate")){
                goon SuperMonster = new goon(120,false);
                if(obtainedSword){
                    if((SuperMonster.getHealth() - damage > 0 )){
                        caption.setText("You were not powerful enough to slay the super "+ SuperMonster.getSpecies());
                        text.setText("Go improve your damage stats");
                    }
                    if((SuperMonster.getHealth() - damage <=0)){
                        caption.setText("You slayed the super "+ SuperMonster.getSpecies());
                        damageLabel.setText(Integer.toString(damage+=100));
                        killedBoss = true;
                    }
                }
                if(!obtainedSword){
                    caption.setText("You tried yet failed...");
                    text.setText("Maybe a weapon is needed");
                }

            }
            if(text.getText().equalsIgnoreCase("explore") && killedBoss && levels.get(player.getStage()+1).equalsIgnoreCase("Dragon Cave")){
                dragonZone();
            }
            if(text.getText().equalsIgnoreCase("fight")&& levels.get(player.getStage()).equalsIgnoreCase("Dragon Cave")){
                dragon dragon = new dragon(1000,"Scaly Dragon");
                if((dragon.getHealth() - damage > 0 )){
                    caption.setText("You were not powerful enough to slay the "+ dragon.getName());
                    text.setText("Go improve your damage stats");
                    damageLabel.setText(Integer.toString(damage-=200));
                }
                if((dragon.getHealth() - damage <=0)){
                    winZone();
                    //caption.setText("You slayed the "+ dragon.getName());
                    damageLabel.setText(Integer.toString(damage+=100));
                }
            }
        //------
        }

        }



