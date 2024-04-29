package week04.sample01.aaa;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        try{ //일단 실행
            ourClass.thisMethodIsDangerous();
        }catch(OurBadException e){ //예외사항이 발생하면 실행
            System.out.println(e.getMessage());
        }
        finally{ //무조건 실행
            System.out.println("무조건 실행");
        }


    }
}
