package j25_문자열;

/*
카카오 사진받을때 파일명 바뀌는거
 */
import java.util.UUID;

public class UUIDString {
    public static void main(String[] args) {

        String uuid = UUID.randomUUID().toString();

        System.out.println(uuid);
        //578f32df-33c6-4096-b22e-e9319bc63829
        System.out.println("-----------------");
        String replaceUUID = uuid.replaceAll("-"," ");
        System.out.println(replaceUUID);
        System.out.println("-----------------");

        int uuidLength = replaceUUID.length();
        int uuidHalfIndex = uuidLength / 2;

        String leftUuid = replaceUUID.substring(0,uuidHalfIndex);
        String rightUuid = replaceUUID.substring(uuidHalfIndex);

        System.out.println(leftUuid);
        System.out.println(rightUuid);
    }
}
