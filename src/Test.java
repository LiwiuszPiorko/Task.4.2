import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 2);
        Line line1 = new Line(point1, point2);
        Point point3 = new Point(0, 0);
        Point point4 = new Point(3, 3);
        Line line2 = new Line(point3, point4);

        Line check = new Line(point1, point2);
        double getLength = check.getLength();
        System.out.print("Odcinek pierwszy ma długość: " + getLength);

        Line check2 = new Line(point3, point4);
        double getLength2 = check2.getLength();
        System.out.println("\nOdcinek drugi ma długość: " + getLength2);

        LineComparator finalCheck = new LineComparator();
        boolean LineComparator = finalCheck.LineComparator(getLength, getLength2);

        if (LineComparator) {
            System.out.println("Odcinek pierwszy jest krótszy niż odcinek drugi!");
        } else {
            System.out.println("Odcinek pierwszy jest dłuższy niż odcinek drugi!");
            }
        }
    }

