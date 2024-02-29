/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package com.mycompany.tetris2024;

/**
 *
 * @author marcel
 */
public class ConfingData {
    
    private static ConfingData confingData = new ConfingData();
    
    private String playerName;
    private int level;
    private int score;
    private int deltaTime = 500; //Milisegundos
    
    private ConfingData() {
        playerName = "";
        level = 1;
    }
    
    public static ConfingData getInstance() {
        return confingData;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getDeltaTime() {
        return deltaTime;
    }

    public void setDeltaTime(int deltaTime) {
        this.deltaTime = deltaTime;
    }

    
    

    
    
    
    
    
}
