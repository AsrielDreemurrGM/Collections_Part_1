package br.com.eaugusto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BathroomLine {
	
	public static void main(String[] args) {
		
		String nameQuestion = "Digite um nome:";
		String genderQuestion = "Digite o gênero (M ou F): ";
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Vamos adicionar quatro pessoas.");
		System.out.println(nameQuestion);
		String human1Name = s.nextLine();
		System.out.println(genderQuestion);
		String human1Gender = s.nextLine();
		
		System.out.println(nameQuestion);
		String human2Name = s.nextLine();
		System.out.println(genderQuestion);
		String human2Gender = s.nextLine();
		
		System.out.println(nameQuestion);
		String human3Name = s.nextLine();
		System.out.println(genderQuestion);
		String human3Gender = s.nextLine();
		
		System.out.println(nameQuestion);
		String human4Name = s.nextLine();
		System.out.println(genderQuestion);
		String human4Gender = s.nextLine();
		
		s.close();
		
		List<Human> everyone = new ArrayList<>();
		
		Human human1 = new Human(human1Name, human1Gender);
		Human human2 = new Human(human2Name, human2Gender);
		Human human3 = new Human(human3Name, human3Gender);
		Human human4 = new Human(human4Name, human4Gender);
		
		everyone.add(human1);
		everyone.add(human2);
		everyone.add(human3);
		everyone.add(human4);
		
		System.out.println("Todas as pessoas na fila: ");
		System.out.println(everyone);
		
		List<Human> males = new ArrayList<>();
		List<Human> females = new ArrayList<>();
		List<Human> others = new ArrayList<>();
		
		for (Human human : everyone) {
			if (human.getGender().equalsIgnoreCase("M")) {
				males.add(human);
			} else if (human.getGender().equalsIgnoreCase("F")) {
				females.add(human);
			} else {
				others.add(human);
			}
		}
		
		System.out.println("Homens: ");
		System.out.println(males);
		
		System.out.println("Mulheres: ");
		System.out.println(females);
		
		if (others.isEmpty() == false) {
			System.out.println("Outros Gêneros: ");
			System.out.println(others);
		}
	}

}
