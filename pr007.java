
class pr007 {
	public static void main(String[] args) {
		Mod ob = new Mod();
		//изменение и просмотр значения закрытой переменной существляется через методы заданного класса Mod
		ob.setAlpha(77);
		System.out.println("Значение ob.alpha: " +  ob.getAlpha());
		// прямой доступ к переменной заперщен: ob.alpha = 100;
		ob.betAa = 242;
		ob.gamma = 34;
		//пример использования класса отказ устойчивог поведения массива
		System.out.println();
		FailSoftArray fs = new FailSoftArray(5, -999);
		int x;

		//пример использования класса без вывода сообщений о неправильных  индексах
		System.out.println("скрытая от пользователя обработка ошибок: ");
		for(int i=0; i<(fs.length * 2); i++) 
			fs.put(i, i*10);

		for(int i=0; i < (fs.lenth * 2); i++) {
			x = fs.get(i);
			if(x != -999) System.out.println(x + " ");
		}
		System.out.println();

		//пример работы класса с выводом сооющений об ошибках
		
		for(int i=0; i<(fs.length * 2); i++)
                        if(!fs.put(i, i*10))
				System.out.println("Индекс " + i + " выходит за границы массива");

                for(int i=0; i < (fs.lenth * 2); i++) {
                        x = fs.get(i);
                        if(x != -999) System.out.println(x + " ");
			else 
				System.out.println("индекс " + i + " выходт за границы");
                }
                System.out.println();
	}
}
