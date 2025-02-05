package PlayerStuff;

public enum PlayerClass
{
    WARRIOR(12,4,16),
    RANGER(10,8,10),
    ROUGE(8,10,8),
    MAGE(6,16,4);

    public int baseHP, baseMP, baseSP;

    PlayerClass(int maxHP,int maxMP,int maxSP)
    {
        this.baseHP = maxHP;
        this.baseMP = maxMP;
        this.baseSP = maxSP;
    }
}
