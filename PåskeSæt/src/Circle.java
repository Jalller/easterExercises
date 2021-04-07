public class Circle {
    private double radius;
    //pi*r^2

    public void setRaidus(double raidus) {
        this.radius = raidus;

    }
    public double arealCircle() {
        if (this.radius<0) {
            throw new ArithmeticException("The radius can't be negative");
        }
        double areal;
        areal = Math.PI*(this.radius*this.radius);
        System.out.println(areal);
        return areal;
    }
}
