package model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Value("Name")
    private String name;
    @Value("20")
    private int age;

    public String toString(){
       return name + " " + age;
    }
}
