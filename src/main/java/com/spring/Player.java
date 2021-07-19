package com.spring;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<String> players = new ArrayList<>();

    public Player() {
        players.add("Treka");
        players.add("Messi");
        players.add("CR7");
        players.add("Salah");
    }

    public String getName(String name){
        for(int i=0; i< players.size(); i++){
            if(players.get(i).equals(name)){
                return players.get(i);
            }
        }
        return null;
    }
}
