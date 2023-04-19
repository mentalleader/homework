package study;

public class 5_Array_1 {
	public static void main(String[] args) {
	// for문으로 변경하여 배열에 값을 할당할 수 있도록 변경하라. (배열 선언과 메모리 할당도 수행하도록)
	// score[0] = 0; score[1] = 10; ... score[4]= 40;
		int[] score = new int[5];
		for (int i=0; i<score.length; i++) {
			score[i] = 10*i;
			System.out.println("score[" + i + "] = " + score[i]+";");
		}
		System.out.println("\n");
		
		
	//byte 5개 짜리 배열을 선언하여 메모리를 할당하고, 적당한 값 (1,2,3,4,5)를 할당하시오
		byte[] a = new byte[5];
		for (int i=0; i<a.length; i++) {
			a[i] = (byte)(i+1);
			System.out.print(a[i]+",");
		}
		System.out.println("\n");
		
	//char 5개 짜리 배열을 선언하여 메모리를 할당하고, 적당한 값 (A,B,C,D,E)를 할당하시오
		char[] b = new char[5];
		for (int i=0; i<b.length; i++) {  
			b[i] = (char)('A' + i);			// 'A'를 숫자로 인식함.
			System.out.print(b[i] + ","); 
		}
		System.out.println("\n");
		
	//boolean 5개 짜리 배열을 선언하여 메모리를 할당하고, 적당한 값 (false,true,false,true,false)를 할당하시오
		boolean[] c = new boolean[5];
		for (int i=0; i<c.length; i++) {
			if (i%2==0 || i==0) {
				c[i] = false;
			} else {
				c[i] = true;
			}
			System.out.print(c[i] + ",");
		}
		System.out.println("\n");
		
	//short 5개 짜리 배열을 선언하여 메모리를 할당하고, 적당한 값 (100,200,300,400,500)를 할당하시오
		short[] d = new short[5];
		for (int i=0; i<d.length; i++) {
			d[i] = (short)(i*100 + 100);
			System.out.print(d[i] + ",");
		}
		System.out.println("\n");
		
	//long 5개 짜리 배열을 선언하여 메모리를 할당하고, 적당한 값 (90,135,180,225,270)를 할당하시오
		long[] e = new long[5];
		for (int i=0; i<e.length; i++) {
			e[i] = 90 + 45*i;
			System.out.print(e[i] + ",");
		}
		System.out.println("\n");
		
	//float 5개 짜리 배열을 선언하여 메모리를 할당하고, 적당한 값 (3.14, 6.28, 9.42, 12.56, 15.700001)를 할당하시오
		float[] f = new float[5];
		for (int i=0; i<f.length; i++) {
			f[i] = 3.14f*(i+1);
			System.out.print(f[i] + ", ");
		}
		System.out.println("\n");
		
	//double 5개 짜리 배열을 선언하여 메모리를 할당하고, 적당한 값 (3.141592, 3.141592, 3.141592, 3.141592)를 할당하시오
		double[] g = new double[5];
		for (int i=0; i<g.length; i++) {
			g[i] = 3.141592;
			System.out.print(g[i] + ", ");
		}
		System.out.println("\n");
	
		
	// 1에서 100까지 정수를 기억시키고 그 합을 구하는 프로그램을 만드시오.
		int[] h = new int[100];
		int sumH = 0;
		for (int i=0; i<100; i++) {
			h[i] = i+1;
			System.out.print(h[i]+",");
			sumH += h[i];
		}
		System.out.println();
		System.out.println(sumH + "\n");
		
		
	// 배열 k에는 2,10,8,5,3,9 의 값이 들어있다. 배열 k에 들어있는 값들의 합을 구하여라.
		int[] k = {2,10,8,5,3,9};
		int sumK = 0;
		for (int i=0; i<k.length; i++) {
			sumK += k[i];
		}
		System.out.println("배열 k의 2,10,8,5,3,9의 합은 " + sumK + "입니다." + "\n");
		
		
	// 배열 ch에는 'a','p','p','l','e'가 저장되어있다. 배열의 순서대로 문자를 출력하고, 또한 역순으로 출력하시오.
		char[] ch = {'a','p','p','l','e'};
		for (int i=0; i<ch.length; i++) {		// 순서대로 출력
			System.out.print(ch[i] + ",");
		}
		System.out.println();
		for (int i=ch.length-1; i>=0; i--) {	// 역순으로 출력
			System.out.print(ch[i] + ",");
		}
		System.out.println("\n");
		
		
	// int의 10개 공간의 배열을 선언하여 메모리 할당하고, 1,10,100,1000,...의 값을 할당하라.
		int [] m = new int[10];
		int sumM = 0;
		for (int i=0; i<m.length; i++) {
			m[i] = (int)Math.pow(10, i);
			System.out.print(m[i] + ",");
	// 위 배열의 합을 구하시오
			sumM += m[i];
			System.out.println();
		}
		System.out.println("1,10,100,...10^9의 합은 " + sumM + "입니다." + "\n");
	// 위 배열의 [0],[1]의 값을 비교하여 더 큰수의 배열의 첨자(index)를 출력하라.
		int maxA = m[0];
		int ii;
		for (ii=0; ii<2; ii++) {
			if (m[ii]>=maxA) {
				maxA = m[ii];
			}
		}
		System.out.println("더 큰 수는 " + maxA + "로 그 첨자는 " + (ii-1) + "입니다." + "\n");
	// 위 배열의 [0],[1],[2]의 값을 비교하여 더 큰수의 배열의 첨자(index)를 출력하라.
		int maxB = m[0];
		int iii;
		for (iii=0; iii<3; iii++) {
			if(m[iii]>=maxB) {
				maxB = m[iii];
			}
		}
		System.out.println("더 큰 수는 " + maxB + "로 그 첨자는 " + (iii-1) + "입니다." + "\n");
		
		
	// 아래 프로그램의 결과를 출력해보고, 어떤 프로그램인지 쓰시오.
		int[] n = new int[10];
		int key = 8;
		//초기화
		for (int i=0; i<10; i++) {
			n[i] = i;
		}
		
		for (int i=0; i<10; i++) {
			System.out.println(n[i]);
			if (key == n[i]) {
				System.out.println("key찾음.");		// 0,1,2,3,4,5,6,7,8,key찾음.
				break;
			}
		}
		System.out.println("\n");
		
		
	// 0부터 9까지 println 할 수 있도록 for문을 작성하시오.
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
	// 다음 sumP가 그 전의 sumP에다 p[0]부터 p[5]까지 더한 for문을 작성하시오.
		int[] p = new int[6];
		int sumP=0;
		for (int i=0; i<6; i++) {
			sumP += p[i];
		}
		
		// 다음 구문을 동작할 수 있도록 for문을 작성하시오. ex) num[1]=10; num[2]=100;..num[4]=10000;
		int[] num = new int[4];
		for (int i=0; i<num.length; i++) {
			System.out.println("num[" + (i+1) + "] = " + (int)Math.pow(10, i) + ";");
		}
		System.out.println();
	// 다음 구문을 동작할 수 있도록 for문을 작성하시오. ex) num[1]=1; num[2]=1;..num[5]=1;
		int[] numb = new int[6];
		for (int i=0; i<numb.length; i++) {
			System.out.println("numb[" + i + "] = 1;");
		}
		System.out.println();
	// 다음 구문을 동작할 수 있도록 for문을 작성하시오. ex) num[1]=10; num[2]=100;..num[4]=10000;
		int[] number = new int[6];
		for (int i=0; i<number.length; i++) {
			System.out.println("number[" + i + "] = " + (i+1) + ";");
		}
		System.out.println();
		
		
	// 다음 구문을 동작할 수 있도록 for문을 작성하시오. ex) numbe[0]=1, numbe[1]=3,....,numbe[5] = 11;
		int[] numbe = new int[6];
		for (int i=0; i<numbe.length; i++) {
			System.out.println("numbe[" + i + "] = " + (2*i+1) + ";");
		}
		System.out.println();
	// 다음 구문을 동작할 수 있도록 for문을 작성하시오. ex) numbe[0]=1, numbe[1]=3,....,numbe[5] = 11;
		int[] nu = new int[6];
		for (int i=0; i<nu.length; i++) {
			System.out.println("nu[" + i + "] = " + 10*(i+1) + ";");
		}
		System.out.println();
	// 다음 구문을 동작할 수 있도록 for문을 작성하시오. ex) n[1]=1, n[3]=9, n[5]=25, n[7]=49, n[9]=81
		int[] na = new int[5];
		for (int i=0; i<na.length; i++) {
			System.out.println("na[" + (2*i+1) + "] = " + (int)Math.pow((2*i+1), 2) + ";");
		}
		System.out.println();
	}
}
