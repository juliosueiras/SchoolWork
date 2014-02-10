package model;

/**
 * Civilian : the normal character in DC Universe
 */
public class Civilian extends Avatar
{
    private boolean friendly;
    private boolean questSource;

    /**
     * create new Civilian.
     *
     * @param pointSystem the point system
     * @param firstName   the first name
     * @param lastName    the last name
     * @param friendly    is the character friendly
     * @param questSource is the character quest giver
     */
    public Civilian(PointSystem pointSystem, String firstName, String lastName, boolean friendly, boolean questSource)
    {
        super(pointSystem, firstName, lastName);
        this.friendly = friendly;
        this.questSource = questSource;
    }

    /**
     * Is friendly.
     *
     * @return the boolean
     */
    public boolean isFriendly()
    {
        return friendly;
    }

    /**
     * Sets friendly.
     *
     * @param friendly the friendly
     */
    public void setFriendly(boolean friendly)
    {
        this.friendly = friendly;
    }

    /**
     * Is quest source.
     *
     * @return the boolean
     */
    public boolean isQuestSource()
    {
        return questSource;
    }

    /**
     * Sets quest source.
     *
     * @param questSource the quest source
     */
    public void setQuestSource(boolean questSource)
    {
        this.questSource = questSource;
    }

    @Override
    public void fight(Avatar avatarName)
    {
        System.out.println(this + " try to fight " + avatarName);
    }

    @Override
    public String toString()
    {
        return this.getFirstName() + " " + this.getLastName();
    }
}
