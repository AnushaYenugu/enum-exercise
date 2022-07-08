package lexicon.fundamentals.oop;

public class Main {
    public static void main(String[] args) {
// WeekDay enum
        WeekDay today=WeekDay.THURSDAY;
        System.out.println(today);
        System.out.println(WeekDay.FRIDAY);
        System.out.println(WeekDay.values().length);


        WeekDay.SATURDAY.printInfo();
        System.out.println(WeekDay.MONDAY.getStartingHour());
        WeekDay.WEDNESDAY.printInfo();

// Planet

        Planet p=Planet.EARTH;
        Planet.EARTH.printOutMass();
        System.out.println(Planet.EARTH.getRadius());

        for (Planet planets: Planet.values()) {
            System.out.println("Planet Name: "+planets+"........"+ "Mass: "+planets.getMass()+"........."+planets.getRadius()+ "  Position of planet: "
            +(planets.ordinal()+1));

        }

        Planet mars=Planet.MARS;
        System.out.println(mars);

        //Fish

        // Without constants we cannot call the methods from enum
        System.out.println(Fish.values());
        Fish.STAR.fishMethod();



        //Dice Exercise

        Dice d6=Dice.D6;
        d6.rollDice();
        Dice.D10.rollDice();
        Dice.D20.rollDice();
        Dice.D100.rollDice();





    }
}