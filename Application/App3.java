package Application;

import enitites.Aluno;

public class App3 {
    public static void main(String[] args) {
        
	//Nome, idade, sexo, matricula, curso
	Aluno a1 = new Aluno("Júlia", 16, 'F', "23984", "Informática");
		
	System.out.println(a1);
	System.out.print("Ação: ");
	a1.estudar();
    }
}
