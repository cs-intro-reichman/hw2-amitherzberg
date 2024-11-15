public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt (args[1]);

        System.out.println("Hours: " + hours);
        System.err.println("Minutes: " + minutes);
        System.out.println("Minutes to add: " + minutesToAdd);

        int totalMinutes = hours*60 + minutes + minutesToAdd;
        int totalHours = totalMinutes/60;
        int newHours = totalHours%24;
        int newMinutes = totalMinutes-(totalHours*60);

        System.out.println("New hours: " + newHours);
        System.out.println("New minutes: " + newMinutes);

        String hoursStr = "" + newHours;
        String minutesStr = "" + newMinutes;

        if (0 <= newHours && newHours < 10) {
            hoursStr = "0" + newHours;
        } 
        
        if (0 <= newMinutes && newMinutes < 10) {
            minutesStr = "0" + newMinutes;
        }
        
        System.out.println(hoursStr + ":" + minutesStr);
    }
}

            
    

