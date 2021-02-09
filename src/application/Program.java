package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the numer of tax payers: ");
		int n = sc.nextInt(); //Numero de pessoas a ser adicionadas na lista
		
		for(int i=1;i<=n;i++) {
			System.out.println("Tax Payer #" + i + " data: ");
			System.out.print("Individual or Company (i/c): ");
			char opt = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double rendaAnual = sc.nextDouble();
			if(opt == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastosSaude));
			}
			if(opt == 'c') {
				System.out.print("Number of employees: ");
				int numFunc = sc.nextInt();
				list.add(new PessoaJuridica(name, rendaAnual, numFunc));
			}
		}
		
		System.out.println("\nTAXES PAID: ");
		for(Pessoa p : list) {
			System.out.println(p.getName() + ": $ " + p.imposto());
		}
		Double sum = 0.0; //Variavel para somar todos os impostos
		for(Pessoa p : list) {
			sum +=(p.imposto());
		}
		System.out.print("\nTOTAL TAXES: " + sum);
		
		sc.close();
	}

}
