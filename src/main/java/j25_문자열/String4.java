package j25_문자열;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String4 {
    public static void main(String[] args) {
        String roleString = "ROLE_USER,ROLE_MANAGER,ROLE_ADMIN,TESTER";
        String[] roleArray = roleString.split(",");
        //split 을 기준으로 배열로 나눠라.

//      ver.1
//        List<String> roleList = new ArrayList<String>();
//
//        for(String role : roleArray){
//            roleList.add(role);
//        }
//
//        System.out.println(roleList);

//        ver. 2
        List<String> roleList = Arrays.asList(roleArray);
        System.out.println(roleList);
//
//        roleList.forEach(role -> {
//            System.out.println(role);
//        });
        List<String> validRoleList = new ArrayList<String>();
        //prefix , subfix
        List<String> validRoleList2 = new ArrayList<String>();

        roleList.forEach(role->{
           if(role.startsWith("ROLE")) { //boolean 값임.
                validRoleList.add(role);
           }
        });
        System.out.println(validRoleList);
        System.out.println("----------------");

        roleList.forEach(role ->{
            if(role.endsWith("MANAGER") || role.endsWith("ADMIN")){
                   validRoleList2.add(role);
            }
        });
        System.out.println(validRoleList2);



    }
}
