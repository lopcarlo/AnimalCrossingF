package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Fox extends GameObject implements Collidable{

    public Fox(int col,int row, GameObject.Direction dir) {
        this.setSpeed(1);
        this.setDir(dir);

        if (dir == GameObject.Direction.LEFT) {
            this.setSprite(new Picture(col,row,"GameObjects/FoxLeft.png"));
            this.getSprite().draw();

        } else {
            this.setSprite(new Picture(col,row,"GameObjects/FoxRight.png"));
            this.getSprite().draw();
        }
    }
}
