//рекурсия
class Factorial {
	int factR(int n) {
		int result;

		if(n==1) return 1;
		result = factR(n-1) * n;
		return result;
	}

	int factI(int n) {
		int t, result;
		result = 1;
		for(t=1; t<=n; t++)
			result *= t;
		return result;
	}
}

//статические переменные 
class StaticDemo {
	int x;
	static int y;

	int sum() {
		return x + y;
	}
}

class StaticBlock {
	static double rootOf2;
	static double rootOf3;
	static {
		System.out.println("внутри статического блока");
		rootOf2 = Math.sqrt(2.0);
		rootOf3 = Math.sqrt(3.0);
	}
	StaticBlock(String msg) {
		System.out.println(msg);

	}
}

class Outer {
	int[] nums;
	Outer(int[] n) {
		nums = n;
	}

	void analyze() {
		Inner inOb = new Inner();
		System.out.println("минимальное значение: " + inOb.min());
		System.out.println("максимальное значение: " + inOb.max());
		System.out.println("среднее значение: " + inOb.avg());

	}

	//внутренний класс
	class Inner {
		int min() {
			int m = nums[0];
			for(int i=1; i<nums.length; i++)
				if(nums[i] < m) m = nums[i];
			return m;
		}
		int max() {
                        int m = nums[0];
                        for(int i=1; i<nums.length; i++)
                                if(nums[i] > m) m = nums[i];
                        return m;
                }
		int avg() {
                        int a = 0;
                        for(int i=0; i<nums.length; i++)
                                a += nums[i];
                        return a/nums.length;
                }

	}
}

class VarArgs {
	static void vaTest(int ... v) {
		System.out.println("кол -во аргументов: " + v.length);
		System.out.println("содержимое массива аргументов: ");
		for(int i=0; i<v.length; i++)
			System.out.println(" аргумент " + i + ": " + v[i]);
		System.out.println();
	}
	static void vaTest2(String msg, int ... v) {
		System.out.println(msg + v.length);
		System.out.println("содержимое массива аргументов: ");
                for(int i=0; i<v.length; i++)
                        System.out.println(" аргумент " + i + ": " + v[i]);
                System.out.println();

	}
	static void vaTest3(int ... v) {
                System.out.println("vaTest3(int ...)" + " количество аргументов: " + v.length);
                System.out.println("содержимое массива аргументов: ");
                for(int i=0; i<v.length; i++)
                        System.out.println(" аргумент " + i + ": " + v[i]);
                System.out.println();

        }
	static void vaTest3(boolean ... v) {
                System.out.println("vaTest3(int ...)" + " количество аргументов: " + v.length);
                System.out.println("содержимое массива аргументов: ");
                for(int i=0; i<v.length; i++)
                        System.out.println(" аргумент " + i + ": " + v[i]);
                System.out.println();
        }
	static void vaTest3(String msg, int ... v) {
                System.out.println("vaTest3(String msg, int ...)" + " количество аргументов: " + v.length);
                System.out.println("содержимое массива аргументов: ");
                for(int i=0; i<v.length; i++)
                        System.out.println(" аргумент " + i + ": " + v[i]);
                System.out.println();
        }

}
class pr008 {
	public static void main(String[] args) {

		Factorial f = new Factorial();

		System.out.println("вычисление факторияала рекурсивным методом");
		System.out.println("факторияал 3 равен " + f.factR(3));
		System.out.println("факториал 4 равен " + f.factR(4));
		System.out.println("фактоияал 5 равен " + f.factR(5));

		System.out.println();

		System.out.println("вычисление факторияала рекурсивным методом");
                System.out.println("факторияал 3 равен " + f.factI(3));
                System.out.println("факториал 4 равен " + f.factI(4));
                System.out.println("фактоияал 5 равен " + f.factI(5));

		//демонтрация использования статической переменной
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();

		ob1.x = 10;
		ob2.x = 20;

		System.out.println("ob1.x and ob2.x независимы друг от друга");
		System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);

		System.out.println();
	
		System.out.println("статистическая переменная у является общей");
		StaticDemo.y = 19;
		System.out.println("для у=19");

		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());

		StaticDemo.y = 100;
                System.out.println("для у=100");

                System.out.println("ob1.sum(): " + ob1.sum());
                System.out.println("ob2.sum(): " + ob2.sum());

		//демонстрация работы статистического блока
		System.out.println();
		StaticBlock ob = new StaticBlock("Внктри конструктора");

		System.out.println("квадратный корень из 2: " + StaticBlock.rootOf2);
		System.out.println("квадратный корень из 3: " + StaticBlock.rootOf3);

		//демонсрация работы внутреннего класса
		int[] x = {3, 2, 1, 5, 6, 9, 7, 2};
		Outer outOb = new Outer(x);

		outOb.analyze();

		class ShowBt {
		        int numbits;
		        ShowBt(int n) {
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
					else 
						System.out.print("0");
					spacer++;
                        		if((spacer%8) == 0) {
						System.out.print(" ");
						spacer = 0;
                       		 }

               		 }
               		 System.out.println();
			}

	}
	System.out.println();
	for(byte b=0; b<10; b++) {
		ShowBt byteval = new ShowBt(8);
		System.out.print(b + "в двоичном виде: ");
		byteval.show(b);
	}

		System.out.println();
		//демонстрация вызова метода с переменным количеством аргументов
		VarArgs.vaTest(10);
		VarArgs.vaTest(1, 2, 3);
		VarArgs.vaTest();

		System.out.println();

		VarArgs.vaTest2("Один аргумент переменной длины: ", 10);
                VarArgs.vaTest2("два аргумента переменной длины: ", 1, 2, 3);
                VarArgs.vaTest2("без аргументов переменной длины ");

		System.out.println();

                VarArgs.vaTest3(10, 20);
                VarArgs.vaTest3("два аргумента переменной длины: ", 1, 2, 3);
                VarArgs.vaTest3(true, false, false);

        }
}

