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
	}
}
