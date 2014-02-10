package model;

public abstract class Avatar
{
    private int fighting;
    private int agility;



    private int strength;
    private int endurance;
    private int reason;
    private int intuition;
    private int psyche;
    private int hitPoints;

    private String firstName,lastName;

    protected Avatar(int fighting, int agility, int strength, int endurance, int reason, int intuition, int psyche, int hitPoints, String firstName, String lastName)
    {
        this.fighting = fighting;
        this.agility = agility;
        this.strength = strength;
        this.endurance = endurance;
        this.reason = reason;
        this.intuition = intuition;
        this.psyche = psyche;
        this.hitPoints = hitPoints;
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public abstract void fight(Avatar avatarName);

	public int getFighting()
	{
		return fighting;
	}
	
	public void setFighting(int fighting)
	{
		this.fighting = fighting;
	}

	public int getAgility()
	{
		return agility;
	}
	
	public void setAgility(int agility)
	{
		this.agility = agility;
	}

	public int getStrength()
	{
		return strength;
	}
	
	public void setStrength(int strength)
	{
		this.strength = strength;
	}
	
	public int getReason()
	{
		return reason; 
	}
	
	public void setReason(int reason)
	{
		this.reason = reason;
	}
	
    public int getEndurance()
    {
        return endurance;
    }

    public void setEndurance(int endurance)
    {
        this.endurance = endurance;
    }

    public int getIntuition()
    {
        return intuition;
    }

    public void setIntuition(int intuition)
    {
        this.intuition = intuition;
    }

    public int getPsyche()
    {
        return psyche;
    }

    public void setPsyche(int psyche)
    {
        this.psyche = psyche;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getHitPoints()
    {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;
    }

    @Override
    public String toString()
    {
        return this.getClass().getSimpleName();
    }

}
