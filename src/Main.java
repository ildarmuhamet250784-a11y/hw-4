//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
		//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
		// to see how IntelliJ IDEA suggests fixing it.
		//task 1
		int age = 20;
		boolean adult = age >= 18;
		if (adult) {
			System.out.println("Если возраст человека равен 18 или больше, то он совершеннолетний");
		} else {
			System.out.println("Если возраст человека меньше 18, он не достиг совершеннолетия и нужно немного подождать");
		}
		//task 2
		int degrees = 10;
		boolean cold = degrees <= 5;
		if (cold) {
			System.out.println("На улице меньше 5 градусов, нужно надеть шапку");
		} else {
			System.out.println("Сегодня тепло, можно идти без шапки");
		}
		
		//task 3
		int speed = 80;
		boolean excess = speed > 60;
		if (excess) {
			System.out.println("Если скорость больше 60 км/ч, то придётся заплатить штраф");
		} else {
			System.out.println("Если скорость меньше 60 км/ч, то можно ездить спокойно");
		}
		//task 4
		int agePeople = 3;
		
		if (agePeople >= 2 && agePeople <= 6) {
			System.out.println("Если возраст человека равен от 2 до 6 лет, то ему нужно ходить в детский сад");
		}
		if (agePeople >= 7 && agePeople <= 17) {
			System.out.println("Если возраст человека равен от 7 до 17 лет, то ему нужно ходить в школу");
		}
		if (agePeople >= 18 && agePeople <= 24) {
			System.out.println("Если возраст человека равен от 18 до 24 лет, то его место в университете");
		}
		if (agePeople > 24) {
			System.out.println("Если возраст человека равен больше 24 лет, то ему пора ходить на работу");
		}
		//task 5
		int ageChildren = 16;
		if (ageChildren < 5) {
			System.out.println("Если возраст ребёнка равен меньше 5 лет, то ему нельзя кататься на атракционе");
		}
		if (ageChildren >= 5 && ageChildren <= 14) {
			System.out.println("Если возраст ребёнка равен от 5 лет и до 14 лет включительно, " +
					"то ему можно кататься на атракционе в сопровождении взрослого");
		}
		if (ageChildren > 14) {
			System.out.println("Если возраст ребёнка равен старше 14 лет, " +
					"то ему можно кататься на атракционе без сопровождения взрослого");
		}
		//task 6
		int numberOfPassengers = 102;
		if (numberOfPassengers < 60) {
			System.out.println("В вагоне есть сидящее место");
		} else if (numberOfPassengers >= 60 && numberOfPassengers < 102) {
			System.out.println("В вагоне есть стоячее место");
		} else {
			System.out.println("В вагоне нет свободных мест");
		}
		
		
		//task 7
		int one = 1;
		int two = 2;
		int three = 3;
		if (one >= two && one >= three) {
			System.out.println("Большее число one");
		} else if (two >= one && two >= three) {
			System.out.println("Большее число two");
		} else {
			System.out.println("Большее число three");
		}
		
	}
}