package br.com.caelum.empresa.modelo;
import java.util.Calendar;

public class Funcionario {

	private String nome;
	private Integer matriula;

	public Funcionario(String nome, Integer matriula, Calendar dataDeNascimento) {
		super();
		this.nome = nome;
		this.matriula = matriula;
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMatriula() {
		return matriula;
	}

	public void setMatriula(Integer matriula) {
		this.matriula = matriula;
	}

	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Calendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	private Calendar dataDeNascimento;
	
	
	
	@Override
	public String toString() {
		return "Funcionario " + this.nome;
	}
}
