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


public class HeartRates {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int currentYear = 2026;

    public HeartRates(String firstName, String lastName, int birthDay, int birthMonth, int birthYear) {
        this.firstName = firstName;

        this.lastName = lastName;

        this.birthDate = new Date(birthDay, birthMonth, birthYear);
    }

    public int getAge() {
        return currentYear - this.getBirthYear();
    }

    public int getMaxHeartRate() {
        return 220 - this.getAge();
    }

    public String displayTargetHeartRate() {
        double min = this.getMaxHeartRate() * 0.5;
        double max = this.getMaxHeartRate() * 0.85;

        return String.format("%.2f - %.2f bpm", min, max);
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(int day, int month, int year) {
        this.birthDate.setDay(day);

        this.birthDate.setMonth(month);

        this.birthDate.setYear(year);
    }

    // getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getBirthDate() {
        return this.birthDate.displayDate();
    }

    public int getBirthDay() {
        return this.birthDate.getDay();
    }

    public int getBirthMonth() {
        return this.birthDate.getMonth();
    }

    public int getBirthYear() {
        return this.birthDate.getYear();
    }
}
