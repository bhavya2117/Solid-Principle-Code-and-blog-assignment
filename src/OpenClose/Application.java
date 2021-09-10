package OpenClose;

class Application {

    public double get_total_area(Rectangle[] geo_objects)
    {
        double area_sum = 0;

        for (Rectangle geo_obj : geo_objects) {
            area_sum += geo_obj.length * geo_obj.breadth;

        }
        return area_sum;
    }
}