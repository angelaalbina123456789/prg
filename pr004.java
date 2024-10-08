class Avtomobil {
	int pass; //количество псажиров
	int v; //объем топливного бака в л.
	double rash; //расход топлива в л. на 100 км.

	Avtomobil(int p, int V, double r) {
		pass = p;
		v = V;
		rash = r;

	}
	void rasst() {
		System.out.println("Расстояние на полном баке: " + ((int)(v/rash * 100))) ;
	}		


	int rasst2() {

		return (int)(v/rash * 100);
	}

	double fuelNeeded(int km) {
		return ((double) km/100)*rash;
	}
}
class pr004 {
	public static void main(String args[]) {
		//создание экземпляров класса
		Avtomobil lada = new Avtomobil(4, 40, 5.5);
		Avtomobil porshe = new Avtomobil(1, 100, 14.0);
		int rasst, rasst2;

		//присваивание значений внутренним переменным экземпляра класса
		/*
		lada.pass = 4;
		lada.v = 40;
		lada.rash = 5.5;

		porshe.pass = 1;
		porshe.v =100;
		porshe.rash = 14.0; 
		*/

		System.out.println("Для расстояния в 10 км нужно " + lada.fuelNeeded(10) + "литров");
		rasst=10;
		System.out.println("Для расстояния в 10 км нужно " + lada.fuelNeeded(rasst) + "литров");



		//расчет расстояние, которое  lada проедет на полном баке
		//rasst = (int) (lada.v/lada.rash * 100);
		//rasst2 = (int) (porshe.v/porshe.rash * 100);

		System.out.print("Для lada: ");
		lada.rasst();	
		rasst = lada.rasst2();
		System.out.println("Результат вызова метода rasst2(): " + rasst);


		System.out.print("Для porshe: ");
		porshe.rasst();
		System.out.println("Результат вызова метода rasst2(): " + porshe.rasst2() );
	}
}
