package test11p;
import java.util.Scanner;

public class d {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of objects:");
		int n = input.nextInt();
		System.out.print("Enter the weights of objects:");
		int []a = new int[n];
		int []b = new int[n];
		int i,j=1,k=0,weight,flag=1;
		for (i=0;i<n;i++) {
			a[i] = input.nextInt();
			b[i] = 0;
		}
		while(k<6) {
			if (flag==1) {
				System.out.print("Container "+j+" contains objects with weight ");
				j++;
			}
			weight=a[k];
			if(weight<10 && b[k]==0) {
				b[k]=1;
				System.out.print(a[k]+" ");
				for(i=k+1;i<n;i++) {
					if (weight+a[i]<10 && b[i]==0) {
						weight+=a[i];
						System.out.print(a[i]+" ");
						b[i]=1;
					}
				}
				flag=1;
				System.out.println("");
			}else {
				flag=0;
			}
			k++;
		}
	}
}
