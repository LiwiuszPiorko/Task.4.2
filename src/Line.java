public class Line {

    public Point start;
    public Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    public double getLength(){
        double X =Math.pow((end.getX())-(start.getX()*2);
        double Y =Math.pow((end.getY()-(start.getY()*2);
        double length= Math.sqrt(X+Y);
        return length;
    }
    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
}