package Application;

import enitites.Bolsista;

public class App4 {
    public static void main(String[] args) {
        //Nome, idade, sexo, matricula, curso, disciplina)
	Bolsista b1 = new Bolsista("Douglas", 22, 'M', "78473", "Sistemas de Informação", "Cálculo");
		
	System.out.println(b1);
	System.out.print("Ação: ");
	b1.pesquisar();
    }
    
}
