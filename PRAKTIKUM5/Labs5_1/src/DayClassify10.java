import java.util.Scanner;
public class DayClassify10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String DayName, dayType;
        System.out.print("Input day name: ");
        DayName = sc.nextLine();

        switch (DayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
            dayType = "weekday";
            case "saturday":
            case "sunday":
            dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";
        }
        System.out.println(DayName + "is a " + dayType);
    }    
}
