package view;

import model.Arvore;

public class Main {
	public static void main(String[] args) {
	char[] vetor = {'K', 'D', 'M', 'B', 'F', 'C', 'L', 'T', 'P', 'Z','R'};
	Arvore arvore = new Arvore();
	
	for (char i : vetor) {
		arvore.insert(i);
	}
	try {
		arvore.remove('M');
		System.out.print("pré-ordem: ");
        arvore.prefixSearch();
        System.out.println();
        System.out.print("ordem: ");
        arvore.infixSearch();
        System.out.println();
        System.out.print("pós-ordem: ");
        arvore.postfixSearch();
        System.out.println();
		arvore.search('R');
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}

	System.out.println();
}
}
