class pr003 {
	public static void main(String args[]) throws java.io.IOException {

		//Чтение с клавиатуры
		char ch;
		System.out.print("Нажмите клавишу на клавиатуре и ENTER ");
		ch = (char) System.in.read();
		System.out.println("Вы нажали клавишу: " + ch);
		
		//Угадывание буквы
		//Пример использования проверки условия
		char answer = 'r';
		if (ch == answer)
			System.out.println("Буква указана верно");
		else
			System.out.println("Неверная буква");

		System.out.println("\n");
		//Работа с вложенными операторами if
		int i=10, j=10, k=110, a=5, b=15, c = 25, d = 35;

		if(i==11) {
			if(j < 20)
				a = b;
			if(k > 100) 
				c = d;
			else
			       	a = c;
		}
		else a = d;
		System.out.println("a = " + a + " c = " + c + " d = " + d);

		//Цепочка if - else - if
		System.out.println("\n");
		int x;
		for (x = 0; x < 6; x++) {
			if (x == 1)
				System.out.println("Значение x равно 1");
			else if (x == 2)
				System.out.println("Значение x равно 2");
			else if (x == 3)
                                System.out.println("Значение x равно 3");
			else if (x == 4)
                                System.out.println("Значение x равно 4");
			else
                                System.out.println("Значение x не находится между 1 и 4");
		}
		//Оператор switch
		System.out.println("\n");
		int ii;
		for (ii=0; ii<10; ii++)
			switch(ii) {
				case 0:
					System.out.println("ii равно 0");
					break;
				case 1:
					System.out.println("ii равно 1");
                                        break;
				case 2:
					System.out.println("ii равно 2");
                                        break;
				case 3:
					System.out.println("ii равно 3");
                                        break;
				case 4:
					System.out.println("ii равно 4");
                                        break;
				default: 
					System.out.println("ii больше или равно 5");
			}
		}
	}
