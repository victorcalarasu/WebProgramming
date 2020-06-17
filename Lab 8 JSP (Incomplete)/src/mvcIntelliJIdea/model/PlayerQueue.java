package mvcIntelliJIdea.model;

import java.util.ArrayList;
import java.util.List;

public class PlayerQueue {
     List<String> playerlist;

    public PlayerQueue(){this.playerlist=new ArrayList<String>(); }
    public List<String> getPlayerlist(){return this.playerlist;}
    public Integer getLength(){return this.playerlist.size();}
    public void add(String item){this.playerlist.add(item);}
}
