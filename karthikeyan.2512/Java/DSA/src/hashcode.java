public class hashcode {
    public static void main(String[] args) {
        Student p = new Student("Karthi");
        Student p1 = new Student("Hari");
        Student p2 = p;
        p2.name = "Hari";
        System.out.println(p.name == p2.name);   // Person{name='Karthi'}
        System.out.println(p.hashCode());   // Uses Object's hashCode
    }

   static class Student {
        String name;

        Student(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "'}";
        }
    }
}
