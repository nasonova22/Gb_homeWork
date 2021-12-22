/*
 * Java 1. Homework #5
 * @autor Galina Nasonova
 * @version 21.12.2021
 */
public class HomeWorkLesson5 {
    public static void main(String[]args) {
        Person[] persArray=new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); 
        persArray[1] = new Person("Petrov Pavel", "Engineer", "papetr@mailbox.com", "89169786717", 50000, 40);
        persArray[2] = new Person("Sokolova Anna", "Manger", "ansokol@mailbox.ru", "89226717015", 45000, 45);
        persArray[3] = new Person("Moroz Denis", "Manger", "denmor@mailbox.ru", "89175432011", 45000, 25);
        persArray[4] = new Person("Krotov Max", "Designer", "maxkrot@mailbox.ru", "89134568912", 70000, 55);
        for (int i=0;i<5;i++){
            if (persArray[i].getAge()>40) {
                System.out.println (persArray[i].getFullName());
            }
        }
    }
}   
    class Person {
        public String fullName;
        public String position;
        public String email;
        public String tel;
        public int salary;
        public int age;
        
        Person (String fullName,String position,String email,String tel,int salary,int age) {
            this.fullName=fullName;
            this.position=position;
            this.email=email;
            this.tel=tel;
            this.salary=salary;
            this.age=age;
            }
            
        public String getFullName() {
            return fullName;
        }  
        
        public int  getAge() {
            return age;
        }
        
        public String toString(){
            return fullName + ", " + position + ", "+email + ", "+tel + ", "+salary+ ", "+ age +",";
        }
    }
   