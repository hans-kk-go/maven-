package com.hans.service;


import com.hans.config.SpringConfig;
import com.hans.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testGetById(){
        Book byId = bookService.getById(1);
        System.out.println(byId);
    }


    @Test
    public void testGetAll(){
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }

    @Test
    public void testDeleteById(){
        boolean delete = bookService.delete(2);
        System.out.println(delete);
    }

    @Test
    public void testUpdate(){
        Book book = new Book(2,"jisuanj","skdf","skdfj");

        boolean update = bookService.update(book);
        System.out.println(update);
    }

    @Test
    public void testSave(){
        Book book = new Book();
        book.setDescription("skdfj");
        book.setName("jisuanjik");
        book.setType("lishi");
        boolean save = bookService.save(book);
        System.out.println(save);
    }


}
