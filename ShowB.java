class ShowB {
	int numbits;
	ShowB(int n) {
		numbits = n;
	}
	void show(long val) {
		long mask = 1;
		//сдвиг влево значение 1
		mask <<= numbits-1;

		int spacer = 0;
		for(;mask!=0;mask>>>=1) {
			if((val & mask) != 0 )
				System.out.print("1");
			else System.out.print("0");
			spacer++;
			if((spacer%8) == 0) {
			       System.out.print(" ");
				spacer = 0;
			}
			
		}
		System.out.println();
	}
}
class ShowBits {
	public static void main(String[] args) {
		ShowB b = new ShowB(8);
		ShowB i = new ShowB(32);
		ShowB li = new ShowB(64);

		System.out.println("двоичное представления значения 123: ");
		b.show(123);

		System.out.println("двоичное представления значения 10203: ");
                i.show(10203);

		System.out.println("двоичное представления значения 5389612349L: ");
                li.show(5389612349L);
		
		System.out.println("Младшие 8 бит числа 10203: ");
               	b.show(10203);
		
		System.out.println();
		System.out.println("битовое представление ip - адреса 172.16.7.85: ");
		b.show(172);
		b.show(16);
		b.show(7);
		b.show(85);

	}
}
