package tw;

import com.google.inject.Injector;
//import jdk.internal.util.xml.impl.Input;
import tw.commands.GuessInputCommand;
import tw.controllers.GameController;
//import jdk.internal.util.xml.impl.Input;


import java.util.Scanner;

import static com.google.inject.Guice.createInjector;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {


    public static void main(String[] args) throws Exception {

        Main main = new Main();
        Injector injector = createInjector(new GuessNumberModule());
        GameController gameController = injector.getInstance(GameController.class);

        gameController.beginGame();
        gameController.play(new GuessInputCommand());

    }
}
