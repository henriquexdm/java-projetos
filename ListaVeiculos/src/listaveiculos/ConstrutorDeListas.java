package listaveiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConstrutorDeListas {
	public static void main(String[] args) {
		List<Carros> listaDeCarros = new ArrayList<>();
		List<Motos> listaDeMotos = new ArrayList<>();
		List<Caminhoes> listaDeCaminhoes = new ArrayList<>();
		Scanner scan = new Scanner (System.in);
		boolean menuAtivo = true;
		
		while (menuAtivo) {
			System.out.println("1. Carro");
			System.out.println("2. Moto");
			System.out.println("3. Caminhão");
			
			System.out.println("\nQual veículo deseja cadastrar?");
			String opcao = scan.nextLine();
			
			if (opcao.equalsIgnoreCase("1")) {
				System.out.println("\nQuantos carros você quer adicionar?");
		        int quantidade = scan.nextInt();
		        scan.nextLine(); // Limpa o buffer do scanner

		        for (int i = 0; i < quantidade; i++) {
		            System.out.println("\nCarro " + (i + 1) + ":");

		            System.out.print("Marca: ");
		            String marca = scan.nextLine();

		            System.out.print("Modelo: ");
		            String modelo = scan.nextLine();

		            System.out.print("Ano: ");
		            int ano = scan.nextInt();
		            scan.nextLine(); // Limpa o buffer do scanner

		            // Cria o objeto Carro e adiciona à lista
		            Carros carro = new Carros(marca, modelo, ano);
		            listaDeCarros.add(carro);
		            
		            
		        }
				
			} else if (opcao.equalsIgnoreCase("2")) {
				System.out.println("\nQuantas motos você quer adicionar?");
		        int quantidade = scan.nextInt();
		        scan.nextLine(); // Limpa o buffer do scanner

		        for (int i = 0; i < quantidade; i++) {
		            System.out.println("\nMoto " + (i + 1) + ":");

		            System.out.print("Marca: ");
		            String marca = scan.nextLine();

		            System.out.print("Modelo: ");
		            String modelo = scan.nextLine();

		            System.out.print("Ano: ");
		            int ano = scan.nextInt();
		            scan.nextLine(); // Limpa o buffer do scanner

		            // Cria o objeto Moto e adiciona à lista
		            Motos moto = new Motos(marca, modelo, ano);
		            listaDeMotos.add(moto);
		        }
				
			} else if (opcao.equalsIgnoreCase("3")) {
				System.out.println("\nQuantos caminhões você quer adicionar?");
		        int quantidade = scan.nextInt();
		        scan.nextLine(); // Limpa o buffer do scanner

		        for (int i = 0; i < quantidade; i++) {
		            System.out.println("\nCaminhão " + (i + 1) + ":");

		            System.out.print("Marca: ");
		            String marca = scan.nextLine();

		            System.out.print("Modelo: ");
		            String modelo = scan.nextLine();

		            System.out.print("Ano: ");
		            int ano = scan.nextInt();
		            scan.nextLine(); // Limpa o buffer do scanner

		            // Cria o objeto Moto e adiciona à lista
		            Caminhoes caminhao = new Caminhoes(marca, modelo, ano);
		            listaDeCaminhoes.add(caminhao);
		        }
				
			} else {
				System.out.println("\nÉ pra digitar um número de 1 até 3.\n");
			}
			
			System.out.println("\nCarros\n" + listaDeCarros);
			System.out.println("\nMotos\n" + listaDeMotos);
			System.out.println("\nCaminhões\n" + listaDeCaminhoes + "\n");
		}
		scan.close();
	}
}
