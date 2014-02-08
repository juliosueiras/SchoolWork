package model;

public abstract class Avatar
{
    private int fighting,
                agility,
                strength,
                endurance,
                reason,
                intuition,
                psyche,
                hitPoints;

    private String firstName,lastName;

    public void fight(Avatar a)
	{

	}

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


}