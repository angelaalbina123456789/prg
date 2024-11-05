//управление доступом к членам класса
class Mod {
	private int alpha; //закрытая переменная
		public int beta; //открытая переменная
		int gamma; //переменная с доступа по умолчанию
		void setAlpha(int a) {
			alpha = a;
		}
		int getAlpha() {
			return alpha;
		}
}
//Прмер передачи объектов методом
class Block {
	int a, b, c;
	int V;

	Block(int i, int j, int k) {
		a = i;
		b = j;
		c = k;
		V = a * b * c;

	}

	//проверка эквивалентности двух параллелипипедов
	boolean sameBlock(Block ob) {
		if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
		else return false;
	}
	//Проверка равенства объемов
	boolean sameV(Block ob) {
		if(ob.V == V) return true;
		else return false;
	}
}
//класс отказаустойчивого массива
class FailSoftArray {
	private int[] a;
	private int errval;
	public int length;

	public FailSoftArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}

	public int get(int index) {
		if(indexOK(index))
			return a[index];
		return errval;
	}
	public boolean put(int index, int val) {
		if(indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}
	private boolean indexOK(int index) {
		if(index >= 0 & index < length)
			return true;
		return false;
	}
}
//класс для вызова метода с передачей параметров по значению
class CallByValue {
	void noChange(int i11, int j11) {
		i11 = i11 + j11;
		j11 = -j11;
	}
}
//класс для вызова метода по ссылке
class CallByRef {
	int a12, b12;
	CallByRef (int i12, int j12) {
		a12 = i12;
		b12 = j12;
	}
        void change(CallByRef ob5) {
                ob5.a12 = ob5.a12 + ob5.b12;
                ob5.b12 = -ob5.b12;
        }
}
//класс для возвращения объекта при возврате из метода
class ErrorMsg {
	String[] msgs = {
		"ошибка вывода", 
		"ошибка ввода",
		"переисполнение диска",
		"выход индекса за ганицы диапозона"
	};
	//возврат сообщений по ошибке
	String getErrorMsg(int i13) {
		if(i13>=0 & i13<msgs.length) return msgs[i13];
		else return "отсутствует код для ошибки";
	}
}

//возврат объекта определенного в программе
class Err {
	String msg; //сообщение об ошибке
	int severity; //уровеень серьезности ошибки
	Err(String m, int s) {
		msg = m;
		severity = s;
	}
}
class ErrorInfo {
	String[] msgs2 = {
		"ошибка вывода",
                "ошибка ввода",
                "переисполнение диска",
                "выход индекса за ганицы диапозона"
	};
	int[] howBad = {3, 3, 2, 4};
	Err getErrorInfo(int i14) {
		if(i14 >= 0 & i14 < msgs2.length)
			return new Err(msgs2[i14], howBad[i14]);
		else
			return new Err("отсутсвует код для ошибки", 0);
	}
}
//перегрузка методов
class Overload {
	void ovlDemo() {
		System.out.println("без параметров");
	}
	void ovlDemo(int a15) {
		System.out.println("один параметр типа int: " + a15);
	}
	int ovlDemo(int a15, int b15) {
		System.out.println("два параметра типа int: " + a15 + " " + b15);
		return a15 + b15;
	}
	double ovlDemo(double a15, double b15) {
		System.out.println("два параметра типа double: " + a15 + " " + b15);
		return a15 - b15;
	}
}
//влияние автопреобразование типов на перезагрузку методов
class Overload2 {
	void f(int x) {
		System.out.println("внутри f(int): " + x);
	}
	void f(double x) {
		System.out.println("внутри f(double): " + x);
	}
}
class pr007 {
	public static void main(String[] args) {
		Mod ob = new Mod();
		//изменение и просмотр значения закрытой переменной существляется через методы заданного класса Mod
		ob.setAlpha(77);
		System.out.println("Значение ob.alpha: " +  ob.getAlpha());
		// прямой доступ к переменной заперщен: ob.alpha = 100;
		ob.beta = 242;
		ob.gamma = 34;
		//пример использования класса отказ устойчивог поведения массива
		System.out.println();
		FailSoftArray fs = new FailSoftArray(5, -999);
		int x;

		//пример использования класса без вывода сообщений о неправильных  индексах
		System.out.println("скрытая от пользователя обработка ошибок: ");
		for(int i=0; i<(fs.length * 2); i++) 
			fs.put(i, i*10);

		for(int i=0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if(x != -999) System.out.println(x + " ");
		}
		System.out.println();

		//пример работы класса с выводом сооющений об ошибках
		
		for(int i=0; i<(fs.length * 2); i++)
                        if(!fs.put(i, i*10))
				System.out.println("Индекс " + i + " выходит за границы массива");

                for(int i=0; i < (fs.length * 2); i++) {
                        x = fs.get(i);
                        if(x != -999) System.out.println(x + " ");
			else 
				System.out.println("индекс " + i + " выходит за границы массива");
                }
                System.out.println();

		//пример исользования методов клсса с параметрами в виде объектов (класс block)
		System.out.println();
		Block ob1 = new Block(10, 2, 5);
		Block ob2 = new Block(10, 2, 5);
		Block ob3 = new Block(4, 5, 5);
		System.out.println("ob1 эквивалентин по размерам ob2: " + ob1.sameBlock(ob2));
		System.out.println("ob1 эквивалентин по размерам ob3: " + ob1.sameBlock(ob3));
		System.out.println("ob1 эквивалентин по размерам ob3: " + ob1.sameV(ob3));

		//пример передачи параметров объекту по значению
		System.out.println();
		CallByValue ob4 = new CallByValue();
		int a11 = 15, b11 = 20;

		System.out.println("a11 and b11 перед вызовом: " + a11 + " " + b11);

		ob4.noChange(a11, b11);
		System.out.println("a11 and b11 после вызова метода ob.noChange: " + a11 + " " + b11);
		//при передачи параметров методу объекта по значению, значение аргуметов не изменяются


		//прмер передачи параметров по ссылке
		System.out.println();
		CallByRef ob6 = new CallByRef(15, 20);

		System.out.println("ob6.a12 and 0b5.b12 перед вызовом: " + ob6.a12 + " " + ob6.b12);
		ob6.change(ob6);
		System.out.println("ob6.a12 and ob6.b12 после вызова метода ob6.Change: " + ob6.a12 + " " + ob6.b12);

		System.out.println();
		//пример возврата строки пр выполнение метода
		ErrorMsg err = new ErrorMsg();

		System.out.println(err.getErrorMsg(2));
		System.out.println(err.getErrorMsg(20));

		System.out.println();
		//пример возврата произвольного объекта, опреедленного в программе
		ErrorInfo err2 = new ErrorInfo();
		Err e;
		e = err2.getErrorInfo(2);
		System.out.println(e.msg + ", уровень серьезности: " + e.severity);
		e = err2.getErrorInfo(20);
                System.out.println(e.msg + ", уровень серьезности: " + e.severity);

		System.out.println();
		//демонстрация перезагрузки методов (overload)
		Overload ob7 = new Overload();
		int resI;
		double resD;

		ob7.ovlDemo();
		System.out.println();
		ob7.ovlDemo(2);
		System.out.println();
		resI = ob7.ovlDemo(4, 6);
		System.out.println("результат вызова ob7.ovlemo(4, 6): " + resI);
		System.out.println();
		resD = ob7.ovlDemo(5.1, 3.5);
                System.out.println("результт вызова ob7.ovlDemo(5.1, 3.5): "  + resD);
                System.out.println();

		//перезагрузка с автопреобразованием типов
		Overload2 ob8 = new Overload2();
		int i18 = 10;
		double d18 = 10.1;
		byte b18 = 99;
		short s18 = 10;
		float f18 = 11.5F;
		ob8.f(i18);
		ob8.f(d18);
		ob8.f(b18);
		ob8.f(s18);
		ob8.f(f18);


	}
}
