public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задание 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 3;
        System.out.println(friend);
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Задание 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var sumWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров равен " + sumWeight + " кг.");
        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе 2 боксеров равна  " + differenceWeight + " кг.");
        System.out.println("Задание 7");
        var differenceWeight1 = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Первый способ: Разница в весе 2 боксеров равна  " + differenceWeight1 + " кг.");
        var differenceWeight2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Второй способ: Разница в весе 2 боксеров равна  " + differenceWeight2 + " кг.");
        System.out.println("Задание 8");
        var totalHoursNumber = 640;
        var hoursPerWorker = 8;
        var workersNumber = totalHoursNumber / hoursPerWorker;
        System.out.println("Всего работников в компании —  " + workersNumber + " человек.");
        workersNumber = workersNumber + 94;
        totalHoursNumber = workersNumber * hoursPerWorker;
        System.out.println("Если в компании работает  " + workersNumber + " человек, то всего " + totalHoursNumber + " часов работы может быть поделено между сотрудниками.");

    }
}