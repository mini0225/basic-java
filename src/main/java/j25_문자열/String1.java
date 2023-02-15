package j25_문자열;

public class String1 {
    public static void main(String[] args) {

        String filePath = "C:/Users/junil/java-study/src/main/java/String.java";
        String filePath2 = "C:/Users/junil/project/java-study2/src/main/java/Integer.java";

        /*
        subString() - 문자열 자르기
        indexOf() - 내가찾는 문자열의 위치 인덱스를 반환
        String projectName = "java-study";
        String fileName= "String";
        String extension = ".java";
         */


        int srcIndex = filePath.indexOf("/src"); //일치하는놈의 시작 인덱스를 갖고온다.

        String projectPath1 = filePath.substring(0,srcIndex);
        String projectPath2 = filePath2.substring(0,srcIndex);

        String projectName1 = projectPath1.substring(projectPath1.lastIndexOf("/")+1);
        String fileName1 = filePath.substring(filePath.lastIndexOf("/")+1, filePath.lastIndexOf("."));
        String extension1 = filePath.substring(filePath.lastIndexOf("."));

        System.out.println("프로젝트명 : "+projectName1);
        System.out.println("파일명 : "+fileName1);
        System.out.println("확장자 : "+extension1);

        System.out.println("---------------------------");

        String projectName2 = projectPath2.substring(projectPath2.lastIndexOf("/")+1);
        String fileName2 = filePath2.substring(filePath2.lastIndexOf("/")+1, filePath2.lastIndexOf("."));
        String extension2 = filePath2.substring(filePath2.lastIndexOf("."));

        System.out.println("프로젝트명 : "+projectName2);
        System.out.println("파일명 : "+fileName2);
        System.out.println("확장자 : "+extension2);
    }
}
