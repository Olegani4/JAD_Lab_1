package lv.tsi;

public class Marathon {
    private String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
    private int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265};

    public void main() {
        System.out.println("Name\t Result");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%1$-9s", names[i]);
            System.out.printf(Integer.toString(times[i]) + '\n');
        }
    }
}