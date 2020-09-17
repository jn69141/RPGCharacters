public class Healer{

//instace variables
private String name;
private int lvl;
private int maxHp;
private int hp;
private int atk;
private int mAtk;
private int def;
private int mDef;
private int agi;
private int wis;

    //constructor1 : made for lvl1 charcs
    public Healer(String n) {
        name = n;
        lvl = 1;
        maxHp = 16;
        hp = maxHp;
        atk = 4;
        def = 6;
        mAtk = 5;
        mDef = 10;
        agi = 3;
        wis = 12;
    } //constructor1 end

    //constructor2 : made for high lvl charcs
    public Healer(String n, int lev) {
        name = n;
        lvl = lev;
        maxHp = 16*lev;
        hp = maxHp;
        atk = 4*lev;
        def = 6*lev;
        mAtk = 5;
        mDef = 10*lev;
        agi = 3*lev;
        wis = 12*lev;
    } //constructor2 end

} //public class Healer end