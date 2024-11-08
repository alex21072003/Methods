public class Main {
    private static int totalPrise = 0;
    private static  int items = 0;

    public static void add(String name, int prise) {
        if(contains(name)){
            return;
        }
        items = Integer.parseInt(items + "\n" + " - " + prise);
        totalPrise = totalPrise + prise;
    }

    public int getTotalPrise() {
        return totalPrise;
    }
    static boolean contains(String name) {
        return items.contains(name);
    }

        }