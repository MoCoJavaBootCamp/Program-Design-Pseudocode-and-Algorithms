/*
declare class
declare method
declare vars foot, roof height, roof width, cubic dimensions, rainfall, cubic to gallon, gallons
convert height and width to inches
multiply h, w, rainfall to get cubic dimensions
divide by gallon to get gallons
print total gallons
*/
public class WaterRunOff {
    public static void main(String[] args) {
        int foot, height, width, cubicInches, rainfall, cubToGallons, gallons;
        foot = 12;
        height = 50;
        width = 20;
        rainfall = 1;
        cubToGallons = 231;
        cubicInches = (foot * height) * (foot * width) * rainfall;
        gallons = cubicInches / cubToGallons;

        System.out.printf("The total water run off from the roof in a rain storm is : %s gallons.", gallons);
    }
}
