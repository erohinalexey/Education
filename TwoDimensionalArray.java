import java.util.Scanner; 

class TwoDimensionalArray {

	public static void main(String[] args) {
        int i; int j;
		String OrderNumbers;
		String[][] ArrayString = new String[4][4];

        ArrayString[0][0] = "apple";
        ArrayString[0][1] = "peach";
        ArrayString[0][2] = "orange";
        ArrayString[0][3] = "grape";
        ArrayString[1][0] = "cucumber";
        ArrayString[1][1] = "tomato";
        ArrayString[1][2] = "dill";
        ArrayString[1][3] = "garlic";
        ArrayString[2][0] = "car";
        ArrayString[2][1] = "motocycle";
        ArrayString[2][2] = "boat";
        ArrayString[2][3] = "train";
        ArrayString[3][0] = "wind";
        ArrayString[3][1] = "water";
        ArrayString[3][2] = "earth";
        ArrayString[3][3] = "fire";

		i = InputNumber("first");
		j = InputNumber("second");
		System.out.println(ArrayString[i][j]);
    }
	public static int InputNumber (String OrderNumbers) {
	Scanner sc = new Scanner(System.in);
	int number;
	do {
		System.out.println("Please enter a " + OrderNumbers + " number!");
		while (!sc.hasNextInt()) {
			System.out.println("That not a number!");
			sc.next();
		}
		number = sc.nextInt();
	} while (number < 0);
	return number;
	}
}