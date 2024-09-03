class pr002 {
	public static void main(String args[]) {
		byte b, bb, bbb; //8-битная переменная
		short s, ss, sss; //16-битная переменная
		int i, ii, I; //32-биная переменная
		long l, ll, L; //64-биная переменная
		b = 127;
		bb = (byte)130;
		s = 32000;
		ss = (short)33000;
		System.out.println("bb = " + bb + "\nss = " + ss);
		sss = 100;
		//bbb = sss; Автопреоброзование типов запрещено, так как может привести к искажению данных
		bbb = (byte)sss;
		System.out.println("bbb = " + bbb + "\nsss = " + sss);

		// Пример использования различных целых типов 
		ii = 700000; //длина стороны куба в мм
		int V = ii*ii*ii; //объем куда в кубических мм
		System.out.println("Объем куда: " + V);
		long VV = (long)ii*ii*ii;
		System.out.println("Правильно вычесленный объем куба: " + VV);

		double d, dd;
		d = b/2;
		System.out.println("d = " + d);
		dd = (double)b/2;
		System.out.println("dd = " + dd);
	}
}
