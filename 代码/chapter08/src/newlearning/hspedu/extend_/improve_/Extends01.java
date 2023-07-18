package newlearning.hspedu.extend_.improve_;

import newlearning.hspedu.extend_.Graduate;
import newlearning.hspedu.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        newlearning.hspedu.extend_.Pupil pupil = new Pupil();
        pupil.name = "银角大王~";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(50);
        pupil.showInfo();

        System.out.println("=======");
        newlearning.hspedu.extend_.Graduate graduate = new Graduate();
        graduate.name = "金角大王~";
        graduate.age = 23;
        graduate.testing();
        graduate.setScore(80);
        graduate.showInfo();
    }
}
