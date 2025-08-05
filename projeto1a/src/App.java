public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nHello world!");
        String version = System.getProperty("java.version");
        System.out.println("Running Java Version: "+version+"\n");
        String name = System.getProperty("user.name");
        System.out.println("User account name: "+name+"\n");
    }
}
