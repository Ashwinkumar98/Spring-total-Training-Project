package com.cts.crud.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.crud.model.Postpaid;

@Repository
public interface PostPaid extends  JpaRepository<Postpaid, Long>  {

}
