package model;

import java.util.HashMap;
import java.util.Map;

public class Materias {
	private Map<String,String> materias = new HashMap<String,String>();
	
	public void construindoMapa(){
		//An�lise e Desenvolvimento de Sistemas
		materias.put("pmic", new String("Programa��o em Microinform�tica"));
		materias.put("adm", new String("Administra��o Geral"));
		materias.put("ingI", new String("Ingl�s I"));
		materias.put("md", new String("Matem�tica Discreta"));
		materias.put("labH", new String("Laborat�rio de Hardware"));
		materias.put("aoc", new String("Arquitetura e Organiza��o de Computadores"));
		materias.put("alp", new String("Algoritmos e L�gica de Programa��o"));
		materias.put("con", new String("Comunica��o e Express�o"));
		materias.put("engI", new String("Engenharia de Software I"));
		materias.put("cee", new String("Comunica��o e Express�o"));
		materias.put("ingII", new String("Ingl�s II"));
		materias.put("si", new String("Sistemas de Informa��o"));
		materias.put("lp", new String("Linguagem de Programa��o"));
		materias.put("cal", new String("C�lculo"));
		materias.put("soI", new String("Sistemas Operacionais I"));
		materias.put("eco", new String("Economia e Finan�as"));
		materias.put("ed", new String("Estruturas de Dados"));
		materias.put("engII", new String("Engenharia de Software II"));
		materias.put("set", new String("Sociedade e Tecnologia"));
		materias.put("ingIII", new String("Ingl�s III"));
		materias.put("ihc", new String("Intera��o Humano Computador"));
		materias.put("bd", new String("Banco de Dados"));
		materias.put("engIII", new String("Engenharia de Software III"));
		materias.put("ea", new String("Estat�stica Aplicada"));
		materias.put("ingIV", new String("Ingl�s IV"));
		materias.put("soII", new String("Sistemas Operacionais II"));
		materias.put("ts", new String("Teste de Software"));
		materias.put("mpct", new String("Metodologia da Pesquisa Cient�fico-Tecnol�gica"));
		materias.put("pdm", new String("Programa��o para Dispositivos M�veis"));
		materias.put("labBD", new String("Laborat�rio de Banco de Dados"));
		materias.put("labENG", new String("Laborat�rio de Engenharia de Software"));
		materias.put("rdc", new String("Redes de Computadores"));
		materias.put("pla", new String("Programa��o Linear e Aplica��es"));
		materias.put("ingV", new String("Ingl�s V"));
		materias.put("tgI", new String("Trabalho de Gradua��o I"));
		materias.put("sgi", new String("Seguran�a da Informa��o"));
		materias.put("ia", new String("Intelig�ncia Artificial"));
		materias.put("tei", new String("T�picos Especiais em Inform�tica"));
		materias.put("tgII", new String("Trabalho de Gradua��o II"));
		materias.put("ggti", new String("Gest�o e Governan�a de Tec. da Informa��o"));
		materias.put("emp", new String("Empreendedorismo"));
		materias.put("gp", new String("Gest�o de Projetos"));
		materias.put("ge", new String("Gest�o de Equipes"));
		materias.put("erp", new String("�tica e Responsabilidade Profissional"));
		materias.put("ingVI", new String("Ingl�s VI"));
	}

	public String getMateria(Object mat) {
		return materias.get(mat);
	}
}
