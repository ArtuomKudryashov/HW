package HW_6;

public class App {
    public static void main(String[] args) {
        Fighter fighter = new Fighter( "Artuom", 8 , 5);
        Fighter fighter2 = new Fighter( "Bob", 12, 4);
        System.out.println(declareWinner(fighter,fighter2,"Artuom"));

    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        while (fighter1.health >0 && fighter2.health>0){
            fighter1.health-= fighter2.damagePerAttack;
            fighter2.health-= fighter1.damagePerAttack;

        }
        if(fighter1.health<=0 && fighter2.health<=0){
            return firstAttacker;
        }else  if (fighter1.health>fighter2.health){
            return  fighter1.name;

        }else{
            return fighter2.name;
        }

    }
}
