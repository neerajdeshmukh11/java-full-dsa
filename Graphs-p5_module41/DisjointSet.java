

public class DisjointSet {

    static int n = 7;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init(){
        for(int i=0;i<n;i++){
            par[i] = i;
        }
    }
    // O(1)
    public static int find(int x){
        if(x == par[x]){
            return x;
        }
        // normal
        // return find(par[x]);
        // t1
        return par[x] = find(par[x]);

    }
    // O(4k) k is constant or we can say constant O(1)
    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA] < rank[parB]){
            par[parA] = parB;
        }else{
            par[parB] = parA;
        }
    }
    // optimization technique - path compression t1

    public static void main(String[] args) {
        init();
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1, 5);
    }
}
