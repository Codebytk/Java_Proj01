package chapter05.ex09;

public class Ex01 {

	public static void main(String[] args) {
		/*
		국어	영어	수학	과학		 국어	 영어  수학  과학	   국어  영어	수학	과학		 국어	 영어	 수학	 과학
  홍길동	70	88	77	99	이순신 80  68   87  79  김똘똘 60   86  87  30  홍길순 77  56  80  99
 for 문으로 출력
<출력>	국어  영어  수학  과학   <합계>  <평균>	 
===========================================
홍길동	70	 88	  77   99
이순신    80   68   87   79		 
김똘똘    60   86   87   30
홍길순    77   56   80   99
=========================================== 
<합계>
<평균>		 
		 */
				String[][]arr1=new String[4][5];
				int []sum=new int[4];
				double []evg=new double [4];
				for(int i=0; i<arr1.length; i++) {
					for(int j=0; j<arr1[i].length; j++) {
						arr1[i][j]= args[j+(i*5)];
					}
					for(int j=1; j<arr1[i].length; j++ ) {
						sum[i] +=Integer.parseInt(args[j+(i*5)]);
					}
					for(int j=1; j<arr1[i].length; j++) {
						evg[i] = sum[i]/4.0;
					}
				}
				int []sum2=new int[4];
				double []evg2=new double [4];
				for(int i=0, j=1; i< sum2.length; i++) {
					 for (j=1+i; j<args.length; j+=5) {
						 sum2[i] += Integer.parseInt(args[j]);
					 }
				}
				for(int i=0, j=1; i< sum2.length; i++) {
					 for (j=1+i; j<args.length; j+=5) {
						 evg2[i]=sum2[i]/4.0;
					 }
				}
				int a=(sum2[0]+sum2[1]+sum2[2]+sum2[3]);
				double b=a/4.0;
				double c=(evg2[0]+evg2[1]+evg2[2]+evg2[3]);
				double d=c/4.0;
				System.out.println("            국어    영어    수학     과학       합계    평균   ");
				System.out.println("=========================================================");
				for(int i=0; i<arr1.length; i++) {
					for(int j=0; j<arr1[i].length; j++) {
						System.out.print(arr1[i][j]+ "	   ");
					}
					System.out.println(""+sum[i]+"   "+evg[i]);
				}
				System.out.println("=========================================================");
				System.out.print("합계       ");
				for(int i=0; i< sum2.length; i++) {
						System.out.print(sum2[i]+ "     ");
					 }
				
				System.out.print(" "+a+"   ");
				System.out.print(b);
				System.out.println();
				System.out.print("통계     ");
				for(int i=0; i< sum2.length; i++) {
					System.out.print(evg2[i]+"    ");
					}
				System.out.printf(c+"  %4.1f",d);
				}

		}
