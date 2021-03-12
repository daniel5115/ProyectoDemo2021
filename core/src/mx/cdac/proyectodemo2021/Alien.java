package mx.cdac.proyectodemo2021;

/*
 *
 * Los aliens extienden del Objeto
 * Autor: Daniel Castañeda
 * */

import com.badlogic.gdx.graphics.Texture;

public class Alien extends Objeto
{
    public Alien(Texture textura,float x,float y){
        super(textura,x,y);

    }

    //mover
    public void moverHorinizontal(Float dx){
        sprite.setX(sprite.getX() +dx);

    }
//ya esta dibujado por que ya lo heredo


}
