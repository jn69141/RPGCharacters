public class Warrior{

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
    public Warrior(String n) {
        name = n;
        lvl = 1;
        maxHp = 20;
        hp = maxHp;
        atk = 10;
        def = 8;
        mAtk = 0;
        mDef = 4;
        agi = 7;
        wis = 2;
    } //constructor1 end

    //constructor2 : made for high lvl charcs
    public Warrior(String n, int lev) {
        name = n;
        lvl = lev;
        maxHp = 20*lev;
        hp = maxHp;
        atk = 10*lev;
        def = 8*lev;
        mAtk = 0;
        mDef = 4*lev;
        agi = 7*lev;
        wis = 2*lev;
    } //constructor2 end

} //public class Warrior end