public class helloapp {

    public static void main(String[] args) {

        String name;

        // If no arguments, use default
        if (args.length == 0) {
            name = "World";
        }

        // If arguments exist, join all names
        else {
            name = String.join(", ", args);
        }

        System.out.println("Hello, " + name + "!");
    }
}