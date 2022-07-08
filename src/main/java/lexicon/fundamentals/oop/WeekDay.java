
package lexicon.fundamentals.oop;
public enum WeekDay {
    MONDAY(8),TUESDAY(7),WEDNESDAY(8),THURSDAY(7),FRIDAY(8),
    SATURDAY(){
        public void printInfo(){
            System.out.println("Closed");
        }},
    SUNDAY(){
        public void printInfo(){
            System.out.println("Closed");
        }

    };
    private int startingHour;
    private WeekDay(int startingHour){
        this.startingHour=startingHour;
    }

    WeekDay() {
       this.startingHour=0;

    }

    public int getStartingHour(){
        return startingHour;
    }

    public void printInfo(){
        System.out.println("Opening Hour " + startingHour+"- "+(startingHour+8));
    }
}
