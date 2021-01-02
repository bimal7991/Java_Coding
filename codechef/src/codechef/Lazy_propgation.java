package codechef;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
public class Lazy_propgation {

	static int arr[]=new int[100001];
	static int st[][]=new int[400004][3];
	static int lazy[]=new int[400004];
	
	public static void main(String[] args) {
		try {
		Reader1 sc=new Reader1();
		
		int n=sc.nextInt(),q=sc.nextInt();
        buildTree(1,1,n);
        while(q-->0)
        {
        	int code=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
        	if(code==0)
        		updateTree(1,1,n,a+1,b+1);
        	else
        	{
        		System.out.println(query(1,1,n,a+1,b+1));
        	}
        	
        }
		}
		catch(Exception e) {
			
		}
        


	}
	private static int query(int si, int ss, int se, int qs, int qe) {
		
		// TODO Auto-generated method stub

		  if(lazy[si]!=0)
		  {
			  int dx=lazy[si];
			  lazy[si]=0;
			   if(ss!=se)
			   {
				   lazy[2*si]+=dx;
				   lazy[2*si+1]+=dx;
			   }
			   dx=dx%3;
			   for(int i=0;i<dx;i++)
			   {
				   shift(si);
			   }	   
		  }
		  if(ss>qe || se<qs)
			  return 0;
		  if(ss>=qs && se<=qe)
		  {
			  return st[si][0];
		  }
		  int mid=(ss+se)/2;
		 int l=query(2*si, ss, mid, qs, qe);
		 int r=query(2*si+1, mid+1, se, qs, qe);
		 
		 return l+r;
		  
		
		
	
	}
	private static void updateTree(int si, int ss, int se, int qs, int qe) {

		  if(lazy[si]!=0)
		  {
			  int dx=lazy[si];
			  lazy[si]=0;
			   if(ss!=se)
			   {
				   lazy[2*si]+=dx;
				   lazy[2*si+1]+=dx;
			   }
			   dx=dx%3;
			   for(int i=0;i<dx;i++)
			   {
				   shift(si);
			   }	   
		  }
		  if(ss>qe || se<qs)
			  return ;
		  if(ss>=qs && se<=qe)
		  {
			  shift(si);
			  if(ss!=se)
			  {
				  lazy[2*si]++;
				  lazy[2*si+1]++;
			  }
			  return;
		  }
		  
		  int mid=(ss+se)/2;
			updateTree(2*si, ss, mid, qs, qe);
			updateTree(2*si+1, mid+1, se, qs, qe);
			
			st[si][0]=st[2*si][0]+st[2*si+1][0];
			st[si][1]=st[2*si][1]+st[2*si+1][1];
			st[si][2]=st[2*si][2]+st[2*si+1][2];
			
			  
		
		
		
	}
	private static void shift(int si) {
		// TODO Auto-generated method stub
		int temp=st[si][2];
		st[si][2]=st[si][1];
		st[si][1]=st[si][0];
		st[si][0]=temp;
		
	}
	private static void buildTree(int si, int ss, int se) {
		// TODO Auto-generated method stub
		
		if(ss==se)
		{
			st[si][0]=1;
			st[si][1]=0;
			st[si][2]=0;
			return;
		}
		
		int mid=(ss+se)/2;
		buildTree(2*si, ss, mid);
		buildTree(2*si+1, mid+1, se);
		
		st[si][0]=st[2*si][0]+st[2*si+1][0];
		st[si][1]=st[2*si][1]+st[2*si+1][1];
		st[si][2]=st[2*si][2]+st[2*si+1][2];
		
		
	}
}
class Reader1 
{ 
	final private int BUFFER_SIZE = 1 << 16; 
	private DataInputStream din; 
	private byte[] buffer; 
	private int bffrPnt, bytesRead; 
	//reader function
	public Reader1() 
	{ 
		din = new DataInputStream(System.in); 
		buffer = new byte[BUFFER_SIZE]; 
		bffrPnt = bytesRead = 0; 
	} 
	//read file string
	public Reader1(String file_name) throws IOException 
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
