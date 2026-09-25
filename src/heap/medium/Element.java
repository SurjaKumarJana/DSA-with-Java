package heap.medium;

class Element implements Comparable<Element>{
    int val;
    int diff;

    public Element(int val, int x){
        this.val = val;
        int a = val-x;
        this.diff = (a>0)? a : (-1)*a;
    }
    public int compareTo(Element e){
        if(this.diff == e.diff) return Integer.compare(this.val,e.val);
        return Integer.compare(this.diff,e.diff);
    }
}