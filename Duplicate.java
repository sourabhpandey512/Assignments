package program;

public class Duplicate {
		
		public static void main(String[] args) {
			int a[] =new int[]{2,1,2,2,3,7,3};
			int b[]=new int[a.length];
			int i;
			for(int j=0;j<b.length;j++) {
				b[j]=-1;
			}
			for( i=0;i<a.length-1;i++) {
				int count=0;
				for(int j=i;j<a.length-1;j++) {
					if (a[i]==a[j+1])
							count++;
				}
				//System.out.println("c "+count);
				if(count>=1) {
					int c=0;
					for(int j=0;j<b.length;j++) {
						
						if(a[i]==b[j])
						{
							c++;
							break;
						}
					}
				if(c==0)
					b[i]=a[i];
				
				}
			}
			for(int j=0;j<b.length;j++) {
				if(b[j]>=0)
				System.out.println(b[j]);
			}
			
		}
	}

}
