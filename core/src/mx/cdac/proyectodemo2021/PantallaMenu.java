package mx.cdac.proyectodemo2021;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Align;

public class PantallaMenu extends Pantalla {
  //Referencia al juego principal
    private Juego juego;
    //Fondo
    private Texture texturaFondo;
    //Escena
    private Stage escenaMenu;



    public PantallaMenu(Juego juego) {
        this.juego=juego;
    }
//se ejecuta al inicio,
    @Override
    public void show() {

        crearMenu();

    }

    private void crearMenu() {
        //Fondo
        texturaFondo = new Texture("menu/vangoghfondo.jpg");
        //Menu,necesitamos una escena

        escenaMenu=new Stage(vista);
        //Actores..boton
        Button btnMario = crearBoton("menu/button_jugar-mario-bross.png", "menu/btn_inverso_jugar-mario-bross.png");
        btnMario.setPosition(ANCHO/3,2*ALTO/3, Align.center);
        //Agregamos actor a Escena
        escenaMenu.addActor(btnMario);
        //Agregamos Action Listener
        btnMario.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                //Cambiar pantalla
                juego.setScreen(new PantallaJugarMario(juego));
            }
        });

        final Button btnSpace = crearBoton("menu/button_jugar-space-invaders.png","menu/btn_inverso_jugar-space-invaders.png");
        btnSpace.setPosition(2*ANCHO/3,2*ALTO/3, Align.center);
        escenaMenu.addActor(btnSpace);
        //Registrar el evento de click para el boton
        btnSpace.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
              //Cambiar pantalla
                juego.setScreen(new PantallaSpaceInvaders(juego));
            }
        });


        Button btnRunner = crearBoton("menu/button_jugar-runner.png", "menu/btn_inverso_jugar-runner.png");
        btnRunner.setPosition(ANCHO/3,ALTO/3, Align.center);
        escenaMenu.addActor(btnRunner);
        //Registrar el evento de click para el boton
        btnRunner.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                //Cambiar pantalla
                juego.setScreen(new PantallaJugarRunner(juego));
            }
        });


        Button btnConfig = crearBoton("menu/button_configuracion.png", "menu/btn_inverso_configuracion.png");
        btnConfig.setPosition(2*ANCHO/3,ALTO/3, Align.center);
        escenaMenu.addActor(btnConfig);
        //Registrar el evento de click para el boton
        btnConfig.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                //Cambiar pantalla
                juego.setScreen(new PantallaConfiguracion(juego));
            }
        });


        //ESCENA SE ENCARGA DE ATENDER LOS EVENTOS DE ENTRADA
        Gdx.input.setInputProcessor(escenaMenu);


    }

    private Button crearBoton(String archivo, String archivoInverso) {
        Texture texturaBoton=new Texture(archivo);
        TextureRegionDrawable trdBtnMario=new TextureRegionDrawable(texturaBoton);
        //Inverso

        Texture texturaBotonInverso=new Texture(archivoInverso);
        TextureRegionDrawable trdBtnInverso=new TextureRegionDrawable(texturaBotonInverso);
        return new Button(trdBtnMario,trdBtnInverso);
    }


    //se ejecuta automaticamente 60 veces por segundo
    //delta es el tiempo transcurrido entre frames
    @Override
    public void render(float delta) {
     borrarPantalla(0,1,0);

     batch.setProjectionMatrix(camara.combined);
     batch.begin();
     batch.draw(texturaFondo,0,0);
     batch.end();


     //Escena despues del FONDO
        escenaMenu.draw();
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
