public class Main
{
	public static void main(String[] args) {
		Person[] persArray = new Person[5];
        persArray[0] = new Person("Рогаченко Даниил", "инженер", "daniil.98@mailbox.com", 892312312, 30000, 30); 
        persArray[1] = new Person("Салихов Салих", "программист", "salikh.2003@mail.com", 877777777, 50000, 18);
        persArray[2] = new Person("Петров Петр", "заместитель директора", "petrov@yande.com", 879767472, 100000, 45);
        persArray[3] = new Person("Базаров Евгений", "системный аналитик", "jenia@google.ru", 839745632, 80000, 41);
        persArray[4] = new Person("Солопов Александр", "директор", "f.s.v@bing.ru", 880053475, 200000, 55);
        for (int i = 0; i < persArray.length; i++){
            persArray[i].age();
	}
}
}
class Person
{   String FIO;
    String position;
    String email;
    int phone;
    int salary;
    int age;
    public Person(String FIO, String position, String email, int phone, int salary, int age){
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary =  salary;
        this.age = age;
    }
    
    public void print(){
        System.out.println (FIO + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age);
    }
    public void age(){
        if (age > 40){
            System.out.println (FIO + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age);
        }
    }
    }
