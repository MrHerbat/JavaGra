package PlayerStuff;

public enum PlayerClasses
{
    WARRIOR(12,4,16),
    RANGER(10,8,10),
    ROUGE(8,10,8),
    MAGE(6,16,4);

    public int maxHP,maxMP,maxSP;

    PlayerClasses(int maxHP,int maxMP,int maxSP)
    {
        this.maxHP = maxHP;
        this.maxMP = maxMP;
        this.maxSP = maxSP;
    }
}