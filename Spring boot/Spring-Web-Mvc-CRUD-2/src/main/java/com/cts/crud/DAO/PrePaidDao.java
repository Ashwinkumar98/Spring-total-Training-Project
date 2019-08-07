package com.cts.crud.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.crud.model.PrepaidOffers;

@Repository
public interface PrePaidDao extends JpaRepository<PrepaidOffers, Long>  {

}
