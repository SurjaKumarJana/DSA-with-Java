package heap.medium;


class Point implements Comparable<Point>{
    int x;
    int y;
    int distance;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
        this.distance = (x*x) + (y*y);
    }
    public int compareTo(Point b){
        return this.distance-b.distance;
    }

}
