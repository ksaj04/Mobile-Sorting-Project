package mobileSortProject;
import java.util.Arrays;
import java.util.Scanner;

public class RealmeTest {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			RealmeMobiles m1=new RealmeMobiles("Realme      C51",4,64,5,5000,30255,2744,8999);
			RealmeMobiles m2=new RealmeMobiles("Realme      C53",6,64,8,5000,51809,4185,10999);
			RealmeMobiles m3=new RealmeMobiles("Realme      C55",4,64,8,5000,63229,5386,10999);
			RealmeMobiles m4=new RealmeMobiles("Realme narzoN55",4,64,8,5000,1363,154,10145);
			RealmeMobiles m5=new RealmeMobiles("Realme       10",4,64,16,5000,14044,2210,10999);
			RealmeMobiles m6=new RealmeMobiles("Realme 11pro-5G",8,256,16,5000,44897,4176,24999);
			RealmeMobiles m7=new RealmeMobiles("Realme    11 5G",8,128,16,5000,22038,2184,18999);
			
			RealmeMobiles r[]= {m1,m2,m3,m4,m5,m6,m7};
			
			for(RealmeMobiles n:r)
			{
				System.out.println(n);
			}
			
			Scanner s=new Scanner(System.in);
			boolean b=true;
			
			do
			{
				System.out.println("1.Name\n2.Ram\n3.Rom\n4.Positive Review\n5.Negative Review\n6.Price\n7.Exit");
				int a=s.nextInt();
				
				switch (a)
				{
				case 1:
					System.out.println("Sort by MobileName");
					System.out.println("--------------------------------------");
					Arrays.sort(r,new SortByName());
					for(RealmeMobiles w:r)
					{
						System.out.println(w);
					}
					break;
				case 2:
					System.out.println("Sort by Ram");
					System.out.println("--------------------------------------");
					Arrays.sort(r,new SortByRam());
					for(RealmeMobiles w:r)
					{
						System.out.println(w);
					}
					break;
				case 3:
					System.out.println("Sort by Rom");
					System.out.println("--------------------------------------");
					Arrays.sort(r,new SortByRom());
					for(RealmeMobiles w:r)
					{
						System.out.println(w);
					}
					break;
				case 4:
					//Descending Order
					System.out.println("Sort by Positive Review");
					System.out.println("--------------------------------------");
					Arrays.sort(r,new SortByPositiveReview());
					for(RealmeMobiles w:r)
					{
						System.out.println(w);
					}
					break;
				case 5:
					
					System.out.println("Sort by Negative Review");
					System.out.println("--------------------------------------");
					Arrays.sort(r,new SortByNegativeReview());
					for(RealmeMobiles w:r)
					{
						System.out.println(w);
					}
					
					break;
				case 6:
					
					System.out.println("Sort by Price");
					System.out.println("--------------------------------------");
					Arrays.sort(r,new SortByPrice());
					for(RealmeMobiles w:r)
					{
						System.out.println(w);
					}
					break;
				case 7:
					b=false;
					System.out.println("Thank You");
					break;
				default:
					System.out.println("Please Enter the valid Number");
					
				}
					
			}while(b);
		}


	}


