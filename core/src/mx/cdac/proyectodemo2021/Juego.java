package mx.cdac.proyectodemo2021;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
/*
Esta clase representa a la aplicacion(main), va a vivir durantetodo el ciclo de la app */
public class Juego extends Game {

	
	@Override
	public void create () {
		setScreen(new PantallaMenu(this));
	}

}
