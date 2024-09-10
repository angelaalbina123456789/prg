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

		//Символьный тип данных
		System.out.println("Примеры использование символьного типа\n");
		char ch = 'D';
		System.out.println("Значение ch: " + ch);
		ch++;
		System.out.println("Новое значение ch: " + ch);
		ch = 97;
		System.out.println("Значение ch с кодом 97: " + ch);
		I = (int)ch;
		System.out.println("Код ch: " + I);
		ch = 'А';
		for (i=0; i<63; i++) {
			I = (int)ch;
			System.out.print("Код символа " + ch + ": " + I + " \n");
			ch++;
		}

		//логический тип данных
		System.out.println("Примеры испльзования логического типа\n");
		boolean bool;
		bool = false;
		System.out.println("Значение bool: " + bool);
		bool = true;
		System.out.println("Значение bool: " + bool);
		if(bool) 
			System.out.println("Выводим сроку, если \"bool\" true");
		if(!bool)
		       	System.out.println("Выводим сроку, если инверсия  \"bool\" true");
		bool = (ch=='я');
		if(bool)
			System.out.println("Символ ch равен \"я\"");
	}
}
