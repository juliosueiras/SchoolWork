package hero;

import model.Avatar;
import model.Superhero;
import model.hero.Batman;
import model.hero.Flash;

import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by julio on 2/8/14.
 */
public class FlashTest
{
    Flash testFlashObject = new Flash(1, 1, 1, 3, 4, 5, 6, 7, "Flash", " ", true, 1, "Something", true, false);
    Avatar enemy = new Superhero(1, 1, 1, 1, 1, 1, 1, 1, "Test", "Enemy", true, 1, "Home town test");
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams()
    {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams()
    {
        System.setOut(null);
    }

    @Test
    public void testCyclone() throws Exception
    {
        testFlashObject.cyclone();
        Assert.assertEquals("Cyclone method fail",outContent.toString() , "Flash use cyclone!\n");
    }

    @Test
    public void testVibrate() throws Exception
    {
        testFlashObject.vibrate();
        Assert.assertEquals("Vibrate method fail",outContent.toString() , "Flash use vibrate!\n");
    }

    @Test
    public void testSupersonic() throws Exception
    {
        testFlashObject.supersonic();
        Assert.assertEquals("Supersonic method fail",outContent.toString() , "Flash use supersonic!\n");
    }

    @Test
    public void testStealthAttack() throws Exception
    {
        testFlashObject.stealthAttack(enemy);
        Assert.assertEquals("Supersonic method fail",outContent.toString() ,"Flash use stealth attack on Test Enemy\n");
    }

    @Test
    public void testEvade() throws Exception
    {
        Assert.assertFalse("Evade method fail",testFlashObject.evade());
    }

    @Test
    public void testShoot() throws Exception
    {
        testFlashObject.shoot("weapon",enemy);
        Assert.assertEquals("Shoot method fail",outContent.toString(),"Flash shoot Test Enemy with weapon\n");
    }

    @Test
    public void testBlastArea() throws Exception
    {
        testFlashObject.blastArea();
        Assert.assertEquals("Blast Area method fail",outContent.toString(),"Flash blasted the area away with his speed\n");
    }

    @Test
    public void testFight() throws Exception
    {
        testFlashObject.fight(enemy);
        Assert.assertEquals("Fight method fail",outContent.toString() ,"Flash fight Test Enemy with his speed punch\n");

    }
}
