package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Entity
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Value("BookName")
    private String name;

    private Author author;

    @Autowired
    public Book(Author author){
        this.author = author;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("post construct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("pre destroy");
    }

    public void sayHello() {
        System.out.println("Hello World!!");
        System.out.println(this.name);
        System.out.println(this.author.toString());
    }
}
