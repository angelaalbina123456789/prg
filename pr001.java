class pr001 {
	public static void main(String args[]) {
		System.out.println("Первая программа на Java");
		//Выводим строку на консоль
		int Var1 = 1024;
		int Var2345678;
		//System.out.printin(Var2); Ошибка: пееменной не присвоено 
		Var2345678 = 411;
		System.out.println(Var1/2);
		System.out.println("Результат целочисленного деления: " + Var2345678/2);
		System.out.println("Результат деления приведением ипа данных:: " + (double)Var2345678/2);
		double Var3 = (double)Var2345678/2;

		//Пример использования оператора ша
		//if(Var1 = 0)
		//	System.out.println("Условие Var1=0 выполнено"); Несовместимочть типов в условии
		if(Var1/2 == 512)
                        System.out.println("Условие \"Var1/2==512\" выполнено");
		if(true)
                        System.out.println("\tУсловие true \n\tвыполнено");
		System.out.println("Строка для проверки");
		System.out.println();

		//Пример использования оператора цикла for
		for (int i=0; i<10; i++)
			System.out.println("Строка номер " + i);
		//i = 10; Переменная i локальная и существует только во время выполнения цикла
		System.out.println();
		int j;
		for ( j=0; j<10; j++)
                        System.out.print(j + " ");
		System.out.println();


	}
}
