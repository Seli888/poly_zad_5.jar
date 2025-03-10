package org.example;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Walker {
    private String cap;
    private String boot;
    private int age;

    public void setAge(int age){
        if (age < 0){
            System.out.println("некорректный возраст");}
            else {
                this.age = age;
            }
    }
}

