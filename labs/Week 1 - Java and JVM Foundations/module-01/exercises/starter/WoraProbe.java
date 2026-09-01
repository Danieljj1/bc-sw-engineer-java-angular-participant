public class WoraProbe {
    public static void main(String[] args) {
        // TODO: store System.getProperty("os.name") in a String variable
        // TODO: print the OS name
        // TODO: print "Bytecode runs on: " + that OS name
        String osName = System.getProperty("os.name");
        System.out.println(osName);
        System.out.println("Bytecode runs on: " + osName);
    }
}
