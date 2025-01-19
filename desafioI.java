package Desafios;

public class DesafioI {
    public static void main(String[] args) {
        /* Criar 3 ninja da aldeia da folha
         * Time 7 - Naruto, Sakura e Sasuke
         * definir nome, idade, missões realizadas, missões atribnuídas, dificuldade e status da conclusão
         *
         */

        // Ninja 1
        String nameNinja1 = "Naruto Uzumaki";
        int age1 = 14;
        String mission1 = "Rastrear Bandidos";
        String missionStatus1 = "Em Andamento";
        char missionNivel1 = 'A';
        String reason1 = "";

        // Ninja 2
        String nameNinja2 = "Sasuke Uchiha";
        int age2 = 14;
        String mission2 = "Reconhecimento de Aldaeia Inimiga";
        String missionStatus2 = "Em Andamento";
        char missionNivel2 = 'S';
        String reason2 = "";

        // Ninja 3
        String nameNinja3 = "Sakura Haruno";
        int age3 = 14;
        String mission3 = "Curandeira dos feridos de Missões";
        String missionStatus3 = "Concluído";
        char missionNivel3 = 'D';
        String reason3 = "";

        // Verificadores 1
        if (age1 < 15 && !(missionNivel1 == 'C' || missionNivel1 == 'D')) {
            missionStatus1 = "Reprovada";
            reason1 = "Ninjas menores de 15 anos só podem participar de Nível C ou D \n" +
                    "e a missão atual é " + missionNivel1;
        } else {
            missionStatus1 = "Aprovada";
            reason1 = "- - -";
        }

        // Verificadores 2
        if (age2 < 15 && !(missionNivel2 == 'C' || missionNivel2 == 'D')) {
            missionStatus2 = "Reprovada";
            reason2 = "Ninjas menores de 15 anos só podem participar de Nível C ou D \n" +
                    "e a missão atual é " + missionNivel1;
        } else {
            missionStatus2 = "Aprovada";
            reason2 = "- - -";
        }

        // Verificadores 3
        if (age3 < 15 && !(missionNivel3 == 'C' || missionNivel3 == 'D')) {
            missionStatus3 = "Reprovada";
            reason3 = "Ninjas menores de 15 anos só podem participar de Nível C ou D \n" +
                    "e a missão atual é " + missionNivel1;
        } else {
            missionStatus3 = "Aprovada";
            reason3 = "- - -";
        }


        // Imprime Ninja 1
        System.out.println("-----------------------");
        System.out.println("Ninja = " + nameNinja1);
        System.out.println("Idade = " + age1);
        System.out.println("Missão = " + mission1);
        System.out.println("Status= " + missionStatus1);
        System.out.println("Dificuldade = " + missionNivel1);
        System.out.println("Motivo = " + reason1);
        System.out.println("---------------------------------");

        // Imprime Ninja 2
        System.out.println("---------------------------------");
        System.out.println("Ninja = " + nameNinja2);
        System.out.println("Idade = " + age2);
        System.out.println("Missão = " + mission2);
        System.out.println("Status= " + missionStatus2);
        System.out.println("Dificuldade = " + missionNivel2);
        System.out.println("Motivo = " + reason2);
        System.out.println("---------------------------------");

        // Imprime Ninja 3
        System.out.println("---------------------------------");
        System.out.println("Ninja = " + nameNinja3);
        System.out.println("Idade = " + age3);
        System.out.println("Missão = " + mission3);
        System.out.println("Status= " + missionStatus3);
        System.out.println("Dificuldade = " + missionNivel3);
        System.out.println("Motivo = " + reason3);
        System.out.println("---------------------------------");


    }

}
