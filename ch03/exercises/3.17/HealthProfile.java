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

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private Date birthDate;
    private double weight;
    private double height;
    private HeartRates userHeartRates;

    public HealthProfile(String firstName, String lastName, String gender, double height, double weight, int birthDay, int birthMonth, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.birthDate = new Date(birthDay, birthMonth, birthYear);
        this.userHeartRates = new HeartRates(firstName, lastName, birthDay, birthMonth, birthYear);
    }

    public int getMaxHeartRate() {
        return this.userHeartRates.getMaxHeartRate();
    }

    public String getTargetHeartRate() {
        return this.userHeartRates.displayTargetHeartRate();
    }

    public double getBMI() {
        return BMI.getBMI(this.height, this.weight);
    }

    // getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return String.format("%s %s", this.firstName, this.lastName);
    }

    public String getGender() {
        return this.gender;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getHeight() {
        return this.height;
    }

    public String getBirthDate() {
        return birthDate.displayDate();
    }

    public int getAge() {
        return userHeartRates.getAge();
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    } 

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBirthDate(int day, int month, int year) {
        this.birthDate = new Date(day, month, year);
    }
}
