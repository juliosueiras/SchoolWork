package launch;

import model.hero.*;
import model.*;

import java.awt.*;

/**
 * Created by julio on 2/8/14.
 */
public class Gameplay
{
    /**
     * Main void.
     *
     * @param args the args
     */
    public void main(String[] args)
    {
        Avatar enemy = new Superhero(1, 1, 1, 1, 1, 1, 1, 1, "Test", "Enemy", true, 1, "None");

        //<<<<<<<<<<<<< Batman Test <<<<<<<<
        Superhero robin = new Superhero(1, 1, 1, 1, 1, 1, 1, 1, "Tim", "Drake", true, 1, "Gotham City");
        Batman testBatman = new Batman(1, 1, 1, 1, 1, 1, 1, 1, "Bruce", "Wayne", true, 1, "Gotham City", true, robin);

        testBatman.nightVision();
        testBatman.blind(enemy);
        testBatman.thermalGrenade();
        testBatman.intimidate(enemy);
        testBatman.surprise(enemy);
        testBatman.analyzeWeakness(enemy);
        testBatman.command("Fight with honor");
    }

}
