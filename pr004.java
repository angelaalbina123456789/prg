class Avtomobil {
	int pass; //количество псажиров
	int v; //объем топливного бака в л.
	double rash; //расход топлива в л. на 100 км.

		    
}
class pr004 {
	public static void main(String args[]) {
		//создание экземпляров класса
		Avtomobil lada = new Avtomobil();
		int rasst;

		//присваивание значений внутренним переменным экземпляра класса
		lada.pass = 4;
		lada.v = 40;
		lada.rash = 9.5;
		
		//расчет расстояние, которое  lada проедет на полном баке
		rasst = (int) (lada.v/lada.rash * 100);

		System.out.println("лада проедет " + rasst + " км. на полном баке");	
	}
}
