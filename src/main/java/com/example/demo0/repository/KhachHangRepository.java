package com.example.demo0.repository;

import com.example.demo0.model.Khachhang;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends CrudRepository<Khachhang, String> {
//Optional<Khachhang> findByTenkhachhang(String ten);
//@Query(value = "select * from khachhang where name like ?")
//    Optional<Khachhang>
   // @Query(value = "select e from khachhang e where e.name like ?1")
   // List<Khachhang> searchByName(String searchName);
    @Query(value = "select * from khachhang  where tenkhachhang like %:searchName%",nativeQuery = true)
    Iterable<Khachhang> findAllByTenkhachhang(@Param("searchName") String searchName);
}
