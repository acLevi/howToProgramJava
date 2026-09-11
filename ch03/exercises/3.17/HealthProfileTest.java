/*
Neste exercício, você projetará uma classe HealthProfile “inicial” para uma pessoa. 
Os atributos da classe devem incluir nome, sobrenome, sexo, data de nascimento (consistindo em atributos separados para mês, dia
e ano de nascimento), altura (em metros) e peso (em quilogramas) da pessoa. Sua classe deve ter um construtor que receba esses dados.
Para cada atributo, forneça métodos set e get. A classe também deve incluir métodos que calculem e retornem a idade do usuário em anos,
intervalo de frequência cardíaca máxima e frequência cardíaca alvo (veja o Exercício 3.16), além de índice de massa corporal (IMC; veja
o Exercício 2.33). Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HealthProfile para
ela e imprima as informações a partir desse objeto — incluindo nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa ––, e
então calcule e imprima a idade em anos, IMC, intervalo de frequência cardíaca máxima e frequência cardíaca alvo. Ele também deve exibir
o gráfico de valores IMC do Exercício 2.33.
*/

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile user1HealthProfile = null;

        System.out.println(BMI.getBMI(1.7, 51.2));

        user1HealthProfile = setupUserHealthProfile(user1HealthProfile);

        System.out.println("--- USER PROFILE ---");
        System.out.printf("Name: %s %nGender: %s %nBirth date: %s %nHeight: %.1fm %nWeight: %.1fkg %n%n", 
            user1HealthProfile.getFullName(), user1HealthProfile.getGender(), user1HealthProfile.getBirthDate(), 
            user1HealthProfile.getHeight(), user1HealthProfile.getWeight());
        System.out.printf("Age: %d years old %nMax heart rate: %d %nTarget heart rate: %s %n%n", 
            user1HealthProfile.getAge(), user1HealthProfile.getMaxHeartRate(), user1HealthProfile.getTargetHeartRate());
        System.out.printf("Your BMI: %.1f %n%n %s", user1HealthProfile.getBMI(), BMI.displayBMITable());
    }

    public static HealthProfile setupUserHealthProfile(HealthProfile user) {
       String userFirstName, userLastName, userGender;
        double userWeight, userHeight;
        int userBirthDay, userBirthMonth, userBirthYear;

        Scanner input = new Scanner(System.in);

        System.out.print("Insert your first name: ");
        userFirstName = input.next();

        System.out.print("Insert your last name: ");
        userLastName = input.next();

        System.out.print("Insert your gender: ");
        userGender = input.next();

        System.out.print("Insert your weight (in kilograms): ");
        userWeight = input.nextDouble();

        System.out.print("Insert your height (in meters): ");
        userHeight = input.nextDouble();

        System.out.print("Your day of birth: ");
        userBirthDay = input.nextInt();

        System.out.printf("Your month of birth: %d/", userBirthDay);
        userBirthMonth = input.nextInt();

        System.out.printf("Your year of birth: %d/%d/", userBirthDay, userBirthMonth);
        userBirthYear = input.nextInt();
        System.out.println();

        input.close();

        user = new HealthProfile(userFirstName, userLastName, userGender, userHeight, userWeight, 
                                userBirthDay, userBirthMonth, userBirthYear);

        return user;
    }
}
