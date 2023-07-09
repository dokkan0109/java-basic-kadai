package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		int[] serviceCost = { 1000, 2000, 3000, 4000, 5000, 500 };
		System.out.println("あなたの年代を入力してください");
		int userAge = new java.util.Scanner(System.in).nextInt();
		if (userAge <= 10) {
			System.out.println(serviceCost[5] + "円");

		} else if (userAge >= 90) {
			System.out.println(serviceCost[5] + "円");
		}

		switch (userAge) {
		case 10:
			System.out.println(serviceCost[0] + "円");
			break;
		case 20:
			System.out.println(serviceCost[1] + "円");
			break;
		case 30:
			System.out.println(serviceCost[2] + "円");
			break;
		case 40:
			System.out.println(serviceCost[3] + "円");
			break;
		case 50:
			System.out.println(serviceCost[3] + "円");
			break;
		case 60:
			System.out.println(serviceCost[3] + "円");
			break;
		case 70:
			System.out.println(serviceCost[3] + "円");
			break;
		case 80:
			System.out.println(serviceCost[4] + "円");
			break;
		}

	}

}
