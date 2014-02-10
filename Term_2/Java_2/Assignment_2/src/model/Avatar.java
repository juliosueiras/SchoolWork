package model;

/**
 * The type Avatar.
 */
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

    /**
     * create a new Avatar.
     *
     * @param pointSystem the point system
     * @param firstName the first name
     * @param lastName the last name
     */
    protected Avatar(PointSystem pointSystem, String firstName, String lastName)
    {
        this.fighting = pointSystem.getFighting();
        this.agility = pointSystem.getAgility();
        this.strength = pointSystem.getStrength();
        this.endurance = pointSystem.getEndurance();
        this.reason = pointSystem.getReason();
        this.intuition = pointSystem.getIntuition();
        this.psyche = pointSystem.getPsyche();
        this.hitPoints = pointSystem.getHitPoints();
        this.firstName = firstName;
        this.lastName = lastName;
    }


    /**
     * the method that is responsible for fighting
     *
     * @param avatarName the enemy name
     */
    public abstract void fight(Avatar avatarName);

    /**
     * Gets fighting.
     *
     * @return the fighting
     */
    public int getFighting()
	{
		return fighting;
	}

    /**
     * Sets fighting.
     *
     * @param fighting the fighting
     */
    public void setFighting(int fighting)
	{
		this.fighting = fighting;
	}

    /**
     * Gets agility.
     *
     * @return the agility
     */
    public int getAgility()
	{
		return agility;
	}

    /**
     * Sets agility.
     *
     * @param agility the agility
     */
    public void setAgility(int agility)
	{
		this.agility = agility;
	}

    /**
     * Gets strength.
     *
     * @return the strength
     */
    public int getStrength()
	{
		return strength;
	}

    /**
     * Sets strength.
     *
     * @param strength the strength
     */
    public void setStrength(int strength)
	{
		this.strength = strength;
	}

    /**
     * Gets reason.
     *
     * @return the reason
     */
    public int getReason()
	{
		return reason; 
	}

    /**
     * Sets reason.
     *
     * @param reason the reason
     */
    public void setReason(int reason)
	{
		this.reason = reason;
	}

    /**
     * Gets endurance.
     *
     * @return the endurance
     */
    public int getEndurance()
    {
        return endurance;
    }

    /**
     * Sets endurance.
     *
     * @param endurance the endurance
     */
    public void setEndurance(int endurance)
    {
        this.endurance = endurance;
    }

    /**
     * Gets intuition.
     *
     * @return the intuition
     */
    public int getIntuition()
    {
        return intuition;
    }

    /**
     * Sets intuition.
     *
     * @param intuition the intuition
     */
    public void setIntuition(int intuition)
    {
        this.intuition = intuition;
    }

    /**
     * Gets psyche.
     *
     * @return the psyche
     */
    public int getPsyche()
    {
        return psyche;
    }

    /**
     * Sets psyche.
     *
     * @param psyche the psyche
     */
    public void setPsyche(int psyche)
    {
        this.psyche = psyche;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * Gets hit points.
     *
     * @return the hit points
     */
    public int getHitPoints()
    {
        return hitPoints;
    }

    /**
     * Sets hit points.
     *
     * @param hitPoints the hit points
     */
    public void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;
    }

    /**
     * provide the name
     * @return the name
     */
    @Override
    public String toString()
    {
        return this.getClass().getSimpleName();
    }

}
