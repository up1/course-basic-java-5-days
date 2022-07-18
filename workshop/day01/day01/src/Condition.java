public class Condition {

    public static void main(String[] args) {
        int score = 60;
        String grade = "F";

        if (!(score >= 80 && score >= 70)) {

        } else if (score >= 70) {

        }
        grade = (score >= 80)? "A" : "B";
        System.out.println(grade);
    }

}
