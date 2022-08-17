import java.time.LocalDate;

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

public class Main {
	//Projeto
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("JAVA Curso");
		curso1.setDescricao("Bootcamp JAVA");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("JS Curso");
		curso2.setDescricao("Bootcamp JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria JAVA");
		mentoria.setDescricao("Mentoria sobre java");
		mentoria.setData(LocalDate.now());
		
		//System.out.println(mentoria);
		//System.out.println(curso1);
		//System.out.println(curso2);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o do bootcamp Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devVinicius = new Dev();
		devVinicius.setNome("Vin�cius");
		devVinicius.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Vincius: " + devVinicius.getConteudosInscritos());
		devVinicius.progredir();
		devVinicius.progredir();
		devVinicius.progredir();
		System.out.println("Conteudos Inscritos Vincius: " + devVinicius.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Vincius: " + devVinicius.getConteudosConcluidos());
		System.out.println("XP:" + devVinicius.calcularTotalXP());
		
		System.out.println("====");
		
		Dev devSabrina = new Dev();
		devSabrina.setNome("Sabrina");
		devSabrina.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Sabrina: " + devSabrina.getConteudosInscritos());
		devSabrina.progredir();
		System.out.println("Conteudos Inscritos Sabrina: " + devSabrina.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Sabrina: " + devSabrina.getConteudosConcluidos());
		System.out.println("XP:" + devSabrina.calcularTotalXP());
	}
}
