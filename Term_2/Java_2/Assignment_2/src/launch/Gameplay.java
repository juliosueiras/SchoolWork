package launch;

import model.hero.*;
import model.*;

/**
 * Gameplay class 
 */
public class Gameplay
{
    public static void main(String[] args)
    {
        Avatar enemy = new Superhero(new PointSystem(1, 1, 1, 1, 1, 1, 1, 1), "Test", "Enemy", true, 1, "None");

        //<<<<<<<<<<<<< Batman Test <<<<<<<<
        System.out.println("Batman Test:\n");
        Superhero robin = new Superhero(new PointSystem(1, 1, 1, 1, 1, 1, 1, 1), "Tim", "Drake", true, 1, "Gotham City");
        Batman testBatman = new Batman(new PointSystem(1, 1, 1, 1, 1, 1, 1, 1), "Bruce", "Wayne", true, 1, "Gotham City", robin, true);

        testBatman.nightVision();
        testBatman.blind(enemy);
        testBatman.thermalGrenade();
        testBatman.intimidate(enemy);
        testBatman.surprise(enemy);
        testBatman.analyzeWeakness(enemy);
        testBatman.command("Fight with honor");
        testBatman.brawl(enemy);
        testBatman.grapple(enemy);
        testBatman.stealthAttack(enemy);
        testBatman.evade();
        testBatman.shoot("batgun", enemy);
        testBatman.blastArea();
        testBatman.fight(enemy);

        //<<<<<<<<<<<<< Superman Test <<<<<<<<
        System.out.println("\nSuperman Test:\n");
        Civilian supermanFriend = new Civilian(new PointSystem(1, 1, 1, 1, 1, 1, 1, 1), "Superman", "Friend", true, false);
        Civilian supermanGirlfriend = new Civilian(new PointSystem(1, 1, 1, 1, 1, 1, 1, 1), "Lois", "Lane", true, false);
        Superman testSuperman = new Superman(new PointSystem(1, 1, 1, 1, 1, 1, 1, 1), "Clark", "Kent", true, 1, "Krypton", supermanGirlfriend, supermanFriend);

        testSuperman.heatVision();
        testSuperman.coldBreath();
        testSuperman.xRayVision();
        testSuperman.fly();
        testSuperman.defend(enemy);
        testSuperman.crush(enemy);
        testSuperman.brawl(enemy);
        testSuperman.grapple(enemy);
        testSuperman.fight(enemy);

        //<<<<<<<<<<<<< Flash Test <<<<<<<<
        System.out.println("\nFlash Test:\n");
        Flash testFlash = new Flash(new PointSystem(1, 1, 1, 1, 1, 1, 1, 1), "Barry", "Allen", true, 1, "Central City", false, false);

        testFlash.cyclone();
        testFlash.vibrate();
        testFlash.supersonic();
        testFlash.shoot("speed", enemy);
        testFlash.evade();
        testFlash.blastArea();
        testFlash.stealthAttack(enemy);
        testFlash.fight(enemy);

        //<<<<<<<<<<<<< Wonder Woman Test <<<<<<<<
        System.out.println("\nWonder Woman Test:\n");
        WonderWoman testWonderWoman = new WonderWoman(new PointSystem(1, 1, 1, 1, 1, 1, 1, 1), "Princess", "Diana", true, 1, "Themyscira", true, 1);

        testWonderWoman.deflect();
        testWonderWoman.lasso(enemy);
        testWonderWoman.analyzeWeakness(enemy);
        testWonderWoman.interrogate(enemy);
        testWonderWoman.command("Go to Point A");
        testWonderWoman.brawl(enemy);
        testWonderWoman.grapple(enemy);
        testWonderWoman.fight(enemy);

        //<<<<<<<<<<<<< Green Lantern Test <<<<<<<<
        System.out.println("\nGreen Lantern Test:\n");
        GreenLantern testGreenLantern = new GreenLantern(new PointSystem(1, 1, 1, 1, 1, 1, 1, 1), "Green", "Lantern", true, 1, "Something", 1, 1);

        testGreenLantern.fly();
        testGreenLantern.shield(enemy);
        testGreenLantern.construct("Airplane");
        testGreenLantern.shoot("Ring", enemy);
        testGreenLantern.blastArea();
        testGreenLantern.fight(enemy);

    }

}
