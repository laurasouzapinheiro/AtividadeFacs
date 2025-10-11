package atividade1;

//Crie um array com 5 números inteiros.
//Use um for para somar todos os elementos e exibir o total.

public class ExercicioArray {

	public static void main(String[] args) {
		int nums[] = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i * 3;

		}
		for (int i = 0; i < nums.length; i++) {
		System.out.println(nums[i]);
		}
		
		
		int total = 0;
		for (int i = 0; i < nums.length; i++) {
		total = total + nums[i]; 
		}
		System.out.println(total);
		//System.out.println(total);
	}

}
