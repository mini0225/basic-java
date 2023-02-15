package j15_Object클래스;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherClassClass {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김경민", "부산");
        Teacher teacher2 = new Teacher("김경민", "부산");

        //정보를 담는 Class 클래스
        Class t_class = teacher1.getClass();

        System.out.println(t_class.getSimpleName());//클래스명
        System.out.println(t_class.getName());//패키지포함 클래스명

        Field[] fields =  t_class.getDeclaredFields();
        for( int i =0 ; i<fields.length ; i++ ){
            System.out.println(fields[i].getName());
            System.out.println(fields[i].getType());
            System.out.println(fields[i].getType().getSimpleName());
        }

        Method[] methods = t_class.getDeclaredMethods();
        for(int i =0; i<methods.length; i++){
            System.out.println(methods[i].getName());
        }

        System.out.println("------------------");

        System.out.println(teacher1.getClass() == teacher2.getClass());
        System.out.println(teacher1 instanceof Teacher);
        System.out.println(teacher1.getClass() ==Teacher.class);
        //getClass를 사용함으로써 instanceof 를 안써도된다.
        System.out.println(teacher2.getClass() ==Teacher.class);
    }
}
