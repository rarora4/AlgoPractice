package union;

public class QuickUnionImproved{
    
    private int[] id;
    private int[] sz;
    
    public QuickUnionImproved(int N){
        id = new int[N];
	sz = new int[N];
        for(int i = 0; i<N; i++){
            id[i] = i;    
	}
    }
    
    public int root(int i){
	while(i != id[i])
		i = id[i];
	return i;
    }

    public boolean connected(int p, int q){
        
        if( root(p) == root(q))
            return true;
        return false;
    }
    
    public void union(int p, int q){
        
	int rootP = root(p);
	int rootQ = root(q);
	if(sz[rootP] < sz[rootQ]){
		id[rootP] = rootQ;
		sz[rootQ] += sz[rootP];
	}
	else{
		id[rootQ] = rootP;
		sz[rootP] += sz[rootQ];
	}
    }
}
