package PlayerStuff;

public enum PlayerLevel {
    LEVEL_1(1,1,1),
    LEVEL_2(2,1,1),
    LEVEL_3(3,1,1),
    LEVEL_4(4,2,2),
    LEVEL_5(5,2,2),
    LEVEL_6(6,2,2),
    LEVEL_7(7,2,2),
    LEVEL_8(8,3,3),
    LEVEL_9(9,3,3),
    LEVEL_10(10,3,3),
    LEVEL_11(11,3,3),
    LEVEL_12(12,4,4),
    LEVEL_13(13,4,4),
    LEVEL_14(14,4,4),
    LEVEL_15(15,4,4),
    LEVEL_16(16,5,5),
    LEVEL_17(17,5,5),
    LEVEL_18(18,5,5),
    LEVEL_19(19,5,5),
    LEVEL_20(20,6,6);

    public int HP_modifier, MP_modifier,SP_modifier;

    PlayerLevel(int HP_modifier, int MP_modifier, int SP_modifier) {
        this.HP_modifier = HP_modifier;
        this.MP_modifier = MP_modifier;
        this.SP_modifier = SP_modifier;
    }
}
