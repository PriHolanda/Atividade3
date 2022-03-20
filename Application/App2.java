package Application;

import enitites.Professor;

public class App2 {
    public static void main(String[] args) {
      
        //Nome, idade, sexo, salario, formação 
        Professor p1 = new Professor("Daniboy", 40, 'M', 33000.0, "P.O.O");
	
	System.out.println(p1);
	System.out.print("Ação: ");
	p1.ensinar();
    }
}
