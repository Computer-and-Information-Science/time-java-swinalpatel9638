import java.time.Instant;

public class Time {
    public static void main(String[] args) {
        
    

int currentHour;
int currentTime;
int currentMinutes;
int currentSeconds ;

currentHour = 14;
currentMinutes = 30;
currentSeconds = 59;
int numberOfSecondsSinceMidnight = currentHour*60*60 + currentMinutes *60 + currentSeconds;

System.out.print("Number of seconds since midnight: " );
System.out.println(currentHour*60*60 + currentMinutes *60 + currentSeconds);

int hourRemaining = 9;
int minutesRemaining = 29;
int secondsRemaining = 1;
int numberOfSecondsRemainingInADay = hourRemaining*60*60 + minutesRemaining*60 + secondsRemaining;

System.out.print("Number of seconds remaining in the day : ");
System.out.println(hourRemaining*60*60 + minutesRemaining*60 + secondsRemaining);


double passedHour = 14.0;
double passedMinutes = 30.0;
double passedSeconds = 59;

double totalPassedSeconds = passedHour * 3600 + passedMinutes * 60 + passedSeconds;
double fractionOfDayPassed = totalPassedSeconds / 86400.0;

System.out.print("The fraction of the day passed is: ");
System.out.println(fractionOfDayPassed);

System.out.print("The percentage of the day passed is: ");
System.out.println(fractionOfDayPassed * 100 + "%");

int currentTimeHour = 17;
int currentTimeMinutes = 17;
int currentTimeSeconds = 17;

int currentTimeTotalSeconds = currentTimeHour*60*60 + currentTimeMinutes*60 + currentTimeSeconds;

int elapsedTimeSeconds = currentTimeTotalSeconds - numberOfSecondsSinceMidnight;

System.out.print("The elapsed time  seconds are ");

System.out.println(elapsedTimeSeconds = currentTimeTotalSeconds - numberOfSecondsSinceMidnight);

int elapsedHours =  elapsedTimeSeconds / 3600;
int elapsedMinutes = (elapsedTimeSeconds % 3600) / 60;
int elapsedSecs = elapsedTimeSeconds % 60;

System.out.println("Elapsed time: " + elapsedHours + " hours " + elapsedMinutes + " minutes " + elapsedSecs + " seconds");




    }








}
