package Application;

import enitites.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Priscila", 16, 'F');
		
	System.out.println(p1);
	System.out.print("Ação: ");
	p1.comer();
    }
}
