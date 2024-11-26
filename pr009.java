//основа наследования
class TwoDShape {
	private double width;
	private double height;
	private String name;
	int common;
	//конструктор без параметров
	TwoDShape() {
		width = height = 0.0;
		name = "астрактная двумерная фигура";
	}
	//конструкторс двумя параметрами
	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
		System.out.println("внутри конструктора TwoDShape (double w, double h)");
	}
	//конструктор объекта с одинаковыми высотой и шириной
	TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}
	//конструктор объекта на базе существующего объекта
	TwoDShape(TwoDShape ob)  {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	void showDim() {
		System.out.println("Ширина и высота: " + width + " and " + height);
	}
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
	void setWidth(double w) {
		if(w>200)
			width = 200;
		else
			width = w;
	}
	void setHeight(double h) {
                if(h>290)
                        height = 290;
                else
                        height = h;
        }
	double area() {
		System.out.println("метод area() должен быть переопределен в подклассе");
		return 0.0;
	}
	String getName() {
		return name;
	}
}
class Triangle extends TwoDShape {
	String style;
	int common;

	//конструктор по умолчанию
	Triangle() {
		super();
		style = "отсутствует";
	}
	
	//конструктор c тремя параметрами
	Triangle(String s, double w, double h) {
		//вызов конструктора суперкласа
		super(w, h, "треугольник");
		//установка значений для переменных подкласса
		style = s;
		System.out.println("внутри конструктора TwoDShape (String s, double w, double h)");

	}
	//конструктор с одним параметров
	Triangle(double x) {
		super(x, "треугольник");
		style = "закрашенный";
	}
	//конструктор  бъекта на базе существуеющнго треугольника
	Triangle(Triangle ob) {
		super(ob);//передаем объект triangle конструктору суперкласса
		style = ob.style;
	}
	//конструктор с демонстрацией доступа с одноименной суперкласс
	Triangle(int a, int b) {
		super.common = a;
		common = b;
		System.out.println("значение common в суперклассе" + super.common);
		System.out.println("значение common в подклассе" + common);
	}
	double area() {
		return getWidth()*getHeight()/2;
	}
	void showStyle() {
		System.out.println("Стиль: " + style);
	}
}

class Rectangle extends TwoDShape {
	String outline;

	int common;
	//конструкторы
	Rectangle() {
		super();
		outline = "отсутсвует";
	}
	Rectangle(String o, double w, double h) {
		//вызов конструктора подкласса
		super(w, h, "прямоугольник");
		//установка значений для переменных суперкласса
		outline = o;
	}

	Rectangle(double x) {
		super(x, "прямоугольник");
		outline = "сплошная";
	}
	//конструктор с демонстрацией доступа с одноименной суперкласс
        Rectangle(int a, int b) {
                super.common = a;
                common = b;
        }

	//конструктор для создания прямоголника из существующего объекта
	Rectangle(Rectangle ob) {
		super(ob);
		outline = ob.outline;
	}

	double area() {
		return getWidth()*getHeight();
	}
	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		return false;
	}
	void showOutline() {
                System.out.println("Рамка: " + outline);
        }

}

//демонстрация строгой типизации при присваивания ссылок на объект
class X {
	int a;
	X(int i) {
		a = i;
	}
	void show() {
		System.out.println("значение a: " + a);
	}
	void show(String msg) {
	}
}

class Y {
	int a;
	Y(int i) {
		a = i;
	}
}
class Z extends X {
        int b;
        Z(int i, int j) {
		super(j);
                b = i;
        }
/*
	void show() {
		super.show();
		System.out.println("значение a and b: " + a + " " + b);
	}
*/	
	void show(String msg) {
		System.out.println(msg + b);
	}
}
class ColorTriangle extends Triangle {
	private String color;

	ColorTriangle (String c, String s, double w, double h) {
		super(s, w, h);
		color = c;
		System.out.println("внутри конструктора ColorTriangle (String c, String s, double w, double h)");

	}
	ColorTriangle (ColorTriangle ob) {
		super(ob);
		color = ob.color;
	}

	String getColor() {
		return color;
	}

	void showColor() {
		System.out.println("цвет: " + color);
	}
}
class pr009 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle("контурный", 8.0, 12.0);
		Triangle t3 = new Triangle(4.0);
		Triangle t4 = new Triangle(5, 10);
		ColorTriangle t5 = new ColorTriangle("синий", "контурный", 8.0, 12.0);
		ColorTriangle t6 = new ColorTriangle("красный", "закрашенный", 2.0, 5.0);
		Triangle t7 = new Triangle(t2);
		ColorTriangle t8 = new ColorTriangle(t5);
		Rectangle r1 = new Rectangle("сплошная", 4.0, 4.0);
		Rectangle r2 = new Rectangle(5.0);
		System.out.println();
/*		t1.setWidth(4.0);
		t1.setHeight(4.0);
		t1.style = "закрашенный";
		t2.setWidth(8.0);
                t2.setHeight(12.0);
                t2.style = "контурный";
		r1.setWidth(4.0);
		r1.setHeight(4.0);
		r1.outline = "сплошная";
		r2.setWidth(4.0);
                r2.setHeight(4.0);
                r2.outline = "пунктирная";
*/                 
		t1 = t2;

		System.out.println("Информация об объекте t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Площадь: " + t1.area());
		System.out.println();
		System.out.println("Информация об объекте t2: ");
                t2.showStyle();
                t2.showDim();
                System.out.println("Площадь: " + t2.area());
                System.out.println();
		System.out.println("Информация об объекте t3: ");
                t3.showStyle();
                t3.showDim();
                System.out.println("Площадь: " + t3.area());
                System.out.println();

		System.out.println("информация об объекте t5: ");
		t5.showStyle();
		t5.showDim();
		t5.showColor();
		System.out.println();

                System.out.println("Информация об объекте t7: ");
                t7.showStyle();
                t7.showDim();
                System.out.println("Площадь: " + t7.area());
		System.out.println();

		System.out.println("Информация об объекте t8: ");
                t8.showStyle();
                t8.showDim();
		t8.showColor();
                System.out.println("Площадь: " + t8.area());

		System.out.println();
                System.out.println("Информация об объекте r1: ");
                r1.showOutline();
                r1.showDim();
		if(r1.isSquare())
			System.out.println("является квадратом");
		else
			System.out.println("не является квадратом");
                System.out.println("Площадь: " + r1.area());
                System.out.println();


		System.out.println();
                System.out.println("Информация об объекте r2: ");
                r2.showOutline();
                r2.showDim();
                if(r2.isSquare())
                        System.out.println("является квадратом");
                else
                        System.out.println("не является квадратом");
                System.out.println("Площадь: " + r2.area());
                System.out.println();

		//демонстрация строгоконтроля типов
		X x = new X(10);
		X x2;
		Y y = new Y(5);
		Z z = new Z(5,6);
		x2 = x;
		x2 = z; //допустимое значение ссылки на объект класса

		x.show(); //демонстрация динамической диспетчеризации методов
		System.out.println("выполнение show() при ссылке на объект подкласса");
		x2.show();
		x2.show("переруженная версия метода из подкласса");
		z.show("строка");
		x2 = x;
		System.out.println("выполнение show() при ссылке на объект суперкласса");
		x2.show();
		System.out.println();

		System.out.println("x2.a: " + x2.a);
		//System.out.println("x2.b: " + x2.b); переменная подкласса недоступна ссылочной переменой родительского класса
		//x2 = y; недопостимое присваивание ссылки на объект друого типа

		//демонстрация выызова методов вычисления  площади для переменной суперклассса
		//
		TwoDShape[] shapes = new TwoDShape[5];

		shapes[0] = new Triangle("контурный", 8.0, 12.0);
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle("сплошная", 10, 4);
		shapes[3] = new Triangle(7.0);
		shapes[4] = new TwoDShape(10, 20, "абстрактная фигура");

		System.out.println();
		for(int i=0; i<shapes.length; i++) {
			System.out.println("имя объекта: " + shapes[i].getName());
			System.out.println("площадь: " + shapes[i].area());
			System.out.println();
		}
	}
}
