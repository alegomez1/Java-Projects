package Room;

public class RoomConstructor {

    static double totalSurfaceArea = 0;

    //Functions used

    //Calculates the surface area and adds it to double totalSurfaceArea
    public void calcSurfaceArea(double length, double height){
        double surfaceArea = length*height;
        totalSurfaceArea += surfaceArea;
    }

    //Getters and setters
    public double getTotalSurfaceArea() {
        return totalSurfaceArea;
    }

    public void setTotalSurfaceArea(double totalSurfaceArea) {
        RoomConstructor.totalSurfaceArea = totalSurfaceArea;
    }
}
