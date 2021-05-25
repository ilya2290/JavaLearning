package dotaTesting;

public class OgreMagi extends Mage {
/* Обычный метод без имлемента
    public void aghanim3() {
        hp = hp + 175;
        mp = mp + 175;
        agility = agility + 10;
        strength = strength + 10;
        intelligence = intelligence + 10;
        System.out.println("Hp = " + hp + '\n' + "Mana = " + mp + '\n' + "Agility = " + agility + '\n' + "Strength = " + strength + '\n' + "Intelligence = " + intelligence);
    }
*/

    @Override
    public void aghanim( ) {
        hp = hp + 175;
        mp = mp + 175;
        agility = agility +10;
        strength = strength +10;
        intelligence = intelligence + 10;
        System.out.println("Hp = "+hp+'\n'+"Mana = "+mp+'\n'+ "Agility = "+agility+'\n'+"Strength = "+strength +'\n'+"Intelligence = "+intelligence);
        System.out.println("Additional Pidor Skill Enabled");
        super.aghanim(); // шо это???
    }
// Хуй проссы куда это девать
    @Override
    public void aghanimShard() {

    }


    public static void main(String[] args) {

        OgreMagi ogreMagi = new OgreMagi();
        hp = 200;
        mp = 75;
        agility = 14;
        strength = 23;
        intelligence =15;
        ogreMagi.aghanim();


    }









}
