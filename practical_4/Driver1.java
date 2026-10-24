package practical_4;
class ChatFilter {
    public static String filter(String[] logs, String value) {
        StringBuilder report = new StringBuilder();
        int count = 0;
        String lowervalue = value.toLowerCase();

        for (String line : logs) {
            String parts[] = line.split(" ", 3);

            if (parts.length < 3) {
                continue;
            }

            String time = parts[0];
            String name = parts[1];
            String message = parts[2];

            if (message.toLowerCase().contains(lowervalue)) {
                count++;
                report.append(time)
                      .append(" ")
                      .append(name)
                      .append(": ")
                      .append(message)
                      .append("\n");
            }
        }
        return "Matches: " + count + "\n" + report.toString();
    }
}

public class Driver1{
    public static void main(String[] args) {
        String[] logs = {
            "10:05 alice Hello there",
            "10:06 bob hi alice",
            "10:07 charlie"
        };
        
        String keyword = "hello";
        System.out.println(ChatFilter.filter(logs, keyword));
    }
}