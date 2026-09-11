/* Exercise 3.16:
Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome, sobrenome 
e data de nascimento da pessoa (consistindo em atributos separados para mês, dia e ano de nascimento). 
Sua classe deve ter um construtor que receba esses dados como parâmetros. Para cada atributo forneça métodos set e get. 
A classe também deve incluir um método que calcule e retorne a idade (em anos), um que calcule e retorne a frequência cardíaca máxima 
e um que calcule e retorne a frequência cardíaca alvo da pessoa.

Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HeartRates e
imprima as informações a partir desse objeto — incluindo nome, sobrenome e data de nascimento da pessoa — 
calcule e imprima a idade da pessoa (em anos), seu intervalo de frequência cardíaca máxima e sua frequência cardíaca alvo.

A fórmula para calcular a frequência cardíaca máxima por minuto é 220 menos a idade em anos. 
Sua frequência cardíaca alvo é um intervalo entre 50-85% da sua frequência cardíaca máxima. 
[Observação: essas fórmulas são estimativas fornecidas pela AHA]
*/

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        String userFirstName, userLastName;
        int birthDay, birthMonth, birthYear;
        HeartRates user1;

        Scanner input = new Scanner(System.in);

        System.out.print("Insert your first name: ");
        userFirstName = input.next();

        System.out.print("Insert your last name: ");
        userLastName = input.next();

        System.out.print("Your day of birth: ");
        birthDay = input.nextInt();

        System.out.printf("Your month of birth: %d/", birthDay);
        birthMonth = input.nextInt();

        System.out.printf("Your year of birth: %d/%d/", birthDay, birthMonth);
        birthYear = input.nextInt();

        user1 = new HeartRates(userFirstName, userLastName, birthDay, birthMonth, birthYear);

        System.out.printf(" %n ------------------------ %n");

        System.out.printf("Name: %s %s - Birthday: %s - %d years old %n", 
            user1.getFirstName(), user1.getLastName(), user1.getBirthDate(), user1.getAge());
        System.out.printf("Your max heart rate: %d %nYour target heart rate: %s %n%n", 
            user1.getMaxHeartRate(), user1.displayTargetHeartRate());

        input.close();
    }
}
