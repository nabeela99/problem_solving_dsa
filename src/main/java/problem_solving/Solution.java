package problem_solving;
import java.util.*;

//Complete the code
public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getCgpa() < o2.getCgpa()) return 1;
                if (o1.getCgpa() > o2.getCgpa()) return -1;
                if (o1.getCgpa() == o2.getCgpa()) {
                    if (o1.getFname().compareTo(o2.getFname()) == 0) {
                        return o1.getId() > o2.getId() ? 1 : -1;
                    } else {
                        return o1.getFname().compareTo(o2.getFname());
                    }
                }
                return 0;
            }
        });


        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }

    static class Student{
        private int id;
        private String fname;
        private double cgpa;
        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getFname() {
            return fname;
        }
        public double getCgpa() {
            return cgpa;
        }
    }
}






