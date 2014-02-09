package model;

public class Civilian extends Avatar
{
    private boolean friendly;
    private boolean questSource;

    public Civilian(int fighting, int agility, int strength, int endurance, int reason, int intuition, int psyche, int hitPoints, String firstName, String lastName)
    {
        super(fighting, agility, strength, endurance, reason, intuition, psyche, hitPoints, firstName, lastName);
    }

    public boolean isFriendly()
    {
        return friendly;
    }

    public void setFriendly(boolean friendly)
    {
        this.friendly = friendly;
    }

    public boolean isQuestSource()
    {
        return questSource;
    }

    public void setQuestSource(boolean questSource)
    {
        this.questSource = questSource;
    }

    @Override
    public void fight(Avatar avatarName)
    {

    }
}
