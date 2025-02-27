package client;
import java.util.HashSet;

public class TimeLine {
    public static void main(String[] args) {
        // Sample timelines (multiple time strings)
        String[] timeLines = {"10:12:23", "11:22:33", "11:11:11", "12:34:56", "10:10:10"};

        // Variable to count how many timelines meet the condition
        int validTimelineCount = 0;

        // Process each timeline
        for (String timeLine : timeLines) {
            // HashSet to store unique digits in the timeline
            HashSet<Character> uniqueDigits = new HashSet<>();

            // Add each character of the timeline to HashSet if it's a number
            for (int i = 0; i < timeLine.length(); i++) {
                char c = timeLine.charAt(i);

                // Check if the character is a number
                if (Character.isDigit(c)) {
                    uniqueDigits.add(c);  // Adds only unique digits
                }
            }
            if(uniqueDigits.size()<=2){
                validTimelineCount++;
            }
        }

        // Output the result
        System.out.println("Total valid timelines (with fewer than 2 unique digits): " + validTimelineCount);
    }
}
