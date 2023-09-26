public class CommandLineArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No values");
        } else {
            StringBuilder result = new StringBuilder();
            for (String arg : args) {
                result.append(arg).append(",");
            }
            System.out.println(result.substring(0, result.length() - 1));
        }
    }
}
