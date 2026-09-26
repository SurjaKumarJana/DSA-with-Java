package heap.medium;

class Pair implements Comparable<Pair>{
    int ele;
    int freq;

    public Pair(int ele, int freq){
        this.ele = ele;
        this.freq = freq;
    }

    public int compareTo(Pair pair){
        if(this.freq == pair.freq) return Integer.compare(this.ele, pair.ele);

        return Integer.compare(this.freq, pair.freq);
    }
}
