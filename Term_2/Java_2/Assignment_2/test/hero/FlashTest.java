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
    Flash testFlashObject = new Flash(1, 1, 1, 3, 4, 5, 6, 7, "Flash", "", true, 1, "Something", true, false);
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

    }

    @Test
    public void testShoot() throws Exception
    {

    }

    @Test
    public void testBlastArea() throws Exception
    {

    }

    @Test
    public void testFight() throws Exception
    {

    }

    @Test
    public void testIsSecretIdentity() throws Exception
    {

    }

    @Test
    public void testSetSecretIdentity() throws Exception
    {

    }

    @Test
    public void testGetEnergy() throws Exception
    {

    }

    @Test
    public void testSetEnergy() throws Exception
    {

    }

    @Test
    public void testGetHomeTown() throws Exception
    {

    }

    @Test
    public void testSetHomeTown() throws Exception
    {

    }

    @Test
    public void testFight1() throws Exception
    {

    }

    @Test
    public void testFight2() throws Exception
    {

    }

    @Test
    public void testGetFighting() throws Exception
    {

    }

    @Test
    public void testSetFighting() throws Exception
    {

    }

    @Test
    public void testGetAgility() throws Exception
    {

    }

    @Test
    public void testSetAgility() throws Exception
    {

    }

    @Test
    public void testGetStrength() throws Exception
    {

    }

    @Test
    public void testSetStrength() throws Exception
    {

    }

    @Test
    public void testGetReason() throws Exception
    {

    }

    @Test
    public void testSetReason() throws Exception
    {

    }

    @Test
    public void testGetEndurance() throws Exception
    {

    }

    @Test
    public void testSetEndurance() throws Exception
    {

    }

    @Test
    public void testGetIntuition() throws Exception
    {

    }

    @Test
    public void testSetIntuition() throws Exception
    {

    }

    @Test
    public void testGetPsyche() throws Exception
    {

    }

    @Test
    public void testSetPsyche() throws Exception
    {

    }

    @Test
    public void testGetFirstName() throws Exception
    {

    }

    @Test
    public void testSetFirstName() throws Exception
    {

    }

    @Test
    public void testGetLastName() throws Exception
    {

    }

    @Test
    public void testSetLastName() throws Exception
    {

    }

    @Test
    public void testGetHitPoints() throws Exception
    {

    }

    @Test
    public void testSetHitPoints() throws Exception
    {

    }
}
