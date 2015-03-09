package union;

public class QuickUnion {
    
    private int[] id;
    
    public QuickUnion(int N){
        id = new int[N];
        for(int i = 0; i<N; i++)
            id[i] = i;    
    }
    
    private int root(int i){
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
	id[rootP] = rootQ;
    }
}
