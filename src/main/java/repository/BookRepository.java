package repository;

import model.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Book book) {
       sessionFactory.getCurrentSession().saveOrUpdate(book);
    }
}
