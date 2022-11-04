package program;

public class SubsetArray {
	public static boolean sub(int[] a,int[] b) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		if(count==a.length)
			return(true);
		else
			return false;
	}
    public static void main(String[]args) {
    	
    	int[] ar= {11,5,6};
    	int[] br= {11,2,5,6,11,11,3};
    	boolean b=sub(ar,br);
    	if(b==true)
    		System.out.println("Yes it is an subset");
    	else
    		System.out.println("No it is not an subset");
    	
    	
    	

    }
}
