public class lec_20230419 {
    public static void main(String[] args) {
        /*
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info());
        System.out.println(card2.info());
         */

        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
        System.out.println(s.info());

    }

}


class SutdaCard {
    int num;
    boolean isKwang;

    public SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }


    public String info() {
        return num + (isKwang ? "K" : " ");
    }
}


class Student {
    String name; // 학생 이름
    int ban; // 반
    int no; // 번호
    int kor; // 국어 점수
    int eng; // 영어 점수
    int math; // 수학 점수

    public Student(String name, int i, int i1, int i2, int i3, int i4) {
        this.name = name;
        this.ban = i;
        this.no = i1;
        this.kor = i2;
        this.eng = i3;
        this.math = i4;
    }


    int getTotal() {
        return kor + eng + math;
    }

    float getAverage(int total) {
        //float sum = (float)((int)((float)((float) total + 0.005) * 100 )) / 100;
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }


    public String info() {
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math;
    }
}