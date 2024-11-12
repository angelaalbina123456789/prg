//основа наследования
class TwoDShape {
	double width;
	double height;
	void showDim() {
		System.out.println("Ширина и высота: " + width + " and " + height);
	}
}
class Triangle extends TwoDShape {
	String style;

	double area() {
		return width*height/2;
	}
	void showStyle() {
		System.out.println("Стиль: " + style);
	}
}

class pr009 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		t1.width = 4.0;
		t1.height = 4.0;
		t1.style = "закрашенный";
		t2.width = 8.0;
                t2.height = 12.0;
                t2.style = "контурный";
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

	}
}
