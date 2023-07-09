package kadai_004;

public class Score_chapter04 {

	public static void main(String[] args) {
		int[] result = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int sum = result[0] + result[1] + result[2] + result[3] + result[4] + result[5] + result[6] + result[7]
				+ result[8] + result[9];
		int avg = sum / 10;
		System.out.println("Aさんの点数は" + result[0] + "点");
		System.out.println("Bさんの点数は" + result[1] + "点");
		System.out.println("Cさんの点数は" + result[2] + "点");
		System.out.println("Dさんの点数は" + result[3] + "点");
		System.out.println("Eさんの点数は" + result[4] + "点");
		System.out.println("Fさんの点数は" + result[5] + "点");
		System.out.println("Gさんの点数は" + result[6] + "点");
		System.out.println("Hさんの点数は" + result[7] + "点");
		System.out.println("Iさんの点数は" + result[8] + "点");
		System.out.println("Jさんの点数は" + result[9] + "点");
		System.out.println("テストの平均点は" + avg + "点");

	}

}
