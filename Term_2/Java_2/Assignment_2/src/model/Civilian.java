package model;

public class Civilian extends Avatar
{
    private boolean friendly;
    private boolean questSource;

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
}
