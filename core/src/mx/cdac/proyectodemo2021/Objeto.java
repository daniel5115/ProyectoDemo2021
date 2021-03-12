package mx.cdac.proyectodemo2021;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Objeto {

    //para que clases que hereden, pueden acceder a la variable
    protected Sprite sprite;


    public Objeto(Texture textura,float x, float y){
        sprite=new Sprite(textura);
        sprite.setPosition(x,y);


    }

    public Objeto(){

    }

    public void render(SpriteBatch batch){
        sprite.draw(batch);
    }

}
