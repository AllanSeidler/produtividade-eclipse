package br.com.caelum.empresa;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.empresa.modelo.Funcionario;

public class principal {
	public static void main(String[] args) {
		Calendar dataNascimento = new GregorianCalendar(1986, 3, 16);
		Funcionario funcionario = new Funcionario("Pedrinho", 12, dataNascimento);
		System.out.println(funcionario);
	}
}
