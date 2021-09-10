package OpenClose;

public class OpenCloseP {

    public static void main(String args[])
    {
        Rectangle r = new Rectangle();

        r.length = 5;
        r.breadth = 10;

        Rectangle r2 = new Rectangle();

        r2.length = 2;
        r2.breadth = 4;


        Rectangle r3 = new Rectangle();

        r3.length = 3;
        r3.breadth = 12;

        Rectangle[] r_arr = new Rectangle[2];
        r_arr[0] = r;
        r_arr[1] = r2;

        Application app = new Application();

        double area = app.get_total_area(r_arr);

        System.out.println("The total area is " + area);
    }
}
