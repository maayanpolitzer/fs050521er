package com.company;

public class Player {

    // properties / fields:
    int life = 100;
    int score = 0;
    int ammo = 20;

    void setPlayerAsVIP(){
        ammo = 200;
    }

    // methods:
    void shoot(Player targetPlayer, boolean hit){
        // shooting player ammo - 1:
        ammo--;
        if(hit){
            //  if hit is true shooting player score + 20:
            score += 20;
            // if hit is true target player life - 20:
            targetPlayer.life -= 20;
        }
    }

}
