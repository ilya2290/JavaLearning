package DotaPacage;

public class DotaHero {

    static public int hp;
    static public int mp;
    static public int agility;
    static public int strength;
    static public int intelligence;
    static public int armor;
    static public int damage;
    static public int ms;
    static public int as;

    DotaHero() {
//        hp = 200;
//        mp = 75;
//        agility = 20;
//        strength = 25;
//        intelligence = 18;
//        armor = 2;
//        damage = 52;
//        ms = 310;
//        as = 150;

    }

    DotaHero(int hp, int mp, int agility, int strength, int intelligence, int armor, int damage, int ms, int as) {
        DotaHero.hp = hp;
        DotaHero.mp = mp;
        DotaHero.agility = 20;
        DotaHero.strength = 25;
        DotaHero.intelligence = 18;
        DotaHero.armor = 2;
        DotaHero.damage = 52;
        DotaHero.ms = 310;
        DotaHero.as = 150;

        System.out.println(hp);
        System.out.println(mp);
        System.out.println(agility);
        System.out.println(strength);
        System.out.println(intelligence);
        System.out.println(armor);
        System.out.println(damage);
        System.out.println(ms);
        System.out.println(as);
    }
}
