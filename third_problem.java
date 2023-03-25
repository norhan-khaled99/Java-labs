public class third_problem {
    public static void main(String[] args) {
        if (args.length == 2) {
            int num = Integer.parseInt(args[0]);
            String str = args[1];
            for (int i = 0; i < num; i++) {
                System.out.println(str);
            }
        } else {
            System.out.println("Please provide exactly two input arguments: a number and a string.");
        }
    }
}
    