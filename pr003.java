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

		//Пример вложенного switch
		System.out.println();
		char ch1= 'q', ch2 = 'h';
		switch(ch1) {
			case 'q':
				System.out.println("Внешний switch");
				switch(ch2) {
					case 'q':
						System.out.println("Внешний switch");
						break;
                                        case 'h':
                                                System.out.println("Внутренний switch");
						break;

				}
				break;
			case 'h':
				System.out.println("Не выведется");
				break;
		}
		//Оператор цикла for
		//
		System.out.println("\n");
		double num, sroot, rerr;

		for(num=1.0; num < 100.0; num++) {
			sroot = Math.sqrt(num);
			System.out.println("Квадратный кореь цисла" + num + "равен" + sroot);
			//Вычеслите ошибки окруления
			rerr = num - (sroot * sroot);
			System.out.println("Ошибка округления составляет " + rerr);
			System.out.println();
		}

		int x1;

		for (x1 = 100; x1 > -100; x1 -= 5)
			System.out.println(x1);

		System.out.println("\n");

		int i7, j7;
		for (i7 = 0, j7 = 10; i7 < j7; i7++, j7--)
			System.out.println("i7 and j7: " + i7 + " " +j7);

		System.out.println("\n");

		int i8;
		char ignore;
		System.out.println("Для оствновки цикла нажмите клавишу \"S\"");
		for (i8 = 0; (char) System.in.read() != 'S'; i8++) {
			do {
                                ignore = (char) System.in.read();
                        } while (ignore != '\n');

			System.out.println("Итерация №" + i8);
		}
		
		System.out.println("\n");
		for (i8 = 0; i8 < 10;) {
			System.out.println("Итерация №" + i8);
			i8++;
		}

		System.out.println("\n");
		for (; i8 < 20;) {
			System.out.println("Итерация №" + i8);
			i8++;
		}
		
		//Бесконечный цикл:
		System.out.println("\n");
		for (;;){
			ch = (char) System.in.read();
			if(ch == 'q') break;
		}
		
		System.out.println("\n");

		int sum = 0;
		//вычисление сумм чисел от 1 до 5
		for(i8 =1; i8 <= 5; sum += i8++);
		System.out.println("Сумма чисел равна: " + sum);
		

		//Цикл while
		System.out.println("\n");
	
		ch = 'а';
		while (ch <= 'я') {
			System.out.print(ch);
			ch++;
		}
		System.out.println();

		System.out.println("\n");
		//ВЫчисление целых степеней числа 2

		int e;
		int result;
		for (int i9 = 0; i9 < 10; i9++) {
			result = 1;
			e = i9;
			while(e > 0) {
				result *=2;
				e--;
			}
			System.out.println("2 в степени " + i9 + " равно " + result);
		}

		//Цикл do-while
		System.out.println("\n");

		do {
			System.out.println("Нажмите клавишу, затем ENTER");
			ch = (char) System.in.read();
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
		} while (ch != 'q');

		//Оператор break
		
		System.out.println("\n");

                for (x1 = 100; x1 > -100; x1 -= 5) {
                        System.out.println(x1);
			if (x1 == 50) break; //прекращаем выполнение цикла

		}

		System.out.println("\n");
		
		//break c вложенными циклами
		for ( int i9=0; i9<3; i9++) {
			System.out.println("Счетчик внешнего цикла: " + i9);
			System.out.println("Сячетчик внутреннего цикла: ");
			int t = 0;
			while (t < 100) {
				if(t==10) break;
				System.out.print(t + " ");
				t++;
			}
			System.out.println();
		}
		System.out.println("Циклы закончились");
	
		//исползование оператора break с меткой
		for (int i9=1; i9<4; i9++) {
one: 			{
two: 				{
three:					{
						System.out.println("\ni9 равно: " + i9);
						if(i9==1) break one;
						if(i9==2) break two;
						if(i9==3) break three;
						//не выводится строка:
						System.out.println("Окончание цикла");
					}
					System.out.println("После блока three");
				}
				System.out.println("После блока two");
			}
			System.out.println("После блока one");
		}
		System.out.println("После цикла  for с метками");
		
		//второй пример использование оператора break с меткой
		System.out.println("\n");

		{
done:		
			for(int i9=0; i9<10; i9++) {
				for(int j9=0; j9<10; j9++) {
					for(int k9=0; k9<10; k9++) {
						System.out.println(k9 + " ");
						if(k9 == 5) break done; //переход по метке
					}
					System.out.println("После цикла к9"); // не выполнится
				}
				System.out.println("после цикла j9"); // не выполнится
			}
			System.out.println("после цикла i9"); //не выполнится
		}

		//третий пример break c меткой
		System.out.println("\n");
		//метка перед оператором for
stop1:
		for(int i9=0; i9<5; i9++) {
			for(int j9=0; j9<5; j9++) {
				if(j9 == 2) break stop1;
				System.out.println("i9 and j9: " + i9 + " " + j9);
			}
		}
		System.out.println("\n");
                for(int i9=0; i9<5; i9++) 
stop2:		{
                        for(int j9=0; j9<5; j9++) {
                                if(j9 == 2) break stop2;
                                System.out.println("i9 and j9: " + i9 + " " + j9);
                        }
                }

		//использование оператора continue 

	}
}
