import com.github.espositow.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEspositow = new Dev();
        devEspositow.setNome("Espositow");
        devEspositow.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Espositow:" + devEspositow.getConteudosInscritos());

        devEspositow.progredir();
        devEspositow.progredir();
        System.out.println("Conteúdos Inscritos Espositow:" + devEspositow.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Espositow:" + devEspositow.getConteudosConcluidos());
        System.out.println("XP:" + devEspositow.calcularTotalXp());

        System.out.println("--------");

        Dev devHevellyn = new Dev();
        devHevellyn.setNome("Hevellyn");
        devHevellyn.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Hevellyn:" + devHevellyn.getConteudosInscritos());

        devHevellyn.progredir();
        devHevellyn.progredir();
        devHevellyn.progredir();
        System.out.println("Conteúdos Inscritos Hevellyn:" + devHevellyn.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Hevellyn:" + devHevellyn.getConteudosConcluidos());
        System.out.println("XP:" + devHevellyn.calcularTotalXp());
    }
}
