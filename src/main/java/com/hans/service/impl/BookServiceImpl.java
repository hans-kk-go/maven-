package com.hans.service.impl;

import com.hans.dao.BookDao;
import com.hans.domain.Book;
import com.hans.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        return bookDao.save(book) >0;
    }

    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    public Book getById(Integer id) {
        Book byId = bookDao.getById(id);
        return byId;
    }

    public List<Book> getAll() {
//        int i = 1 / 0;
        List<Book> all = bookDao.getAll();
        return all;
    }
}
