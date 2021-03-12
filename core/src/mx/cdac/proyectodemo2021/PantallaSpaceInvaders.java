package mx.cdac.proyectodemo2021;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;

import java.lang.reflect.Array;

public class PantallaSpaceInvaders extends Pantalla {


    private Juego juego;
    private Alien arrayAlien[];
    public PantallaSpaceInvaders(Juego juego) {
        this.juego=juego;
    }

    @Override
    public void show() {
        crearEnemigos();
    }

    private void crearEnemigos() {
        Texture texturaAlien= new Texture("space/enemigoArriba.png");
        arrayAlien=new arr(11*5);

    }

    @Override
    public void render(float delta) {
        borrarPantalla(0,0,0);//Borrar con color negro
        batch.setProjectionMatrix(camara.combined);
        batch.begin();

        batch.end();
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
