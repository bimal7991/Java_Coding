package codechef;
import java.util.Scanner;
import java.util.*;
import java.io.*;
class FACTTREE2 {
	static int minEdgeBFS(Vector <Integer> edges[], int u, 
			int v, int n) 
	{ 

		Vector<Boolean> visited = new Vector<Boolean>(n); 

		for (int i = 0; i < n; i++) { 
			visited.addElement(false); 
		} 


		Vector<Integer> distance = new Vector<Integer>(n); 

		for (int i = 0; i < n; i++) { 
			distance.addElement(0); 
		} 


		Queue<Integer> Q = new LinkedList<>(); 
		distance.setElementAt(0, u); 

		Q.add(u); 
		visited.setElementAt(true, u); 
		while (!Q.isEmpty()) 
		{ 
			int x = Q.peek(); 
			Q.poll(); 

			for (int i=0; i<edges[x].size(); i++) 
			{ 
				if (visited.elementAt(edges[x].get(i))) 
					continue; 


				distance.setElementAt(distance.get(x) + 1,edges[x].get(i)); 
				Q.add(edges[x].get(i)); 
				visited.setElementAt(true,edges[x].get(i)); 
			} 
		} 
		return distance.get(v); 
	} 

	static final int MAXN = 10000001;
	static int spf[] = new int[MAXN];
	static int M = 1000000007;
	static HashMap<Integer, Integer> purpose = new HashMap<>();

	public static void main(String[] args) {
		Reader sc = new Reader();
		sieve();
		try {
			int t = sc.nextInt();

			while (t != 0) {t--;
			int ktree[]=new int[1000];
			int Ansa=0;
			int PASA=0;
			int ZZ=0;
			int V = sc.nextInt();

			graph gra = new graph(V);

			for (int i = 0; i < V - 1; i++) {
				int u = sc.nextInt(), v = sc.nextInt();
				gra.gra[u].add(v);
				gra.gra[v].add(u);
			}

			gra.dfs(1, 0, 0);
			int[] qu = new int[V + 1];
			// initialization of quotient factors
			int max=0;
			for (int i = 1; i <= V; i++)
			{
				qu[i] = sc.nextInt();
				if(qu[i]>max)
					max=qu[i];
			}
			// Now the query part begins
			int q = sc.nextInt(); // number of query
			for (int i = 0; i < q; i++) {

				int s = sc.nextInt(), d = sc.nextInt();


				gra.path_nikalana(s, d);
				//System.out.println(gra.res);
				
				int primefact[]=new int[max+1];
			
					 for (int l : gra.res)
	                        factorisaation_nikalana(qu[l]);
					
				
				long product = 1; 
				
				
				

				


                for (HashMap.Entry<Integer, Integer> temp : purpose.entrySet())
                {
                   product=product*(temp.getValue()+1);
                   product=product%M;
                }
                	
                   // product = answer_nikalana_bada(product, temp.getValue() + 1, M);

                System.out.print(product+"\n");
                gra.res.clear();
                purpose.clear();

			 }
			}
		} catch (Exception ex) {

		}
	}

	static long answer_nikalana_bada(long a, long b, long mod) {

		// Initialize result
		long res = 0;


		a %= mod;

		while (b > 0) {

			// If b is odd, add a with result
			if ((b & 1) > 0) {
				res = (res + a) % mod;
			}

			// Here we assume that doing 2*a
			// doesn't cause overflow
			a = (2 * a) % mod;

			b >>= 1; // b = b / 2
		}
		return res;
	}
	//sieve function is used
	static void sieve() {
		spf[1] = 1;
		for (int i = 2; i < MAXN; i++)

			// marking smallest prime factor for every
			// number to be itself.
			spf[i] = i;


		for (int i = 4; i < MAXN; i += 2)
			spf[i] = 2;

		for (int i = 3; i * i < MAXN; i++) {

			if (spf[i] == i) {

				for (int j = i * i; j < MAXN; j += i)

					// marking spf[j] if it is not
					// previously marked
					if (spf[j] == j)
						spf[j] = i;
			}
		}
	}
	//this return factorization result
	static void factorisaation_nikalana(int x) {
        while (x != 1) {
            if (purpose.containsKey(spf[x])) {
                int r = purpose.get(spf[x]);
                purpose.replace(spf[x], ++r);
            } else
                purpose.put(spf[x], 1);
            x = x / spf[x];
        }
    }
}
//creates graph
class graph {
	ArrayList<Integer>[] gra;
	boolean[] visit;
	Stack<Integer> res = new Stack<>();
	int[] depp, par;
	//graph initialization
	graph(int v) {
		gra = new ArrayList[v + 1];
		visit = new boolean[v + 1];
		depp = new int[v + 1];
		par = new int[v + 1];
		for (int i = 0; i < gra.length; i++)
			gra[i] = new ArrayList<>();
	}
	// giving dfs path searches
	void dfs(int curr, int x, int d) {
		depp[curr] = d;
		par[curr] = x;
		visit[curr] = true;

		if (!gra[curr].isEmpty()) {
			for (int node : gra[curr]) {
				if (!visit[node]) {
					dfs(node, curr, d + 1);
				}
			}
		}
	}
	// path giving function
	void path_nikalana(int var1, int var2) {
		res.add(var1);
		res.add(var2);
		while (var1 != var2) {
			int depthvar1 = depp[var1];
			int depthvar2 = depp[var2];
			if (depthvar1 > depthvar2) {
				res.add(par[var1]);
				var1 = par[var1];
			} else if (depthvar1 < depthvar2) {
				res.add(par[var2]);
				var2 = par[var2];
			} else if (depthvar1 == depthvar2) {
				res.add(par[var1]);
				res.add(par[var2]);
				var1 = par[var1];
				var2 = par[var2];
			}
		}
		res.pop();
	}
}

class Reader 
{ 
	final private int BUFFER_SIZE = 1 << 16; 
	private DataInputStream din; 
	private byte[] buffer; 
	private int bffrPnt, bytesRead; 
	//reader function
	public Reader() 
	{ 
		din = new DataInputStream(System.in); 
		buffer = new byte[BUFFER_SIZE]; 
		bffrPnt = bytesRead = 0; 
	} 
	//read file string
	public Reader(String file_name) throws IOException 
	{ 
		din = new DataInputStream(new FileInputStream(file_name)); 
		buffer = new byte[BUFFER_SIZE]; 
		bffrPnt = bytesRead = 0; 
	} 
	//read string
	public String readLine() throws IOException 
	{ 
		byte[] buf = new byte[64]; // line length 
		int cnt = 0, c; 
		while ((c = read()) != -1) 
		{ 
			if (c == '\n') 
				break; 
			buf[cnt++] = (byte) c; 
		} 
		return new String(buf, 0, cnt); 
	} 
	//read int value
	public int nextInt() throws IOException 
	{ 
		int ret = 0; 
		byte c = read(); 
		while (c <= ' ') 
			c = read(); 
		boolean neg = (c == '-'); 
		if (neg) 
			c = read(); 
		do
		{ 
			ret = ret * 10 + c - '0'; 
		}  while ((c = read()) >= '0' && c <= '9'); 

		if (neg) 
			return -ret; 
		return ret; 
	} 
	//read long value
	public long nextLong() throws IOException 
	{ 
		long ret = 0; 
		byte c = read(); 
		while (c <= ' ') 
			c = read(); 
		boolean neg = (c == '-'); 
		if (neg) 
			c = read(); 
		do { 
			ret = ret * 10 + c - '0'; 
		} 
		while ((c = read()) >= '0' && c <= '9'); 
		if (neg) 
			return -ret; 
		return ret; 
	} 
	// read double value
	public double nextDouble() throws IOException 
	{ 
		double ret = 0, div = 1; 
		byte c = read(); 
		while (c <= ' ') 
			c = read(); 
		boolean neg = (c == '-'); 
		if (neg) 
			c = read(); 

		do { 
			ret = ret * 10 + c - '0'; 
		} 
		while ((c = read()) >= '0' && c <= '9'); 

		if (c == '.') 
		{ 
			while ((c = read()) >= '0' && c <= '9') 
			{ 
				ret += (c - '0') / (div *= 10); 
			} 
		} 

		if (neg) 
			return -ret; 
		return ret; 
	} 
	//read file buffer
	private void fillBuffer() throws IOException 
	{ 
		bytesRead = din.read(buffer, bffrPnt = 0, BUFFER_SIZE); 
		if (bytesRead == -1) 
			buffer[0] = -1; 
	} 
	//return buffer value
	private byte read() throws IOException 
	{ 
		if (bffrPnt == bytesRead) 
			fillBuffer(); 
		return buffer[bffrPnt++]; 
	} 
	//check for null values
	public void close() throws IOException 
	{ 
		if (din == null) 
			return; 
		din.close(); 
	} 
}