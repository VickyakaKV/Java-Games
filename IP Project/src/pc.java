/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krishnan
 */
public class pc {
    
    int p = 230, q = 100;
    long sx, sy;
    int j = 0;
    
    //Detect collisions
    public boolean hit(int sqrdist){
        return sqrdist <= 484;
    }
    
    //Assign directions
    int xdirection(int x){
        if((x-p)<0)
            return -1;
        else
            return 1;
}

    int ydirection(int y){
        if((y-q)<0)
            return -1;
        else
            return 1;
    }

    void attack(int a,long vy){
        sy=-vy*a;
        if(Math.abs(sy)>sop.maxspeed)
            sy/= Math.abs(sy)/sop.maxspeed;
        if(sy==0)
            sy=3;
        q+=sy;
    }

    void defend(long vy){
        if(q>70)
            q-=vy/2;
    }
    
}
