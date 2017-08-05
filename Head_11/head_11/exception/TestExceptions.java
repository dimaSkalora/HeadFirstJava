package head_11.exception;

public class TestExceptions {
    public static void main(String[] args) {
        String testNo = "no";
        try{
            System.out.println("Начало try");
            doRiske(testNo);
            System.out.println("Конец try");
        }catch (ScaryException se){
            System.out.println("Жуткое исключение");
        }finally {
            System.out.println("finally");
        }


        String testYes = "yes";
        try{
            System.out.println("Начало try");
            doRiske(testYes);
            System.out.println("Конец try");
        }catch (ScaryException se){
            System.out.println("Жуткое исключение");
        }finally {
            System.out.println("finally");
        }
    }

    static void doRiske(String test) throws ScaryException{
        System.out.println("Начало опасного метода");
        if("yes".equals(test))
            throw new ScaryException();
        System.out.println("Конец опаснеого метода");
        return;
    }
}
