//package com.rkp.javagraphql.repository;
//
//import com.rkp.javagraphql.model.Book;
//import io.r2dbc.spi.Row;
//import io.r2dbc.spi.RowMetadata;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.r2dbc.core.DatabaseClient;
//import org.springframework.stereotype.Repository;
//import reactor.core.publisher.Mono;
//
//import java.util.Map;
//import java.util.function.BiFunction;
//
//@Repository
//public class BookRepository {
//
//    public static final BiFunction<Row, RowMetadata, Book> MAPPING_FUNCTION = (row, rowMetaData) -> Book()
//            .id(row.get("id", int.class))
//            .title(row.get("name", String.class))
//            .content(row.get("pages", int.class))
//            .build();
//    @Autowired
//    private DatabaseClient databaseClient;
//
//    public Mono<Book> getBook(int id){
//      return databaseClient.sql("select * from books where id = :id")
//              .bind("id", id)
//              .map(MAPPING_FUNCTION)
//              .one();
//    }
//}
