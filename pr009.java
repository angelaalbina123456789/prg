//основа наследования
class TwoDShape {
	private double width;
	private double height;

	//конструктор без параметров
	TwoDShape() {
		width = height = 0.0;
	}
	//конструкторс двумяч параметрами
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}
	//конструктор объекта с одинаковыми высотой и шириной
	TwoDShape(double x) {
		width = height = x;
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
}
class Triangle extends TwoDShape {
	String style;

	//конструктор по умолчанию
	Triangle() {
		super();
		style = "отсутствует";
	}
	
	//конструктор c тремя параметрами
	Triangle(String s, double w, double h) {
		//вызов конструктора суперкласа
		super(w, h);
		//установка значений для переменных подкласса
		style = s;
	}
	//конструктор с одним параметров
	Triangle(double x) {
		super(x);
		style = "закрашенный";
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

	//конструкторы
	Rectangle() {
		super();
		outline = "отсутсвует";
	}
	Rectangle(String o, double w, double h) {
		//вызов конструктора подкласса
		super(w, h);
		//установка значений для переменных суперкласса
		outline = o;
	}

	Rectangle(double x) {
		super(x);
		outline = "сплошная";
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
class pr009 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle("контурный", 8.0, 12.0);
		Triangle t3 = new Triangle(4.0);
		Rectangle r1 = new Rectangle("сплошная", 4.0, 4.0);
		Rectangle r2 = new Rectangle(5.0);
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

	}
}
