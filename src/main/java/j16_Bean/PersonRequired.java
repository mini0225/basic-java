package j16_Bean;
/*
    final 이 있기 때문에 NoArgsConstructor 는 하면안됨
 */

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor


public class PersonRequired {

    private final String name; //<-@RequiredArgsConstructor
    private int age;



}
