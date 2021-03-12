package mx.cdac.proyectodemo2021;

import com.badlogic.gdx.Screen;

public class PantallaConfiguracion extends Pantalla {
    private Juego juego;

    public PantallaConfiguracion(Juego juego) {
        this.juego=juego;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        borrarPantalla(0,1,1.5f);
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
