import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescrição("descrição curso java");
        curso1.setCArgaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescrição("descrição curso js");
        curso2.setCArgaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);


    }
}