import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
    	//CRIOU UM CURSO
    	Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        //CRIOU OUTRO CURSO
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso JavaScript");
        curso2.setCargaHoraria(4);

        //CRIOU UMA MENTORIA
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria java");
        mentoria.setData(LocalDate.now());
        
      //CRIEI UMA NOVA MENTORIA
        Mentoria mentoriaJs = new Mentoria();
        mentoriaJs.setTitulo("Mentoria JavaScript");
        mentoriaJs.setDescricao("Descrição da mentoria JavaScript");
        mentoriaJs.setData(LocalDate.now());

        //CRIOU UM BOOTCAMP 
        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Full Stack Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Full Stack Developer");
        bootcamp1.getConteudos().add(curso1); // ADICIONOU TODOS OS CURSOS E MENTORIAS CRIADOS AO BOOTCAMP
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria);
        bootcamp1.getConteudos().add(mentoriaJs);

      //CRIEI UM NOVO BOOTCAMP 
        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp JavaScript Developer");
        bootcamp2.setDescricao("Descrição Bootcamp JavaScript Developer");
        bootcamp2.getConteudos().add(curso2); // ADICIONEI APENAS CURSOS E MENTORIAS JS
        bootcamp2.getConteudos().add(mentoriaJs);
        
        //CRIOU UM DEV E MATRICULOU ELE NO BOOTCAMP
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
        devCamila.progredir(); //PROGRIDE SEGUINDO A ORDEM DO LINKED HASHSET 
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        //CRIOU OUTRO DEV E MATRICULOU TAMBÉM NO BOOTCAMP
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos Joao:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Joao:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp()); //MOSTREI O XP ANTES E DEPOIS DO PROGRESSO
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Joao:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Joao:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        
        
      //CRIEI UM NOVO DEV E MATRICULEI NO NOVO BOOTCAMP
        Dev devLarissa = new Dev();
        devLarissa.setNome("Larissa");
        devLarissa.inscreverBootcamp(bootcamp2);
        System.out.println("Conteúdos Inscritos Larissa:" + devLarissa.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Larissa:" + devLarissa.getConteudosConcluidos());
        System.out.println("XP:" + devLarissa.calcularTotalXp());
        devLarissa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Larissa:" + devLarissa.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Larissa:" + devLarissa.getConteudosConcluidos());
        System.out.println("XP:" + devLarissa.calcularTotalXp());

    }

}
